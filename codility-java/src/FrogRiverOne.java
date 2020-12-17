/**
 * Lesson 4
 */
public class FrogRiverOne {

    class Solution {
        public int solution(int X, int[] A) {

            boolean[] leaves = new boolean[X + 1];
            leaves[0] = true;

            int cnt = 0;
            for (int i = 0; i < A.length; i++) {
                if (leaves[A[i]] == false) {
                    leaves[A[i]] = true;
                    cnt++;
                }

                if (cnt == X) {
                    return i;
                }
            }

            return -1;
        }
    }

    public static void main(String[] args) {

        Solution sol = new FrogRiverOne().new Solution();

        int x1 = 5;
        int[] a1 = {1, 3, 1, 4, 2, 3, 5, 4};

        int x2 = 100000;
        int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(sol.solution(x1, a1));
        System.out.println(sol.solution(x2, a2));
    }
}
