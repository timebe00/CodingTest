package level1.Crane;

import java.util.Stack;

//  크레인 인형뽑기 게임
public class Crane {
    public static void main(String[] args) {
        //  테스트 케이스
        int[][]num = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] mov = {1,5,3,5,1,2,1,4};
        Solution so = new Solution();
        so.solution(num, mov);
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        //  실제 뽑은 것들을 나타냄
        Stack<Integer> ST = new Stack<Integer>();
        //  크래인 움직이는 것
        int ML = 0;
        //  크레인 집계 내겨가는 것
        int BL = 0;
        //  몇개를 없에나
        int answer = 0;
        //  실제 선택한 것
        int rem;
        
        while (true) {
            //  움직임 제어
            rem = board[BL++][moves[ML]-1];
            System.out.println("BL : " + BL + ", moves[ML] : " + (moves[ML]-1) + ", rem : " + rem);
            //  실제 계산 코드
            if(BL <= board.length) {
                if(rem > 0) {
                    System.out.println("board[BL-1][moves[ML]-1] : " + board[BL-1][moves[ML]-1]);
                    board[BL-1][moves[ML]-1] = 0;
                    //  기존것과 뽑은 것이 같다면 둘다 소멸 아니라면 쌓아라
                    if (!ST.isEmpty() && ST.peek() == rem) {
                        ST.pop();
                        answer += 2;
                    } else {
                        ST.push(rem);
                    }
                    ML++;
                    BL = 0;
                }
            }
            //  범위 버서나면 초기화하고 다음으로 넘어감
            if (BL == board.length) {
                ML++;
                BL = 0;
            }
            //  지정한 수만큼 옴직였으면 나가기
            if (ML == moves.length)
            {
                break;
            }
        }
        //  내용 확인하기
        while (true){
            if (!ST.isEmpty())
            {
                System.out.printf(ST.pop() + ", ");
            }else {
                break;
            }
        }
        System.out.println("answer : " + answer);
        return answer;
    }
}