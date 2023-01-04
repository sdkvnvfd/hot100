import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 合并区间56 {
    public static void main(String[] args) {
        Solution56 s56=new Solution56();
        int[][] ints={{1,4},{0,4}};
        int[][] res=s56.merge(ints);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {    // 匿名内部类
            @Override
            public int compare(int[] e1, int[] e2) {
                // 如果第一列元素相等，则比较第二列元素
                if (e1[0]==e2[0]) return e1[1]-e2[1];   // e1[1]-e2[1]表示对于第二列元素进行升序排序
                return e1[0]-e2[0];                     // e1[0]-e2[0]表示对于第一列元素进行升序排序
            }
        });
        int row=intervals.length;
        int col=intervals[0].length;
        int right=intervals[0][1];
        int left=intervals[0][0];
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<row;i++){
            int[] temp=new int[2];
          if(intervals[i][0]<=right){
              intervals[i][0]=left;
              intervals[i][1]=intervals[i][1]>right?intervals[i][1]:right;
              left=intervals[i][0];
              right=intervals[i][1];
          }else{
              temp[0]=left;
              temp[1]=right;
              list.add(temp);
              left=intervals[i][0];
              right=intervals[i][1];
          }
        }
        int[] num=new int[2];
        num[0]=left;
        num[1]=right;
        list.add(num);
        int l=list.size();
        int[][] res=new int[l][2];
        for(int i=0;i<l;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
