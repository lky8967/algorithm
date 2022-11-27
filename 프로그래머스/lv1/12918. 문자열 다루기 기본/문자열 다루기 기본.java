class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if( s.length() == 4 || s.length() == 6){
        for(int i = 0 ; i < s.length() ; i++){
            System.out.println(i);
            //charAt (문장중에 인덱스 위치에 해당되는 문자 추출하기)
             if (s.charAt(i) < '0' || s.charAt(i) > '9'){
                 return false;
             }
        }
        } else {
            return false;
        }
        return answer;
    }
}