package level1.CountPY;

//  문자열 내 p와y 개수
public class CountPY {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Pyy";
        solution.solution(s);
    }
}

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int YCounter = 0;
        int PCounter = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                PCounter++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                YCounter++;
            }
        }

        if(PCounter != YCounter) {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}