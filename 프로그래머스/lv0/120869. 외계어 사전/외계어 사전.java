class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 1;
        
        for(int i = 0 ; i < dic.length; i++){
            int cnt = 0;
            for(int j = 0 ; j < spell.length; j++) {       
                //만약 spell의 j번째 알파벳이 dic의 i번째 단어에 포함이 안되어있으면
                if(dic[i].indexOf(spell[j]) == -1) {      
                    cnt = -1;                           
                    answer = 2;                           
                    break;                              
                }
            }
            if(cnt == 0) {
                answer = 1;
                break;
            }     
    }
        return answer;
    }
}