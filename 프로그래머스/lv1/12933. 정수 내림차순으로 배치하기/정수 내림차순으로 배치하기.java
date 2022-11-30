import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String test= String.valueOf(n);

        List<Character> list = new ArrayList<Character>();  
 
        for (int i = 0; i < test.length(); i++) {    
            list.add(test.charAt(i));
        }
 
	    list.sort(Comparator.reverseOrder()); 
	
        String temStr = ""; 
        for (int i = 0; i < list.size(); i++) { 
            temStr += list.get(i);
        }
		
	return Long.parseLong(temStr);  
    }
}