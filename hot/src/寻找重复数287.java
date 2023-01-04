public class 寻找重复数287 {
    public static void main(String[] args) {
        Solution287 s287=new Solution287();
        int[] nums={1,3,4,2,2};
        System.out.println(s287.findDuplicate(nums));
    }
}
class Solution287 {
    public int findDuplicate(int[] nums) {
        int len=nums.length;
        int left=1;
        int right=len-1;

        while(left<right){
            int count=0;
            int mid=(left+right)/2;
            for(int i=0;i<len;i++){
                if(nums[i]<=mid)
                    count++;
            }
            if(count>mid){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
