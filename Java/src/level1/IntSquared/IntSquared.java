package level1.IntSquared;

//  정수 제곱근 판별
public class IntSquared {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 121;
        solution.solution(n);
    }
}

class Solution {
    public long solution(long n) {
        double ans = 1.5;
        ans = Math.sqrt(n);
        if(ans % 1 == 0) {
            return (long) Math.pow(ans+1 , 2);
        }
        return -1;
    }
}