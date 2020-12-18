import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {

    class Solution {
        public int[] solution(String S, int[] P, int[] Q) {

            int[] answer = new int[P.length];

            Map<String, Integer> map = new HashMap<>();
            map.put("A", 1);
            map.put("C", 2);
            map.put("G", 3);
            map.put("T", 4);

            for (int i = 0; i < P.length; i++) {
                String queryBase = S.substring(P[i], Q[i] + 1);
                answer[i] = map.get(findMinimum(queryBase));
            }

            return answer;
        }

        private String findMinimum(String S) {
            if (S.contains("A")) {
                return "A";
            } else if (S.contains("C")) {
                return "C";
            } else if (S.contains("G")) {
                return "G";
            } else {
                return "T";
            }
        }
    }


    public static void main(String[] args) {

        Solution sol = new GenomicRangeQuery().new Solution();

        String s1 = "CAGCCTA";
        int[] p1 = {2, 5, 0};
        int[] q1 = {4, 5, 6};

        System.out.println(sol.solution(s1, p1, q1));
    }
}


//            for (int i = 0; i < answer.length; i++) {
//                System.out.print(answer[i]);
//            }
//            System.out.println();
