package level1.Measure;

//  약수의 합
public class Measure {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 12;
        solution.solution(n);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}