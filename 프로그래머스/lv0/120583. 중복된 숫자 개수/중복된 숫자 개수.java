class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i = 0 ; i < array.length ; i++){
            // System.out.print(i);
            if(array[i] == n){
                ++answer;
                System.out.print(answer);
            }
        } 
        return answer;
    }
}