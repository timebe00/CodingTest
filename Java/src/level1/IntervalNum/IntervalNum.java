package level1.IntervalNum;

//  x만큼 간격이 있는 n개의 숫자
public class IntervalNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 2;
        int n = 5;
        solution.solution(x, n);
    }
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long k = x;
        for (int i = 0; i < n; i++) {
            answer[i] = k;
            k += x;
        }

        for(long i : answer) {
            System.out.println(i);
        }
        return answer;
    }
}