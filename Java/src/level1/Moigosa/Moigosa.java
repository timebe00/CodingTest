package level1.Moigosa;

import java.util.LinkedList;
import java.util.Queue;

//  모이고사
public class Moigosa {
    public static void main(String[] args) {
        int[] answers = {};
        Solution solution = new Solution();
        solution.solution(answers);
    }
}

class Solution {
    public int[] solution(int[] answers) {
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int[] CN = new int[3];
        Queue<Integer> que = new LinkedList<Integer>();
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == p1[i%5])
            {
                CN[0]++;
            }
            if(answers[i] == p2[i%8])
            {
                CN[1]++;
            }
            if(answers[i] == p3[i%10])
            {
                CN[2]++;
            }
        }
        int num = CN[0];
        for(int i : CN) {
            if(num < i)
            {
                num = i;
            }
        }

        for(int i = 0; i < CN.length; i++)
        {
            if(num == CN[i]) {
                que.add(i);
            }
        }
        int[] answer = new int[que.size()];
        int k = 0;
        while(!que.isEmpty())
        {
            answer[k] = que.poll()+1;
            k++;
        }
        return answer;
    }
}