import java.util.Arrays;

public class MaxProductOfThree {

    class Solution {
        public int solution(int[] A) {

            Arrays.sort(A);

            int max = 1;
            for (int i = 0; i < 3; i++) {
                max *= A[A.length - 1 - i];
            }

            if (A[0] < 0 && A[1] < 0) {
                int tmp = A[0] * A[1] * A[A.length - 1];
                if (tmp > max) {
                    max = tmp;
                }
            }

            return max;
        }
    }


    public static void main(String[] args) {

        int[] a1 = {-3, 1, 2, -2, 5, 6};
        int[] a2 = {1, 2, 3};
        int[] a3 = {-1000, -1, 2, 3, 4};
        int[] a4 = {-1000, -2, -1, 0, 3, 4};
        int[] a5 = {-3, -1, 2, 3};

        Solution sol = new MaxProductOfThree().new Solution();
        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));
        System.out.println(sol.solution(a4));
        System.out.println(sol.solution(a5));
    }
}
