package level1.Notation;

import java.util.LinkedList;

//  3진법 뒤집기
public class Notation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 0;
        solution.solution(n);
    }
}

class Solution {
    public int solution(int n) {
        LinkedList<Integer> arr1 = new LinkedList();
        int num = 1;
        int answer = 0;

        do {
            arr1.add(n%3);
            n = n/3;
        }while (n != 0);

        for(int i = arr1.size()-1; i >= 0; i--) {
            answer += arr1.get(i) * num;
            num *= 3;
        }
        return answer;
    }
}