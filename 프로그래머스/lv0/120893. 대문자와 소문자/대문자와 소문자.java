class Solution {
    public String solution(String my_string) {
        String answer = "";
        char arr[] = my_string.toCharArray();
        // char arr[] = my_string.toCharArray.split("");      
        String temp ="";
        for(int i = 0 ; i < arr.length ; i++ ){
            if(arr[i] >= 65 && arr[i] <= 90 ){
                temp = arr[i] + "";
                answer = answer + temp.toLowerCase();
            } else {
                temp = arr[i] + "";
                answer = answer + temp.toUpperCase();
            }
            
        }
        
        
        return answer;
    }
}