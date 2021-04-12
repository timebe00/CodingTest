package level2.Country123;

import java.util.ArrayList;
import java.util.Stack;

public class Country123 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 300;
        solution.solution(n);
        solution.TimeOut(n);
    }
}

class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        /*
        3/3 = 1         4
        4/3 = 1         11
        6/3 = 2         14
        7/3 = 2         21
        9/3 = 3         24
        10/3 = 3        41
        3의 배수만 마지막에 4가 붙고 위로 올라가지 않는다. 라는 규칙성을 이용함
         */


        while (n > 0) {
            //  3의 배수일 경우 4를 붙임
            if(n % 3 == 0) {
                answer.insert(0, '4');
                n /= 3;
                n -= 1;
            } else {
                answer.insert(0, (n % 3));
                n /= 3;
            }
        }

        return String.valueOf(answer);
    }

    public String TimeOut(int n) {
        Stack<Integer> stack = new Stack();
        ArrayList<Integer> list = new ArrayList();
        StringBuilder answer = new StringBuilder();
        while (n > 3) {
            n -= 3;

            //  첫 수 이후 케리 수
            if(!stack.isEmpty()) {
                int num = stack.pop();
                //  두번째 자리수을 넘어갈 시
                if(num == 4) {
                    int number = 0;

                    //  케리 할 수 빼기
                    while (!stack.isEmpty()) {
                        if(stack.peek() != 4) {
                            break;
                        }
                        stack.pop();
                        number++;
                    }

                    //  케리 계산
                    if(!stack.isEmpty()) {
                        stack.push(ThreeToFor(stack.pop() + 1));
                    } else {
                        stack.push(1);
                    }

                    for(int i = 0; i <= number; i++) {
                        stack.push(1);
                    }
                }
                //  두번째 자리수에 있을 시
                else {
                    stack.push(ThreeToFor(++num));
                }
            }
            //  첫 케리 수
            else {
                stack.push(1);
            }
        }

        for(int i : stack) {
            answer.append(i);
        }
        answer.append(ThreeToFor(n));
        System.out.println(answer);
        return String.valueOf(answer);
    }

    //  3이면 4로 바꿔줌
    public int ThreeToFor (int num) {
        if(num == 3) {
            num = 4;
        }
        return num;
    }
}