class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int answer2 = 1;
        if(num_list.length > 10){
            for(int i = 0 ; i < num_list.length ; i++){
                answer = answer + num_list[i];
            }
        } else {
            for(int j = 0 ; j < num_list.length ; j++){
                answer2 = answer2 * num_list[j];
                
            }
            answer = answer2;
        }
        return answer;
    }
}