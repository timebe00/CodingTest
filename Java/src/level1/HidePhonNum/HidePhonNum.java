package level1.HidePhonNum;

// 핸드폰 번호 가리기
public class HidePhonNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String phone_number = "01033334444";
        solution.solution(phone_number);
    }
}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num = phone_number.length();
        for (int i = 0; i < num; i++) {
            if (i > num - 5) {
                answer += phone_number.charAt(i);
                continue;
            }
            answer += '*';
        }

        System.out.println(answer);
        return answer;
    }
}