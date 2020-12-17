import java.util.HashMap;
import java.util.Map;

/**
 * Lesson 2
 */
public class OddOccurrencesInArray {

    class Solution {
        public int solution(int[] A) {

            int answer = 0;

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                if (map.containsKey(A[i])) {
                    map.put(A[i], map.get(A[i]) + 1);
                } else {
                    map.put(A[i], 1);
                }
            }

            for (Integer key : map.keySet()) {
                if (map.get(key) % 2 == 1) {
                    answer = key;
                    break;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution sol = new OddOccurrencesInArray().new Solution();

        int[] a1 = {9, 3, 9, 3, 9, 7, 9};
        int[] a2 = {1};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));

    }
}
