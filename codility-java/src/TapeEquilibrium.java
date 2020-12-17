/**
 * Lesson 3
 */
public class TapeEquilibrium {

    class Solution {
        public int solution(int[] A) {

            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum += A[i];
            }

            int left = 0;
            int right = sum;

            int answer = 0;
            int diff;
            for (int i = 0; i < A.length - 1; i++) {
                left += A[i];
                right -= A[i];

                diff = Math.abs(left - right);
                if (i == 0 || diff < answer) {
                    answer = diff;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new TapeEquilibrium().new Solution();

        int[] a1 = {3, 1, 2, 4, 3};
        int[] a2 = {-2, -73};
        int[] a3 = {2, 73, 71};
        int[] a4 = {1, 1, 1, 1};
        int[] a5 = {-1, -2, -3, -4, -5};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));
        System.out.println(sol.solution(a4));
        System.out.println(sol.solution(a5));
    }
}