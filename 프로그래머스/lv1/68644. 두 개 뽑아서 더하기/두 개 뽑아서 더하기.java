import java.util.*;
class Solution {
        public int[] solution(int[] numbers) {
            int t = 0;
            ArrayList<Integer> arrList = new ArrayList<>();
            for (int i = 0; i < numbers.length-1; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    t = numbers[i] + numbers[j];
                    if(!arrList.contains(t)) { 
                        arrList.add(t);   
                    }
                }
            }
            Collections.sort(arrList);

            int[] answer = new int[arrList.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = arrList.get(i);
            }

            return answer;
        }
    }