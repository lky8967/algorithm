class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n, m); // a
	    int min = Math.min(n, m); // b
			
        // 최대 공약수
        while(min != 0) {  // c
            int r = max % min;  
            max = min;  
            min = r; 
        }
		
        //최소 공배수 = 두수의 곱 / 최대공약수
        int gcd = n * m / max;   // d

        int[] answer = {max, gcd};
        return answer;
    }
}

//TIP_유클리드 호제법이란?
//두 수의 최대공약수를 구하는 알고리즘이다.
//2개의 자연수  a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단,a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.