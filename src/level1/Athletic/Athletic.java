package level1.Athletic;

import java.util.ArrayList;

//  체육복
public class Athletic {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 0;
        int[] lost = {};
        int[] reserve = {};
        solution.solution(n,lost,reserve);
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for (int i = 0; i < lost.length; i++)
        {
            for (int j = 0; j < reserve.length; j++)
            {
                if(lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    answer++;
                    break;
                }
            }
        }

        for(int i = 0; i < lost.length; i++)
        {
            for(int j = 0; j < reserve.length; j++)
            {
                if(lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j])
                {
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}