package level1.MiddleLetter;

//  가운데 글자 가져오기
public class MiddleLetter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "";
        solution.solution(s);
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        int num = s.length()/2;

        if(s.length() != 0) {
            if(s.length() % 2 == 0) {
                answer += s.charAt(num-1);
                answer += s.charAt(num);
            } else {
                answer += s.charAt(num);
            }
        }
        return answer;
    }
}