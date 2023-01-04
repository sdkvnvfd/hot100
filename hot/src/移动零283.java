import java.util.Arrays;

public class 移动零283 {
    public static void main(String[] args) {
        Solution283 s283=new Solution283();
        int[] nums={0,1,0,3,12};
        s283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution283 {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int i=0;
        for(int j=0;j<len;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
        }
        while(i<len)
            nums[i++]=0;
    }
}
