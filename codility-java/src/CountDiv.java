public class CountDiv {

    class Solution {
        public int solution(int A, int B, int K) {
            int answer = 0;

            if (K == 1) {
                return B - A + 1;
            }

            int start = A;
            for (int i = start; i <= B; i++) {
                if (i % K == 0 && i >= A) {
                    start = i;
                    break;
                }
            }

            for (long i = start; i <= B; i += K) {
                if (i % K == 0 && i <= B) {
                    answer += 1;
                }
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
        int b4 = 0;
        int k4 = 1;

        int a5 = 10;
        int b5 = 10;
        int k5 = 20;


        System.out.println(sol.solution(a1, b1, k1));
        System.out.println(sol.solution(a2, b2, k2));
        System.out.println(sol.solution(a3, b3, k3));
        System.out.println(sol.solution(a4, b4, k4));
        System.out.println(sol.solution(a5, b5, k5));
    }
}