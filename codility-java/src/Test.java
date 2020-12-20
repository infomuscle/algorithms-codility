public class Test {


    class Solution {
        public int solution(int[] A) {

            int answer = 1;

            boolean[] isIn = new boolean[1000000 + 1];
            for (int i = 0; i < A.length; i++) {
                if (A[i] > 0 && isIn[A[i]] == false) {
                    isIn[A[i]] = true;
                }
            }

            for (int i = 1; i < isIn.length; i++) {
                if (isIn[i] == false) {
                    answer = i;
                    break;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println("TEST");
    }
}
