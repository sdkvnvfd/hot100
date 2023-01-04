import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 字母异位词分组49 {
    public static void main(String[] args) {
        Solution49 s49=new Solution49();
        String[] strs={};
        System.out.println(s49.groupAnagrams(strs));
    }
}
class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int[] count=new int[26];
            for(int j=0;j<s.length();j++){
                count[s.charAt(j)-'a']++;
            }
            String ss="";
            for(int k=0;k<26;k++){
                if(count[k]!=0){
                    char mod= (char) (k+'a');
                    ss=ss+count[k]+mod;
                }
            }
            if(!map.containsKey(ss)){
                List<String> list=new ArrayList<>();
                list.add(s);
                map.put(ss,list);
            }else{
                List<String> list=map.get(ss);
                map.remove(ss);
                list.add(s);
                map.put(ss,list);
            }
        }
        for(String key:map.keySet()){
            res.add(map.get(key));
        }
        return res;
    }
}
