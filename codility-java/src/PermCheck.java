import java.util.Arrays;

/**
 * Lesson 4
 */
public class PermCheck {

    class Solution {
        public int solution(int[] A) {

            Arrays.sort(A);

            if (A[0] != 1) {
                return 0;
            }

            for (int i = 0; i < A.length - 1; i++) {
                if (A[i + 1] != A[i] + 1) {
                    return 0;
                }
            }
            return 1;
        }
    }


    public static void main(String[] args) {
        Solution sol = new PermCheck().new Solution();

        int[] a1 = {4, 1, 3, 2};
        int[] a2 = {4, 1, 2};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
    }
}
