class Solution {
    public int[] solution(int[] array) {
        // int[] answer = {};
        int[] answer = new int[2];
        int max = array[0];
        int q = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(max<array[i]) {
                max = array[i];
                
                answer[0] = array[i];
                answer[1] = i;
            }
        }

        return answer;
    }
}