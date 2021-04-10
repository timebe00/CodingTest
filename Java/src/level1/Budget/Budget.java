package level1.Budget;

import java.util.Arrays;

//  예산
public class Budget {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        solution.solution(d, budget);
    }
}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        for(int i : d) {
            sum += i;
            if(sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }
}