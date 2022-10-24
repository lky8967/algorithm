class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int q = 0;
        int w = 0;
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] % 2 ==0){
                q++;
            } else {
                w++;
            }
            answer[0] = q;
            answer[1] = w;
        }
        return answer;
    }
}