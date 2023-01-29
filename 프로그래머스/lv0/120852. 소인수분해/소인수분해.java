import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int i = 2;
        List<Integer> arr = new ArrayList<Integer>();
		
		while( n >= i) {
			if( n % i == 0){
			    arr.add(i);
				n /= i;
            } else {
				i++;
			} 
        }
        answer = arr.stream().distinct().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}