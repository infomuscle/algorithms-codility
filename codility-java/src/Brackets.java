import java.util.*;

public class Brackets {

    class Solution {
        public int solution(String S) {

            Stack stack = new Stack();

            List<String> openers = Arrays.asList(new String[]{"{", "[", "("});

            Map<String, String> pairs = new HashMap<>();
            pairs.put("}", "{");
            pairs.put("]", "[");
            pairs.put(")", "(");

            String[] strings = S.split("");
            for (int i = 0; i < strings.length; i++) {
                if (openers.contains(strings[i])) {
                    stack.push(strings[i]);
                } else {
                    if (!stack.isEmpty() && stack.peek().equals(pairs.get(strings[i]))) {
                        stack.pop();
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

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
    }
}
