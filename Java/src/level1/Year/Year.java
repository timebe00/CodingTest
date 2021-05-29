package level1.Year;

//  2016년
public class Year {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a,b;
        a = b = 0;
        solution.solution(a, b);
    }
}

class Solution {
    public String solution(int a, int b) {
        String[] arr1 = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int day = b-1;
        String answer = "";
        for(int i = 0; i < a-1; i++) {
            System.out.println(i);
            if(i == 1) {
                day += 29;
            } else if(i < 7) {
                if(i % 2 == 0) {
                    day += 31;
                }else {
                    day += 30;
                }
            } else {
                if(i % 2 == 0) {
                    day += 30;
                }else {
                    day += 31;
                }
            }
        }
        answer = arr1[day%7];
        return answer;
    }
}