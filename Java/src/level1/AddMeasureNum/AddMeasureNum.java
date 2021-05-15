package level1.AddMeasureNum;

//  약수의 개수와 덧셈
public class AddMeasureNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int left = 13;
        int right = 17;
        solution.solution(left, right);
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(long i = left; i <= right; i++) {
            long num = 0;
            for(long j = 1; j <= i/2+1; j++) {
                if(i % j == 0) {
                    num += 1;
                }
            }

            if (num % 2 == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }

        return answer;
    }
}