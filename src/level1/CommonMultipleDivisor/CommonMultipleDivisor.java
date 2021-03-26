package level1.CommonMultipleDivisor;

//  최대공약수와 최소공배수
public class CommonMultipleDivisor {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        int m = 12;
        solution.solution(n, m);
    }
}

class Solution {
    public int[] solution(int n, int m) {
        if(n == m) {
            int[] answer = {n ,n};
            return answer;
        }
        int[] answer = {1,0};
        int min = Math.min(n, m);
        int max = Math.max(n ,m);
        int k = 1;
        int num = 0;
        for(int i = 2; i <= min; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        while (true) {
            num = min * k++;
            if(num % max == 0) {
                answer[1] = num;
                break;
            }
        }

        for(int i : answer) {
            System.out.println(i);
        }
        return answer;
    }
}