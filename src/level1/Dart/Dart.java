package level1.Dart;

import java.util.Stack;
import java.util.regex.Pattern;

//  [1차] 다트 게임
public class Dart {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String dartResult = "1S2D3T";
        solution.solution(dartResult);
    }
}

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String str = "";
        Stack<Double> list = new Stack();
        for(int i = 0; i < dartResult.length(); i++) {
            str += dartResult.charAt(i);
            if(dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                str += dartResult.charAt(++i);
            }

            if(Pattern.matches("^[0-9]*$", str)){
                list.push(Double.valueOf(str));
            } else if (str.equals("D")) {
                list.push(Math.pow((Double) list.pop(), 2));
            } else if(str.equals("T")) {
                list.push(Math.pow((Double) list.pop(), 3));
            } else if(str.equals("*")) {
                if(list.size() > 1) {
                    double num = list.pop() * 2;
                    list.push(list.pop() * 2);
                    list.push(num);
                } else {
                    list.push((list.pop() * 2));
                }
            } else if(str.equals("#")) {
                list.push((list.pop() * (-1)));
            }

            str = "";
        }

        for(double i : list) {
            answer += i;
        }

        System.out.println(answer);
        return answer;
    }
}