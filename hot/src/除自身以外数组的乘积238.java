import java.util.Arrays;

public class 除自身以外数组的乘积238 {
    public static void main(String[] args) {
        Solution238 s238=new Solution238();
        int[] nums={1,2,3,4};
        int[] res=s238.productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }
}
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        //利用辅助左右数组，left代表i左边的乘积，right代表i右边所有元素的乘积
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=1;
        for(int i=1;i<len;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[len-1]=1;
        for(int i=len-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }

    public int[] productExceptSelf1(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        //不构建辅助数组，空间复杂度为o(1)
        // answer[i] 表示索引 i 左侧所有元素的乘积
        // 因为索引为 '0' 的元素左侧没有元素， 所以 answer[0] = 1
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // R 为右侧所有元素的乘积
        // 刚开始右边没有元素，所以 R = 1
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
            // 对于索引 i，左边的乘积为 answer[i]，右边的乘积为 R
            answer[i] = answer[i] * R;
            // R 需要包含右边所有的乘积，所以计算下一个结果时需要将当前值乘到 R 上
            R *= nums[i];
        }
        return answer;
    }


}
