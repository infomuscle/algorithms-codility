/**
 * Lesson 2
 */
public class CyclicRotation {

    class Solution {
        public int[] solution(int[] A, int K) {

            int length = A.length;
            if (length == 0) {
                return A;
            }

            int[] answer = new int[length];

            int moveCnt = K % length;

            int idx = moveCnt;
            for (int i = 0; i < length; i++) {
                answer[idx++] = A[i];
                if (idx >= length) {
                    idx = 0;
                }
            }

            return answer;
        }
    }


    public static void main(String[] args) {
        Solution sol = new CyclicRotation().new Solution();

        int[] a1 = {3, 8, 9, 7, 6};
        int k1 = 3;
        int[] a2 = {};
        int k2 = 1;
        int[] a3 = {1, 2, 3};
        int k3 = 0;

        sol.solution(a1, k1);
        sol.solution(a2, k2);
        sol.solution(a3, k3);
    }

}
