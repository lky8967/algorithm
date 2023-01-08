class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ArrStr = my_string.replaceAll("[^0-9]", "").split("");
        for(int i = 0 ; i < ArrStr.length ; i++){
            System.out.print(ArrStr[i]);
            answer = answer + Integer.parseInt(ArrStr[i]); 
            
        }
        return answer;
    }
}