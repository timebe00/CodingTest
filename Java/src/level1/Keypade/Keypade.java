package level1.Keypade;

import java.util.HashMap;

//  키페드 누르기
public class Keypade {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        solution.solution(numbers, hand);
    }
}

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int Rhand = -1;
        int Lhand = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int num = 1;
        int[][] arr = new int[3][2];
        for(int i = 1; i < 4; i++) {
            for(int j = 1; j < 4; j++) {
                map.put(num++, i * 10 + j);
            }
        }
        map.put(0, 42);
        for (int i : numbers) {
            if(i % 3 == 1 && i != 0) {
                Lhand = i;
                answer += 'L';
            } else if (i % 3 == 0 && i != 0) {
                Rhand = i;
                answer += 'R';
            } else {
                arr[0][0] = map.get(i) / 10;
                arr[0][1] = map.get(i) % 10;

                if(Lhand != -1) {
                    arr[1][0] = map.get(Lhand) / 10;
                    arr[1][1] = map.get(Lhand) % 10;
                } else {
                    arr[1][0] = 4;
                    arr[1][1] = 1;
                }

                if(Rhand != -1) {
                    arr[2][0] = map.get(Rhand) / 10;
                    arr[2][1] = map.get(Rhand) % 10;
                } else {
                    arr[2][0] = 4;
                    arr[2][1] = 3;
                }

                num = (Math.abs(arr[0][0] - arr[1][0]) + Math.abs(arr[0][1] - arr[1][1])) -
                        (Math.abs(arr[0][0] - arr[2][0]) + Math.abs(arr[0][1] - arr[2][1]));

                if (num > 0) {
                    answer += 'R';
                    Rhand = i;
                } else if (num < 0) {
                    answer += 'L';
                    Lhand = i;
                } else {
                    if(hand.equals("right")) {
                        answer += 'R';
                        Rhand = i;
                    } else {
                        answer += 'L';
                        Lhand = i;
                    }
                }
            }
        }
        System.out.println(map);
        System.out.println("answer : " + answer);
        return answer;
    }
}