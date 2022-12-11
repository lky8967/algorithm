class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int maxx = 0;
        for(int i=0 ; i<numbers.length ; i++){
            for(int j=0 ; j<numbers.length ; j++){
			    if(i != j && numbers[i] * numbers[j] > max){
                    max = numbers[i] * numbers[j];
                }
            }
		}
        answer = max;
        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[] numbers) {
//         int answer = 0;

//         Arrays.sort(numbers);

//         return numbers[numbers.length-1]*numbers[numbers.length-2];
//     }
// }