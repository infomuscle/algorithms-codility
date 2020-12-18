import java.util.*;

public class GenomicRangeQuery {

    class Solution {
        public int[] solution(String S, int[] P, int[] Q) {

            int N = S.length();
            int M = P.length;

            int[] answer = new int[P.length];

            Map<Character, Integer> factorMap = new HashMap<>();
            factorMap.put('A', 1);
            factorMap.put('C', 2);
            factorMap.put('G', 3);
            factorMap.put('T', 4);

            Map<Character, List<Integer>> indexMap = new LinkedHashMap<>();
            indexMap.put('T', new ArrayList<Integer>());
            indexMap.put('G', new ArrayList<Integer>());
            indexMap.put('C', new ArrayList<Integer>());
            indexMap.put('A', new ArrayList<Integer>());

            for (int i = 0; i < N; i++) {
                indexMap.get(S.charAt(i)).add(i);
            }

            for (int i = 0; i < M; i++) {
                for (Character key : indexMap.keySet()) {
                    for (Integer idx : indexMap.get(key)) {
                        if (idx >= P[i] && idx <= Q[i]) {
                            answer[i] = factorMap.get(key);
                            break;
                        }
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
