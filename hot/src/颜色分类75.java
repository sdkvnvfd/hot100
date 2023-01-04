import java.util.Arrays;

public class 颜色分类75 {
    public static void main(String[] args) {
        Solution75 s75 =new Solution75();
        int[] nums={2,0,2,1,1,0};
        s75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution75 {
    public void sortColors(int[] nums) {
        int len=nums.length;
//        for(int i=0;i<len-1;i++){
//            for(int j=1;j<len-i;j++){
//                if(nums[j]<nums[j-1]){
//                    int temp=nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                }
//            }
//        }
        int left=0;
        int right=len-1;
        for(int i=0;i<=right;i++){
            if(nums[i]==0){
                swap(nums,i,left);
                left++;
            }
            if(nums[i]==2){
                swap(nums,i,right);
                right--;
                i--;
            }
        }
    }
    public void swap(int[] num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}
