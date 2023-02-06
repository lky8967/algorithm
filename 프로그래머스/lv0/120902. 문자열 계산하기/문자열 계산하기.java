class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.split(" ");
        boolean mode = true;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                answer += Integer.parseInt(arr[i]);
            } else {
                if (arr[i].equals("+")) {
                    mode = true;
                } else if (arr[i].equals("-")) {
                    mode = false;
                } else {
                    if (mode) {
                        answer += Integer.parseInt(arr[i]);
                    } else {
                        answer -= Integer.parseInt(arr[i]);
                    }
                }
            }
        }
        return answer;
    }
}