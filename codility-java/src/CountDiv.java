public class CountDiv {

    class Solution {
        public int solution(int A, int B, int K) {
            int answer = 0;

            if (A == 0 && B == 0) {
                return 1;
            }

            int start = A;
            for (int i = start; i <= B; i++) {
                if (i % K == 0 && i >= A) {
                    start = i;
                    break;
                }
            }

            int end = B;
            for (int i = end; i >= start; i--) {
                if (i % K == 0 && i <= B) {
                    end = i;
                    break;
                }
            }

            if (K <= end && start % K == 0) {
                answer = (end - start) / K + 1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution sol = new CountDiv().new Solution();

        int a1 = 6;
        int b1 = 11;
        int k1 = 2;

        int a2 = 2000000000;
        int b2 = 2000000000;
        int k2 = 2000000000;

        int a3 = 0;
        int b3 = 2000000000;
        int k3 = 2000000000;

        int a4 = 0;
        int b4 = 1;
        int k4 = 1;

        int a5 = 10;
        int b5 = 10;
        int k5 = 5;

        int a6 = 0;
        int b6 = 2000000000;
        int k6 = 1000000000;


        System.out.println(sol.solution(a1, b1, k1));
        System.out.println(sol.solution(a2, b2, k2));
        System.out.println(sol.solution(a3, b3, k3));
        System.out.println(sol.solution(a4, b4, k4));
        System.out.println(sol.solution(a5, b5, k5));
        System.out.println(sol.solution(a6, b6, k6));
    }
}