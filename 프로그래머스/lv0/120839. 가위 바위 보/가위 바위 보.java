class Solution {
    public String solution(String rsp) {
        String answer = "";
        String arr[] = rsp.split("");
        for(int i = 0 ; i < arr.length; i++){
            if("2".equals(arr[i])){
                answer = answer + "0";
            } else if ("0".equals(arr[i])){
                answer = answer + "5";
            }else if ("5".equals(arr[i])){
                answer = answer + "2";
            }        
        }

        
        
        return answer;
    }
}