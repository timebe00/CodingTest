package level2.Print;

import java.util.*;

//  프린트
public class Print {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        solution.solution(priorities, location);

    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Integer[] list = new Integer[priorities.length];
        LinkedList<Integer> rem = new LinkedList();
        Queue<Integer> queue = new LinkedList<>();
        int pick = priorities[location];

        for(int i = 0; i < priorities.length; i++) {
            list[i] = priorities[i];
        }

        Arrays.sort(list, Collections.reverseOrder());

        int maxNum = list[0];

        priorities[location] = 10;

        if(maxNum == pick) {
            for(int i : priorities) {
                if(i == maxNum) {
                    answer++;
                    continue;
                } else if(i == 10) {
                    System.out.println(++answer);
                    return answer;
                }
            }
        }

        for(int i : priorities) {
            if(maxNum == -1) {
                queue.offer(i);
            } else if (i == maxNum) {
                queue.offer(i);
                maxNum = -1;
            } else {
                rem.add(i);
            }
        }

        for(int i : rem) {
            queue.offer(i);
        }

        for(int i : list) {
            answer++;
            while (true) {
                if (queue.peek() == i) {
                    queue.poll();
                    break;
                } else if (queue.peek() == 10 && i == pick) {
                    System.out.println(answer);
                    return answer;
                } else {
                    queue.offer( queue.poll() );
                }
            }
        }

        return answer;
    }
}