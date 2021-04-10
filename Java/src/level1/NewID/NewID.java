package level1.NewID;

import java.util.LinkedList;
import java.util.Locale;

//  신규 아이디 추천
public class NewID {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        solution.solution(new_id);
    }
}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase(Locale.ROOT);
        LinkedList<Character> list = StringChar(answer);
        list = DelSpecialCharacters(list);
        list = TowPoinOne(list);
        list = firstListPointDel(list);
        list = cutLength(list);
        list = sizeZero(list);
        list = plushSize(list);
        answer = AddWord(list);
        System.out.println();
        System.out.println("answer : " + answer);
        return answer;
    }

    //  문자열을 char로 보내기
    public LinkedList StringChar (String word) {
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }

        return list;
    }

    //  알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
    public LinkedList<Character> DelSpecialCharacters (LinkedList<Character> list) {

        for (int i = 0; i < list.size(); i++ )
        {
            if(list.get(i) > 96 && list.get(i) < 123) {
                continue;
            } else if (list.get(i) == '-') {
                continue;
            } else if (list.get(i) == '_') {
                continue;
            } else if (list.get(i) == '.') {
                continue;
            } else if (list.get(i) >= 48  && list.get(i) <= 58) {
                continue;
            }
            list.remove(i--);
        }

        return list;
    }

    //  마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
    public LinkedList<Character> TowPoinOne(LinkedList<Character> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) == '.') {
                if (list.get(i-1) == list.get(i)) {
                    list.remove(i--);
                }
            }
        }

        return list;
    }

    //  마침표(.)가 처음이나 끝에 위치한다면 제거
    public LinkedList<Character> firstListPointDel (LinkedList<Character> list) {
        while (true) {
            if (list.size() != 0) {
                if (list.get(0) == '.') {
                    list.remove(0);
                } else if (list.get(list.size() - 1) == '.') {
                    list.remove(list.size() - 1);
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        for(char i : list) {
            System.out.print(i);
        }

        return list;
    }

    //  빈 문자열이라면, new_id에 "a"를 대입
    public LinkedList<Character> sizeZero (LinkedList<Character> list) {
        if(list.size() == 0) {
            list.add('a');
        }

        return list;
    }

    //  길이가 16자 이상이면, 15개의 문자를 제외한 나머지 문자들을 모두 제거
    //  끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
    public LinkedList<Character> cutLength (LinkedList<Character> list) {
        while (true) {
            if(list.size() > 15) {
                list.remove(15);
            } else {
                break;
            }
        }
        list = firstListPointDel(list);
        return list;
    }

    //  길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
    public LinkedList<Character> plushSize (LinkedList<Character> list) {
        if(list.size() > 0 && list.size() < 3) {
            while (list.size() != 3) {
                list.add(list.get(list.size() - 1));
            }
        } else {
            list = sizeZero(list);
        }
        return list;
    }

    //  문자열로 합치기
    public String AddWord (LinkedList<Character> list) {
        String word = "";
        for(char i : list) {
            word += i;
        }
        return word;
    }
}