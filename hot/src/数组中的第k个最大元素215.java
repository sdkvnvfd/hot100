import java.util.PriorityQueue;

public class 数组中的第k个最大元素215 {
    public static void main(String[] args) {
        Solution215 s215=new Solution215();
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(s215.findKthLargest(nums,k));
    }
}
class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        //构建小顶堆
        PriorityQueue<Integer> que=new PriorityQueue<>((pair1,pair2)->pair1-pair2);
        for (int num:nums){
            if(que.size()<k){
                que.add(num);
            }else{
                if(que.peek()<num){
                    que.poll();
                    que.add(num);
                }

            }
        }
        return que.poll();
    }
}
