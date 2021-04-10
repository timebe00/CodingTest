package level1.EvenHole;

//  짝수와 홀수
public class EvenHole {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 3;
        solution.solution(num);
    }
}

class Solution {
    public String solution(int num) {
        if(num % 2 == 0) { return "Even";}
        return "Odd";
    }
}