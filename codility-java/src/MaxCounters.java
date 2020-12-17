public class MaxCounters {

    class Solution {
        public int[] solution(int N, int[] A) {

            int maxCounter = N + 1;

            int[] answer = new int[N];
            int max = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] != maxCounter) {
                    answer[A[i] - 1] += 1;
                    if (answer[A[i] - 1] > max) {
                        max = answer[A[i] - 1];
                    }
                } else {
                    for (int j = 0; j < N; j++) {
                        answer[j] = max;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new MaxCounters().new Solution();

        int n1 = 5;
        int[] a1 = {3, 4, 4, 6, 1, 4, 4};

        System.out.println(sol.solution(n1, a1));
    }
}
