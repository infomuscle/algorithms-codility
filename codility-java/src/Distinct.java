import java.util.HashMap;
import java.util.Map;

public class Distinct {

    class Solution {
        public int solution(int[] A) {

            Map<Integer, Boolean> map = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                if (!map.containsKey(A[i])) {
                    map.put(A[i], true);
                }
            }

            return map.size();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Distinct().new Solution();

        int[] a1 = {2, 1, 1, 2, 3, 1};
        System.out.println(sol.solution(a1));
    }
}
