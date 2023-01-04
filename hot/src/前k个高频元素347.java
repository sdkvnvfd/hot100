import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 前k个高频元素347 {
    public static void main(String[] args) {
        Solution347 s347=new Solution347();
        int[] nums={4,1,-1,2,-1,2,3};
        int k=2;
        int[] res=s347.topKFrequent(nums,k);
        System.out.println(Arrays.toString(res));
    }
}
class Solution347 {
//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        }
//        PriorityQueue<int[]> que=new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
//        for(Map.Entry<Integer,Integer> mapEntry:map.entrySet()){
//            int num=mapEntry.getKey();
//            int count=mapEntry.getValue();
//            if(que.size()<k){
//                que.offer(new int[]{num,count});
//            }else{
//                if(count>que.peek()[1]){
//                    que.poll();
//                    que.offer(new int[]{num,count});
//                }
//            }
//        }
//        int[] res=new int[k];
//        for(int i=k-1;i>=0;i--){
//            res[i]=que.poll()[0];
//        }
//        return res;
//    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> que=new PriorityQueue<>((pair1,pair2)->map.get(pair1)-map.get(pair2));
        for(Map.Entry<Integer,Integer> mapEntry:map.entrySet()){
            if(que.size()<k){
                que.offer(mapEntry.getKey());
            }else{
                if(mapEntry.getValue()>map.get(que.peek())){
                    que.poll();
                    que.offer(mapEntry.getKey());
                }
            }
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=que.poll();
        }
        return res;
    }
}
