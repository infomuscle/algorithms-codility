/**
 * Lesson 4
 */
public class MissingInteger {

    class Solution {
        public int solution(int[] A) {

            int answer = 0;

            boolean[] pNums = new boolean[1000000 + 1];
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0) {
                    pNums[A[i]] = true;
                }
            }

            for (int i = 1; i < pNums.length; i++) {
                if (pNums[i] == false) {
                    return i;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new MissingInteger().new Solution();

        int[] a1 = {1, 3, 6, 4, 1, 2};
        int[] a2 = {-1, -3};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
    }
}
