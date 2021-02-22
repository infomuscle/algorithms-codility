import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NF3 {

    class Solution {
        public int solution(int[] A) {

            // A를 오름차순으로 정렬한다.
            Arrays.sort(A);

            // 개선방안 1: 정렬한 A의 크기가 1이거나, 맨 앞의 원소가 음수가 아닐 경우 0 리턴
            if (A.length == 1 || A[0] >= 0) {
                return 0;
            }

            // 정수 Key와 불 Value 포맷의 맵을 생성한다.
            Map<Integer, Boolean> nums = new HashMap<>();

            // A의 각 원소를 Key로 하여 맵에 등록한다.
            for (int i = 0; i < A.length; i++) {
                nums.put(A[i], true);
            }

            int positive;
            // A의 원소를 앞에서부터 순서대로 체크한다.
            for (int i = 0; i < A.length; i++) {

                // A[i]가 음수일 경우, 절대값이 같은 양수가 맵에 있다면 양수 리턴한다.
                if (A[i] < 0) {
                    positive = A[i] * (-1);
                    if (nums.containsKey(positive)) {
                        return positive;
                    }
                } else { // A[i]가 음수가 아닐 경우, 양수와 음수를 다 갖고 있는 경우가 없으므로 바로 종료한다.
                    break;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {

        Solution sol = new NF3().new Solution();

        int[] a1 = {3, 2, -2, 5, -3};
        int[] a2 = {1, 1, 2, -1, 2, -1};
        int[] a3 = {1, 2, 3, -4};
        int[] a4 = {-1000000000, 1000000000};
        int[] a5 = {-2};

        System.out.println(sol.solution(a1));
        System.out.println(sol.solution(a2));
        System.out.println(sol.solution(a3));
        System.out.println(sol.solution(a4));
        System.out.println(sol.solution(a5));
    }
}
