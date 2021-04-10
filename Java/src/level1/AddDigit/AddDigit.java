package level1.AddDigit;

//  자릿수 더하기
public class AddDigit {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 123;
        solution.solution(n);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String srt = String.valueOf(n);
        for (int i = 0; i < srt.length(); i++) {
            answer += srt.charAt(i) - 48;
        }
        return answer;
    }
}