import java.util.HashMap;
import java.util.Map;

public class MaxCounters {

    class Solution {

        public int[] solution(int N, int[] A) {

            int maxCounter = N + 1;

            Map<Integer, Integer> map = new HashMap<>();
            int totalMax = 0;
            int max = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != maxCounter) {
                    if (map.get(A[i]) == null) {
                        map.put(A[i], 0);
                    }
                    map.put(A[i], map.get(A[i]) + 1);

                    if (map.get(A[i]) > max) {
                        max = map.get(A[i]);
                    }
                } else {
                    map = new HashMap<>();
                    totalMax += max;
                    max = 0;
                }
            }

            int[] answer = new int[N];
            for (int i = 0; i < N; i++) {
                int adder = (map.get(i + 1) != null) ? map.get(i + 1) : 0;
                answer[i] = totalMax + adder;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new MaxCounters().new Solution();

        int n1 = 5;
        int[] a1 = {3, 4, 4, 6, 1, 4, 4};

        System.out.println(sol.solution(n1, a1));
    }
}
