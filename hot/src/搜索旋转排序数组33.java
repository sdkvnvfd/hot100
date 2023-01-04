import java.util.Arrays;

public class 搜索旋转排序数组33 {
    public static void main(String[] args) {
        Solution33 s33=new Solution33();
        int[] nums={3,1};
        int target=1;
        int res=s33.search(nums,target);
        System.out.println(res);
        //System.out.println(s33.search(nums,target));
    }
}
class Solution33 {
    public int search(int[] nums, int target) {
        int len=nums.length;
        int k=0;
        for(int i=1;i<len;i++){
            if(nums[i]<nums[i-1]){
                k=i;  //若数组为旋转过的，则定会出现某个后面的数大于前面，用k标记
                break;
            }
        }

        int[] num=new int[len];
        //若k==0说明没有旋转数组，则不用求原始数组
        if(k==0){
            num=nums;
        }else{
            int t=0;
            for(int i=k;i<len;i++){
                num[t++]=nums[i];
            }
            for(int i=0;i<k;i++){
                num[t++]=nums[i];
            }
        }
        int left=0;
        int right=len-1;
        int index=-1;
        while(left<=right){
            int mid=left+((right-left)>>1);
            if(num[mid]>target){
                right=mid-1;
            }else if(num[mid]<target){
                left=mid+1;
            }else{
                index= mid;
                break;
            }
        }
        if(index==-1){
            return -1;
        }else if(index<len-k){
            return index+k;
        }else if(index>=len-k){
            return index-(len-k);
        }
        return -1;
    }
}
