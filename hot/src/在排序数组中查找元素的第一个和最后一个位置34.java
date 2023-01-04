import java.util.Arrays;

public class 在排序数组中查找元素的第一个和最后一个位置34 {
    public static void main(String[] args) {
        Solution34 s34=new Solution34();
        int[] nums={5,7,7,8,8,10};
        int target=1;
        System.out.println(Arrays.toString(s34.searchRange(nums,target)));

    }
}
class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left=low_bounds(nums,target);
        int[] res=new int[2];
        if(left==nums.length||nums[left]!=target){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int right=low_bounds(nums,target+1)-1;
        res[0]=left;
        res[1]=right;
        return res;
    }
    //返回最小的满足 nums[i] >= target 的 i
    public int low_bounds(int[] nums,int target){
        int len = nums.length;
        int left = 0;
        int right = len ;
        int[] num = new int[2];
        while (left <right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid ;
            }
        }
        return left;
    }
}
