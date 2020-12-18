import java.util.*;

/**
 * Lesson 7
 */
public class Brackets {

    class Solution {
        public int solution(String S) {

            if (S.length() == 0) {
                return 1;
            }

            if (S.length() % 2 != 0) {
                return 0;
            }

            Stack stack = new Stack();

            List<Character> openers = Arrays.asList(new Character[]{'{', '[', '('});

            Map<Character, Character> pairs = new HashMap<>();
            pairs.put('}', '{');
            pairs.put(']', '[');
            pairs.put(')', '(');

            for (int i = 0; i < S.length(); i++) {
                if (openers.contains(S.charAt(i))) {
                    stack.push(S.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return 0;
                    } else {
                        if (stack.peek().equals(pairs.get(S.charAt(i)))) {
                            stack.pop();
                        }
                    }

                }
            }

            int answer = (stack.isEmpty()) ? 1 : 0;

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Brackets().new Solution();

        String s1 = "{[()()]}";
        String s2 = "([)()]";
        String s3 = "";
        String s4 = "[][][][][][][]";
        String s5 = "[";

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
        System.out.println(sol.solution(s4));
        System.out.println(sol.solution(s5));
    }
}
