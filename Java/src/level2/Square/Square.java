package level2.Square;

//  말쩡한 사각형
public class Square {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int w = 8;
        int h = 12;
        solution.solution(w, h);
    }
}

class Solution {
    public long solution(int w, int h) {
        long answer = 0;
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < w; j++) {
                answer++;
                int num = -((h * j) / w) + h;
                if (i >= num) {
                    if (num == i && (h * j) % w == 0) {
                        answer++;
                    }
                    answer--;
                    break;
                }
            }
        }
        System.out.println(answer * 2);
        return answer*2;
    }
}
