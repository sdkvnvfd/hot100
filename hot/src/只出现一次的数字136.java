import java.util.Arrays;

public class 只出现一次的数字136 {
    public static void main(String[] args) {
        Solution136 s136=new Solution136();
        int[] nums={2,1,2};
        System.out.println(s136.singleNumber(nums));
    }
}
class Solution136 {
    //使用异或运算，异或具有交换律，0^n=n,n^n=0,由于只有一个元素只有一位，别的成对元素两两抵消为0，0与目标值异或得出目标值通过异或找出
    public int singleNumber(int[] nums) {
        int num=nums[0];
        if(nums.length>1){
            for(int i=1;i<nums.length;i++)
                num=num^nums[i];
        }
        return num;
    }
}
