package level1.MakeDecimal;

//  소수만들기
public class MakeDecimal {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        solution.solution(nums);
    }
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean TF = true;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    TF = true;
                    int num = nums[k] + nums[j] + nums[i];
                    for(int m = 2; m < num; m++) {
                        if(num % m == 0) {
                            TF = false;
                            break;
                        }
                    }
                    if (TF) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}