import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length];
 
        for(int i = num_list.length-1  ; i >= 0 ; i--){
            // num_list.length-1 = 4
            // i는 거꾸로 4 3 2 1 0 돈다 
            // 그러므로 for문 첫번째 라인에서
            // 이렇게 된다 answer[4 - 4] =  num_list[4];
            answer[num_list.length-1-i]=num_list[i];
        }
        
        return answer;
    }
}

