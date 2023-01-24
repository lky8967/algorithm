class Solution {
    public String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        String arr[] = s.split("");
        
        for(int i = 0 ; i < arr.length; i++){
            answer = answer + ((char)((Integer.parseInt(arr[i])) + 97));
        }
        
        
        return answer;
    }
}

// import java.util.stream.Collectors;

// class Solution {
//     public String solution(int age) {
//         return String.valueOf(age).chars().mapToObj(operand ->
//                 String.valueOf((char) (49 + operand))).collect(Collectors.joining());
//     }
// }