package level1.DellSmallNum;

import java.util.Arrays;

//  제일 작은수 제거하기
public class DellSmallNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {4, 3, 2, 1};
        solution.solution(arr);
    }
}

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = new int[arr.length];
            answer[0] = -1;
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int k = 0;
        int min = Arrays.stream(arr).min().getAsInt();
        for(int i : arr) {
            if(i == min) {
                continue;
            }
            answer[k++] = i;
        }

        return answer;
    }
}