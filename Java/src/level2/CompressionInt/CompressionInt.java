package level2.CompressionInt;

//  문자열 압축
public class CompressionInt {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s="a";
        solution.solution(s);
    }
}

class Solution {
    public int solution(String s) {
        int num = 1;
        String str1 = "";
        int same = 0;
        String str2 = "";
        int len = s.length();
        while (num != (s.length() / 2 + 1) ) {
            for (int i = 0; i < s.length(); i += num) {
                if (i + num <= s.length()) {
                    System.out.println(s.substring(i, i + num));
                    if (str1.equals(s.substring(i, i + num))) {
                        same++;
                    } else {

                        if(same > 0) {
                            str2 += (same + 1) + str1;
                        } else {
                            str2 += str1;
                        }
                        same = 0;
                        str1 = s.substring(i, i + num);
                    }
                }
            }

            if(same > 0) {
                str2 += (same + 1) + str1;
            } else {
                str2 += str1;
            }

            if (len > str2.length() + (s.length() % num)) {
                len = str2.length() + (s.length() % num);
            }
            str2 = "";
            num++;
            str1 = "";
            same = 0;
        }
        return len;
    }
}