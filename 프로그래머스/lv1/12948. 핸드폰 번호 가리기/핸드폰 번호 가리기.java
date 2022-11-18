class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] numberArr = phone_number.split("");
        for(int i = 0 ; i < numberArr.length; i++){
            if( i < numberArr.length-4){
                answer = answer + "*";
            }
            else {
                answer = answer + numberArr[i];
            }
        }
        
        
        return answer;
    }
}