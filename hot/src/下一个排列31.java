import java.util.Arrays;

public class 下一个排列31 {
    public static void main(String[] args) {
        Solution31 s31=new Solution31();
        int[] nums={5,4,7,5,3,2};
       s31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }
}
class Solution31 {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        int j=len-1;
        for(j=len-1;j>=1;j--){
            if(nums[j]>nums[j-1]){
                int i=j-1;
                //从后往前找到第一个升序序列，i为要交换的左边位置，此时j右边为降序，
                // 从后往前找到第一个比nums[i]大的数，进行交换。
                for(int k=len-1;k>=j;k--){
                    if(nums[k]>nums[i]){
                        int temp=nums[k];
                        nums[k]=nums[i];
                        nums[i]=temp;
                        int n=len-1-j;
                        //将右边排为升序，则数最小
                        for(int ii=0;ii<n;ii++){
                            for(int kk=j+1;kk<len-ii;kk++){
                                if(nums[kk]<nums[kk-1]){
                                    int tp=nums[kk-1];
                                    nums[kk-1]=nums[kk];
                                    nums[kk]=tp;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        if(j<=0){
            Arrays.sort(nums);
        }
    }
}
