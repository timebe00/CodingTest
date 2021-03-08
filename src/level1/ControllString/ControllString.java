package level1.ControllString;

import java.util.regex.Pattern;

//  문자열 다루기 기본
public class ControllString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "a234";
        solution.solution(s);
    }
}

class Solution {
    public boolean solution(String s) {
        int num = s.length();
        if(num == 4 || num == 6 ) {
            if (Pattern.matches("^[0-9]*$", s)) {
                return true;
            }
        }
        return false;
    }
}