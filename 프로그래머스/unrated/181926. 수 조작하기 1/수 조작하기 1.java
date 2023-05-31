class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] arr = control.split("");
        
        for(int i = 0 ; i < arr.length; i++){
            
            if(arr[i].equals("w")){
                answer = answer + 1 ;
            } else if(arr[i].equals("s")){
                answer = answer - 1 ;
            } else if(arr[i].equals("d")){
                answer = answer + 10 ;
            } else if(arr[i].equals("a")){
                answer = answer - 10 ;
            }
        }
        
        return answer;
    }
}