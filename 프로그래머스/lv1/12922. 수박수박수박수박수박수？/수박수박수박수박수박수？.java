class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i = 0 ; i < n ; i++){
            System.out.print(i);
            if(i % 2 == 1){
                answer = answer + '박';
            } else {
                answer = answer + '수';
            }
        } 
        
        return answer;
    }
}