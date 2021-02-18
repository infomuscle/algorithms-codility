public class NF2 {

    class Solution {
        int solution(int[] A, int X) {
            int N = A.length;
            if (N == 0) {
                return -1;
            }
            int l = 0;
            int r = N - 1;
            while (l < r) {
                int m = (l + r) / 2;
                if (A[m] > X) {
                    r = m - 1;
                } else {
                    if (A[m] == X){l = m;break;}
                    else {l = m+1;}
                }
            }
            if (A[l] == X) {
                return l;
            }
            return -1;
        }
    }


    // l = 0, r = 4, m = 2, A[m] = 5, X = 2000000
    // l = 2, r = 4, m = 3, A[m] = 9, X = 2000000
    // l = 3, r = 4, m = 3, A[m] = 9, X = 1000000


    // l = 0, r = 4, m = 2, A[m] = 5, X = 2
    // l = 0, r = 1, m = 1



    public static void main(String[] args) {

        Solution sol = new NF2().new Solution();

        int[] a1 = {1, 2, 5, 9, 9};
        int[] a2 = {1, 2, 5, 9, 9, 10};
        int x1 = 5;
        int x2 = 1;
        int x3 = 2;
        int x4 = 9;
        int x5 = 2000000000;
        int x6 = -2000000000;

        System.out.println(sol.solution(a1, x1));
        System.out.println(sol.solution(a1, x2));
        System.out.println(sol.solution(a1, x3));
        System.out.println(sol.solution(a1, x4));
        System.out.println(sol.solution(a1, x5));
        System.out.println(sol.solution(a1, x6));
        System.out.println();
        System.out.println(sol.solution(a2, x1));
        System.out.println(sol.solution(a2, x2));
        System.out.println(sol.solution(a2, x3));
        System.out.println(sol.solution(a2, x4));
        System.out.println(sol.solution(a2, x5));
        System.out.println(sol.solution(a2, x6));
    }
}
