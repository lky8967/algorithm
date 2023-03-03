import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_t=0;
        int max_h=0;
        for(int i = 0 ; i < sizes.length ; i++ ){
            int t = Math.max(sizes[i][0],sizes[i][1]);
            int h = Math.min(sizes[i][0],sizes[i][1]);
            max_t = Math.max(max_t,t);
            max_h = Math.max(max_h,h);
        }
        answer = max_t * max_h ; 
        return answer ;
    }
}
