class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int bug = (int)Math.pow(2 , t);
        answer = n * bug;
        return answer;
    }
}