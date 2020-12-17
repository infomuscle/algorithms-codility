/**
 * Lesson 3
 */
public class FrogJmp {

    class Solution {
        public int solution(int X, int Y, int D) {

            int answer = ((Y - X) / D);
            if ((Y - X) % D != 0) {
                answer += 1;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new FrogJmp().new Solution();

        int x1 = 10;
        int y1 = 85;
        int d1 = 30;

        int x2 = 10;
        int y2 = 1000000000;
        int d2 = 300;

        System.out.println(sol.solution(x1, y1, d1));
        System.out.println(sol.solution(x2, y2, d2));

    }
}
