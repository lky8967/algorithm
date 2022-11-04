import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 1 ; i <= n ; i++ ){
            if(i % 2 != 0 ){
                System.out.print(i);
                arrList.add(i);
            }
        }
        answer = new int[arrList.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}