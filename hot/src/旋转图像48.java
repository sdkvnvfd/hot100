import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;

public class 旋转图像48 {
    public static void main(String[] args) {
        Solution48 s48=new Solution48();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        s48.rotate(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Solution48 {
    public void rotate(int[][] matrix) {
        updown(matrix);
        mainduicheng(matrix);
    }
    //上下对称
    public void updown(int[][] matrix){
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row/2;i++){
            for(int j=0;j<column;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[row-i-1][j];
                matrix[row-i-1][j]=temp;
            }
        }
    }
    public void mainduicheng(int[][] matrix){
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
