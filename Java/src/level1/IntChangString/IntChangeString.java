package level1.IntChangString;

//  문자열을 정수로 바꾸기
public class IntChangeString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "-1234";
        solution.solution(s);
    }
}

class Solution {
    public int solution(String s) {
        return Integer.valueOf(s);
    }
}