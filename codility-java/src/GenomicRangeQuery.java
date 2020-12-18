import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GenomicRangeQuery {

    class Solution {
        public int[] solution(String S, int[] P, int[] Q) {

            int N = S.length();
            int M = P.length;

            int[] answer = new int[P.length];

            Map<String, Integer> factorMap = new LinkedHashMap<>();
            factorMap.put("A", 1);
            factorMap.put("C", 2);
            factorMap.put("G", 3);
            factorMap.put("T", 4);

            String[] split = S.split("");
            for (int i = 0; i < M; i++) {
                List<String> sp = Arrays.asList(Arrays.copyOfRange(split, P[i], Q[i] + 1));
                System.out.println(sp);
                for (String key : factorMap.keySet()) {
                    if (sp.contains(key)) {
                        answer[i] = factorMap.get(key);
                        break;
                    }
                }
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
