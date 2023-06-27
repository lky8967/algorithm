import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) arr[i] = 0;
            }
            if(arr[i] != 0) answerList.add(arr[i]);
        }
        
        int[] answer = new int[answerList.size()];

        for(int i = 0 ; i < answer.length ; i++) {

            answer[i] = answerList.get(i);
        }

        return answer;
    }
}