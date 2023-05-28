class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end - start + 1];
        int n = 0;
        for(int i = start ; i < end + 1 ; i++){
            answer[n] = i;
            n++;
        }
        return answer;
    }
}