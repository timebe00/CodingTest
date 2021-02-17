package level1.TowPlu;

import java.util.ArrayList;
import java.util.Collections;

//  두개 뽑아서 더하기
public class TowPlu {
    public static void main(String[] args) {
        //  테스트 케이스
        int[] num = {5,0,2,7};
        Solution so = new Solution();
        so.solution(num);
    }
}

class Solution {
    int[] solution(int[] numbers) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        int rem = 0;
        //  실제 계산하기
        for(int i = 0; i < numbers.length/2 + 1; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                rem = numbers[i] + numbers[j];
                System.out.println(num.contains(rem));
                if(!num.contains(rem)){
                    num.add(rem);

                } else {
                    System.out.println("rem : " + rem);
                }
            }
        }
        System.out.println("===========================================");
        Collections.sort(num);
        //  배열 길이에 맞게 선언
        int[] answer = new int[num.size()];
        System.out.println("answer : " + answer.length);
        //  답안 옮겨 주기
        for (int i = 0; i < num.size(); i++)
        {
            System.out.printf(num.get(i) + ", ");
            answer[i] = num.get(i);
        }
        return answer;
    }
}
