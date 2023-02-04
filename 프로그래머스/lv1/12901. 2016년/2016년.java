import java.time.*;
class Solution {
  public String solution(int a, int b) {    // 5   24
                        
    // getDayOfWeek 요일 가져오는 함수 
    // 파라미터로 주어진 날짜 정보를 저장한 LocalDate 객체를 리턴한다.
    //LocalDate targetDate = LocalDate.of(2016,5,24);
      return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0,3);
      
      
  }
}