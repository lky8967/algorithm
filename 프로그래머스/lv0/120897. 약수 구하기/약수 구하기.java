import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<Integer>();
        
        int cnt = 0;
        int q = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                // System.out.print(i);
                // cnt++;
                // answer = new int[cnt];
                // answer[] = i;
                arrList.add(i);
            }
        }
        answer = new int[arrList.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}