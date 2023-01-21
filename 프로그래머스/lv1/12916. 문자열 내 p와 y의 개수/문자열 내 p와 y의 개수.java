class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] array = s.toLowerCase().split("");
        int cnt = 0 ;
        int cntt = 0;
        for(int i = 0 ; i < array.length; i++){
            if("y".equals(array[i])){
                cnt++;
            }
            if("p".equals(array[i])){
                cntt++;
            }
        } 
        if(cnt != cntt){
            answer = false;
        } 
        return answer;
    }
}