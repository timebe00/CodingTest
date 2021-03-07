package level2.Bridge;

import java.util.LinkedList;
import java.util.Queue;

//  다리를 지나느 트럭
public class Bridge {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int bridge_length = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        solution.solution(bridge_length, weight, truck_weights);
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int num = 0;
        Queue<Integer> queue = new LinkedList();

        for(int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        for(int i = 0; i < truck_weights.length; i++) {
            if(num-queue.peek() + truck_weights[i] > weight) {
                i--;
                queue.offer(0);
                System.out.println((answer+1) + "번째(안들어감) : " + queue.peek());
            } else {
                num += truck_weights[i];
                queue.offer(truck_weights[i]);
                System.out.println((answer+1) + "번째(들어감) : " + queue.peek());
            }
            num -= queue.poll();
            answer++;
        }

        while (queue.poll() != null) {
            answer++;
        }
        System.out.println(answer+1);
        return answer;
    }
}