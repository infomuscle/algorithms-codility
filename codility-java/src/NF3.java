import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NF3 {

    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);
            Map<Integer, Boolean> nums = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                nums.put(A[i], true);
            }

            int positive;
            for (int i = 0; i < A.length; i++) {
                if (A[i] < 0) {
                    positive = A[i] * (-1);
                    if (nums.containsKey(positive)) {
                        return positive;
                    }
                } else {
                    break;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {

        Solution sol = new NF3().new Solution();

        int[] a1 = {3, 2, -2, 5, -3};
        int[] a2 = {1, 1, 2, -1, 2, -1};
        int[] a3 = {1, 2, 3, -4};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));


    }
}
