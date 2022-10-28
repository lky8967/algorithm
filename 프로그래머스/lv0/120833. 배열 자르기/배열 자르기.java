import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]);
            
            answer = Arrays.copyOfRange(numbers, num1, num2+1);

        }
        return answer;
    }
}