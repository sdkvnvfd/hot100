import java.util.HashSet;

public class 无重复字符的最长子串03 {
    public static void main(String[] args) {
        Solution03 s03=new Solution03();
        String s="pwwkew";
        System.out.println(s03.lengthOfLongestSubstring(s));
    }
}
class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int left=0;
        int right=0;
        int maxLength=0;
        HashSet<Character> set=new HashSet<>();
        while(right<len){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }
        return maxLength;
    }
}
