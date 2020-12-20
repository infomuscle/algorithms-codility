public class NF1 {

    class Solution {
        public int solution(int[] S) {
            int max_sum = 0;
            int current_sum = 0;
            boolean positive = false;
            int n = S.length;
            for (int i = 0; i < n; ++i) {
                int item = S[i];
                if (item < 0) {
                    if (max_sum < current_sum) {
                        max_sum = current_sum;
                        current_sum = 0;
                    }
                } else {
                    positive = true;
                    current_sum += item;
                }
            }
            if (current_sum > max_sum) {
                max_sum = current_sum;
            }
            if (positive) {
                return max_sum;
            }
            return -1;
        }
    }


    public static void main(String[] args) {

        Solution sol = new NF1().new Solution();

        int[] a1 = {1, 2, -3, 4, 5, -6};
        int[] a2 = {1, 2, 3, 4, 5};
        int[] a3 = {-1, -2, -3, -4, -5};
        int[] a4 = {0};
        int[] a5 = {};
        int[] a6 = {-1, -2, 3, -4, -5};
        int[] a7 = {-1, 9, 3, -3, 2, -5};
        int[] a8 = {-1};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));
        System.out.println(sol.solution(a4));
        System.out.println(sol.solution(a5));
        System.out.println(sol.solution(a6));
        System.out.println(sol.solution(a7));
        System.out.println(sol.solution(a8));

    }
}


// Original
//class Solution {
//    public int solution(int[] S) {
//        int max_sum = 0;
//        int current_sum = 0;
//        boolean positive = false;
//        int n = S.length;
//        for (int i = 0; i < n; ++i) {
//            int item = S[i];
//            if (item < 0) {
//                if (max_sum < current_sum) {
//                    max_sum = current_sum;
//                    current_sum = 0;
//                }
//            } else {
//                positive = true;
//                current_sum += item;
//            }
//        }
//        if (current_sum > max_sum) {
//            max_sum = current_sum;
//        }
//        if (positive) {
//            return max_sum;
//        }
//        return -1;
//    }
//}