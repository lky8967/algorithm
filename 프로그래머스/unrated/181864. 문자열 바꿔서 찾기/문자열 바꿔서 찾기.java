class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String s = "";
        
        for(int i = 0; i < myString.length(); i++) {
            if("A".equals(myString.substring(i,i+1))) {
                s += "B";
            } else {
                s += "A";
            }
        }
        
        if(s.contains(pat)) {
        	answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}