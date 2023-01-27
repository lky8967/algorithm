import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        String test1 = new String(arr1);
        String test2 = new String(arr2);
        
        if(test1.equals(test2)){
            answer = 1;
        }

        return answer;
    }
}