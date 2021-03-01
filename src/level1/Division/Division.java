package level1.Division;

import java.util.Collections;
import java.util.LinkedList;

//  나누어 떨어지는 숫자 배열
public class Division {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {};
        int divisor = 0;
        solution.solution(arr, divisor);
    }
}

class Solution {
    public int[] solution(int[] arr, int divisor) {
        LinkedList<Integer> list = new LinkedList();
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }
        }

        Collections.sort(list);

        if(list.size() == 0 ){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
