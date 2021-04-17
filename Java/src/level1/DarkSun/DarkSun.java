package level1.DarkSun;

//  음양 더하기
public class DarkSun {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        solution.solution(absolutes, signs);
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int k = 0;
        for(boolean i : signs) {
            if(i) {
                answer += absolutes[k++];
            } else {
                answer -= absolutes[k++];
            }
        }

        System.out.println(answer);
        return answer;
    }
}
