import java.util.Stack;

public class Nesting {

    class Solution {
        public int solution(String S) {
            int answer = 0;

            if (S.length() == 0) {
                return 1;
            }

            if (S.length() % 2 != 0) {
                return 0;
            }

            Stack<Character> stack = new Stack();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(') {
                    stack.push(S.charAt(i));
                } else {
                    if (stack.isEmpty() || stack.peek() == ')') {
                        return 0;
                    }
                    stack.pop();
                }
            }

            answer = (stack.isEmpty()) ? 1 : 0;

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution sol = new Nesting().new Solution();

        String s1 = "(()(())())";
        String s2 = "())";
        String s3 = "())(";
        String s4 = "()()";
        String s5 = "))((";

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
        System.out.println(sol.solution(s4));
        System.out.println(sol.solution(s5));
    }

}
