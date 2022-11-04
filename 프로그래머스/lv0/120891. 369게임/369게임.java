class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        String[] arrStr = str.split("");
        for(int i = 0 ; i < arrStr.length; i++){
            System.out.print(arrStr[i]);
           if(arrStr[i].equals("3") || arrStr[i].equals("6") || arrStr[i].equals("9")){
               answer++;
           }
        }
        return answer;
    }
}