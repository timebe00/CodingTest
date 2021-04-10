package level1.InnerProduct;

import java.util.LinkedList;
import java.util.Queue;

//  내적
public class InnerProduct {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        solution.solution(a, b);
    }
}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        System.out.println(answer);
        return answer;
    }
}