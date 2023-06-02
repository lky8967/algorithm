class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] a = num_str.split("");
        int[] newArr = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            newArr[i] = Integer.parseInt(a[i]);
            answer = answer + newArr[i];
        }
        
        return answer;
    }
}