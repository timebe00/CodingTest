package level1.IntDescending;

import java.util.*;

//  정수 내림차순으로 배치하기
public class IntDescending {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long n = 118372;
        solution.solution(n);
    }
}

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        Integer[] arr = new Integer[str.length()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(str.substring(i, i+1));
        }
        System.out.println(arr[0]);
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i : arr) {
            answer *= 10;
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }
}