package level2.Development;

import java.util.LinkedList;
import java.util.Queue;

//  기능개발
public class Development {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        solution.solution(progresses, speeds);
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList();
        for (int i : progresses) {
            queue.offer(i);
        }
        int k = 0;
        int num = 0;
        while (queue.peek() != null) {
            for (int i = num; i < speeds.length; i++) {
                queue.offer(queue.poll() + speeds[i]);
            }
            while (queue.peek() != null && queue.peek() >= 100) {
                queue.poll();
                k++;
            }
            if (k > 0) {
                list.add(k);
                num += k;
                k = 0;
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}