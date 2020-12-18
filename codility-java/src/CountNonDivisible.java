import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {

    class Solution {
        public int[] solution(int[] A) {

            Map<Integer, Integer> nonDivisors = new HashMap<>();
            for (int i = 0; i < A.length; i++) {
                if (!nonDivisors.containsKey(A[i])) {
                    nonDivisors.put(A[i], 0);
                    for (int j = 0; j < A.length; j++) {
                        if (A[i] % A[j] != 0) {
                            nonDivisors.put(A[i], nonDivisors.get(A[i]) + 1);
                        }
                    }
                }
            }

            int[] answer = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                answer[i] = nonDivisors.get(A[i]);
            }
//            printArr(answer);

            return answer;
        }

    }

    public static void main(String[] args) {


        Solution sol = new CountNonDivisible().new Solution();

        int[] a1 = {3, 1, 2, 3, 6};

        System.out.println(sol.solution(a1));
    }

    private void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
