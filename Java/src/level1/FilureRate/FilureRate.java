package level1.FilureRate;

import java.util.*;

//  실패율
public class FilureRate {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 5;
        int[] stages = {2, 1, 2, 2, 2, 4, 3, 3};
        solution.solution(N, stages);
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int sum = stages.length;
        int[] answer = new int[N];
        int num = 0;
        HashMap map = new HashMap();

        for(int i = 1; i <= N; i++) {
            for(int j : stages) {
                if(i < j) {
                    num++;
                }
            }
            //System.out.println(num);
            if(sum != 0) {
                map.put(i, (double) (sum - num) / sum);
            } else {
                map.put(i, 0.0);
            }
            sum = num;
            num = 0;
        }

        System.out.println(map);

        //  Value값 기준 내림차순 정렬
        List<Map.Entry<Integer, Double>> list= new ArrayList<Map.Entry<Integer, Double>>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //  정렬한것을 넣기
        num = 0;
        for (Map.Entry<Integer, Double> i : list) {
            answer[num++] = i.getKey();
        }

        for(int i : answer) {
            System.out.println(i);
        }

        return answer;
    }
}