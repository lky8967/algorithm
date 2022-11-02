class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; //입력 받은 n은 개수이므로 배열의 크기로 세팅함
         for(int i=0; i < n ; i++) { //i < n 은 i < answer.length 와 동일함 
             // i는0; i가 n보다 작을때 까지 반복, 반복마다 1씩 증가
             answer[i] = (long) (i + 1) * x;
//answer 배열의 0번 인덱스 부터 (long) (i + 1) * x 를 대입해주면 입력 받은 x만큼 증가하여 출력됨              
         }
        return answer;
    }
}