class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String s = Integer.toString(num);
        String k1 = Integer.toString(k);
        String[] arr = s.split("");
        
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]);
            if(k1.equals(arr[i])){
                answer = i + 1 ;
                break;
            }
        }
        
        
        return answer;
    }
}