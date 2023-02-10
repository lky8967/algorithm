import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        float[] sum = new float[score.length];
        
        for(int i = 0 ; i < score.length; i++){
            sum[i] = (float)((score[i][0] + score[i][1]) / 2.0);  
        }
        for(int j = 0; j < score.length; j++) {
            int order = 1;
            for(int k = 0; k < score.length; k++) {
                if(sum[j] < sum[k]) order++;
                answer[j] = order;
            }
        }
        
        return answer;
    }
}