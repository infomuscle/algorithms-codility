import java.util.Stack;

/**
 * Lesson 7
 */
public class Fish {

    class Solution {
        public int solution(int[] A, int[] B) {
            int answer = 1;

            Stack<FishN> alives = new Stack();
            for (int i = 0; i < A.length; i++) {
                FishN fishN = new FishN(i, A[i], B[i]);
                if (alives.isEmpty()) {
                    alives.push(fishN);
                    continue;
                }

                boolean goNext = false;
                while (!alives.isEmpty()
                        && alives.peek().direction == 1
                        && fishN.direction == 0) {
                    if (alives.peek().size < fishN.size) {
                        alives.pop();
                    } else {
                        goNext = true;
                        break;
                    }
                }

                if (goNext) {
                    continue;
                }

                alives.push(fishN);
            }
            answer = alives.size();


            return answer;
        }
    }

    class FishN {

        int number;
        int direction;
        int size;

        FishN(int number, int size, int direction) {
            this.number = number;
            this.size = size;
            this.direction = direction;
        }
    }

    public static void main(String[] args) {

        Solution sol = new Fish().new Solution();

        int[] a1 = {4, 3, 2, 1, 5};
        int[] b1 = {0, 1, 0, 0, 0};

        System.out.println(sol.solution(a1, b1));
    }
}
