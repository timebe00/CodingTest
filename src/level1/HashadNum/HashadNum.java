package level1.HashadNum;

//  하샤드수
public class HashadNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 10;
        solution.solution(x);
    }
}

class Solution {
    public boolean solution(int x) {
        String num = String.valueOf(x);
        int sum = 0;

        for(int i = 0; i < num.length(); i++) {
            sum += num.charAt(i) - 48;
        }
        if(x % sum == 0) {
            return true;
        }
        return false;
    }
}