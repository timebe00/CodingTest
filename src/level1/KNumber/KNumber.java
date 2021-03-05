package level1.KNumber;

import java.util.ArrayList;

//  K번째 수
public class KNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {};
        int[][] commands = {{}};
        solution.solution(array, commands);

    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList arr = new ArrayList();
        int k = 0;
        for(int i = 0; i < commands.length; i++)
        {
            for(int j = commands[i][0]-1; j < commands[i][1]; j++)
            {
                arr.add(array[j]);
            }
            arr.sort(null);
            answer[k++] = (int)arr.get(commands[i][2]-1);
            arr.clear();
        }

        return answer;
    }
}