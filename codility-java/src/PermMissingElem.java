/**
 * Lesson 3
 */
public class PermMissingElem {

    class Solution {
        public int solution(int[] A) {

            int answer = 0;

            int[] sortedArr = new int[A.length + 2];

            for (int i = 0; i < A.length; i++) {
                sortedArr[A[i]] = A[i];
            }

            for (int i = 1; i < sortedArr.length; i++) {
                if (sortedArr[i] == 0) {
                    answer = i;
                    break;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new PermMissingElem().new Solution();

        int[] a1 = {2, 3, 1, 5};
        int[] a2 = {};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
    }
}