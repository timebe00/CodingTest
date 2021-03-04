package level1.Finished;

import java.util.Arrays;
//  완주하지 못한 선수
public class Finished {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        sol.solution(participant, completion);
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0 ; i < completion.length; i++)
        {
            if(!completion[i].equals(participant[i]))
            {
                answer = participant[i];
                break;
            }
        }

        if (answer == "")
        {
            answer = participant[completion.length];
        }
        System.out.println(answer);
        return answer;
    }
}
