package level1.FindeKim;

import java.util.Arrays;

//  서울에서 김서방 찾기
public class FindeKim {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] seoul = {"Jane", "Kim"};
        solution.solution(seoul);
    }
}

class Solution {
    public String solution(String[] seoul) {
        int k = 0;
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                k = i;
            }
        }
        return "김서방은 " + k + "에 있다";
    }
}