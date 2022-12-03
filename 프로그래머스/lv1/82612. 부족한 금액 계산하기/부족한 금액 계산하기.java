class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 0 ; i <= count; i++){
            answer = answer + price * i; 
        }
        answer = answer - money;
        if(answer < 0) answer = 0;
        
        
        return answer;
    }
}