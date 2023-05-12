class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            // 가지고 있는 빈 병수가 a개보다 미만이면 return
            if(n < a){
                break;
            }
            
            // 가지고 있는 빈 병수가 a개보다 클 경우
            answer = answer + ( ( n / a ) * b );
            int t = n % a;
            n = ( n / a ) * b + t;
        }
        return answer;
    }
}