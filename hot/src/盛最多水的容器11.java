public class 盛最多水的容器11 {
    public static void main(String[] args) {
        Solution11 s11=new Solution11();
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(s11.maxArea(height));
    }
}
class Solution11 {
    public int maxArea1(int[] height) {
        int len=height.length;
        int max=0;
        for(int j=1;j<len;j++){
            for(int i=0;i<j;i++){
                int length=j-i;
                int gao=height[j]>height[i]?height[i]:height[j];
                int count=length*gao;
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public int maxArea(int[] height){
        int len=height.length;
        int i=0;
        int j=len-1;
        int max=0;
        while(i<j){
            if(height[i]<height[j]){
                max=Math.max(max,height[i]*(j-i));
                i++;
            }else{
                max=Math.max(max,height[j]*(j-i));
                j--;
            }
        }
        return max;
    }
}
