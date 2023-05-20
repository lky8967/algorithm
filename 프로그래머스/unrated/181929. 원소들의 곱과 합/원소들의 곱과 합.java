class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0; 
        int avg = 1;
        for(int i = 0 ; i < num_list.length ; i++){
            sum = sum + num_list[i];
            avg = avg * num_list[i];
        }
        if(sum * sum > avg){
            answer = 1;
        } 
        return answer;
    }
}