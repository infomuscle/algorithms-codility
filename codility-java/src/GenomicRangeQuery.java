import java.util.Arrays;
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

            int start;
            int end;
            for (int i = 0; i < P.length; i++) {
                start = P[i];
                end = Q[i];

                String[] queryBase = S.substring(start, end + 1).split("");

                Arrays.sort(queryBase);

                answer[i] = map.get(queryBase[0]);
            }

            return answer;
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
