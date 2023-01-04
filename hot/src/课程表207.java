import java.util.ArrayList;
import java.util.List;

public class 课程表207 {
}
class Solution207 {
    //list存放每门课程的后续课程
    List<List<Integer>> list=new ArrayList<>();
    int[] visit;
    boolean valid=true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visit=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] value:prerequisites){
            list.get(value[1]).add(value[0]);
        }
        for(int i=0;i<numCourses&&valid;i++){
            dfs(i);
        }
        return valid;
    }

    private void dfs(int i) {
        visit[i]=1;
        for(int v:list.get(i)){
            if(visit[v]==0){
                dfs(v);
                if(!valid){
                    return;
                }
            }else if(visit[v]==1){
                valid=false;
                return;
            }
        }
        visit[i]=2;
    }
}
