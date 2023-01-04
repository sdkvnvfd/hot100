import java.util.Arrays;

public class 多数元素169 {
    public static void main(String[] args) {
        Solution169 s169=new Solution169();
        int[] nums={3,2,3};
        System.out.println(s169.majorityElement(nums));
    }
}
class Solution169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
