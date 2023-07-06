class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = 0;
        int d = 0;
        String aa = "";
        aa = ( String.valueOf(a) + String.valueOf(b) );
        c =  Integer.valueOf(aa).intValue();
        d = 2 * a * b;
        if(d > c){
            answer = d;
        } else {
            answer = c;
        }
        return answer;
    }
}