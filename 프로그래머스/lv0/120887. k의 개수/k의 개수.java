class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int q = i; q <= j; q++) {
            StringBuilder sb = new StringBuilder();
            sb.append(q);

            int defaultLength = sb.length();

            for (int r = 0; r < defaultLength; r++) {
                if ((sb.charAt(r) - '0') == k) {
                    answer++;
                }
            }
        }

        return answer;
    }
}