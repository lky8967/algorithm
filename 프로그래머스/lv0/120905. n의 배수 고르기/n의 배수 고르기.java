import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
//        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                arrayList.add(numlist[i]);
            }
        }
        int[] answer = arrayList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}