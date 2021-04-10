package level1.Colatz;

//  콜라츠 추측
public class Colatz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 16;
        solution.solution(num);
    }
}

class Solution {
    public int solution(int num) {
        long number = num;
        for(int i = 0; i <= 500; i++) {
            if(number == 1) {
                System.out.println(i);
                return i;
            }

            if(number % 2 == 0) {
                number = number / 2;
            } else {
                if((number * 3) + 1 > 2147483647) {
                    break;
                }
                number = (number * 3) + 1;
            }

        }
        System.out.println(-1);
        return -1;
    }
}