import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        // int[] answer = {};
        int [] answer = new int[emergency.length];

        // 배열값 비교 , 자신보다 높은값이 있으면 순서 배열에 +1해줌
        for(int i = 0 ; i < emergency.length; i++){
            for(int j = 0 ; j < emergency.length; j++ ){
                if(emergency[i] < emergency[j]){
                    answer[i]++;
                }
            }
            // 순서배열의 모든값에 +1해줌 ( 순서라서 0이 아니라 1부터 시작하기 위함)
            answer[i]++;
        }
        
        return answer;
    }
}