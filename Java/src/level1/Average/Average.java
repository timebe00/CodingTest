package level1.Average;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4};
        solution.solution(arr);
    }
}

class Solution {
    public double solution(int[] arr) {
        return Arrays.stream(arr).sum() / (double)arr.length;
    }
}