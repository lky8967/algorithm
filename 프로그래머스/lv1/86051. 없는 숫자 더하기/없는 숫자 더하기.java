class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        
        for(int i = 0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]);
            answer = answer - numbers[i];
        }
        return answer;
    }
}