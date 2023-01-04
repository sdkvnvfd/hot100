public class 单词搜索79 {
    public static void main(String[] args) {
        Solution79 s79=new Solution79();
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        System.out.println(s79.exist(board,word));
    }
}
class Solution79 {
     static final int[][] dire={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int len=word.length();
        if(row==0)
            return false;
        int col=board[0].length;
        int[][] visited=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(dfs(board,visited,word,i,j,0))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int[][] visited,String word,int i,int j,int index){
        if(index==word.length()-1)
            return board[i][j]==word.charAt(index);
        if(board[i][j]==word.charAt(index)){
            visited[i][j]=1;
            for (int[] dir:dire) {
                int newX=i+dir[0];
                int newY=j+dir[1];
                if(newX>=0&&newX<board.length&&newY>=0&&newY<board[0].length){
                    if(visited[newX][newY]==0){
                        if(dfs(board,visited,word,newX,newY,index+1))
                            return true;
                    }
                }
            }
            visited[i][j]=0;
        }
        return false;
    }
}
