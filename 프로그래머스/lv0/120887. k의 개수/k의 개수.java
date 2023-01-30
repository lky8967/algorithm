class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int q = i; q <= j; q++){
            int cnt = q;
            while (cnt != 0){
                if (cnt % 10 == k){
                    answer++;
                }
                cnt /= 10;
                
            }
        }
        return answer;
    }
}