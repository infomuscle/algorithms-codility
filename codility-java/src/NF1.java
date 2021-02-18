import java.util.HashMap;
import java.util.Map;

public class NF1 {

    class Solution {
        public int[] solution(String[] S) {

            int len = S[0].length();

            Map<Character, Map<Integer, Integer>> wordMap = new HashMap<>();
            char ch;
            for (int i = 0; i < S.length; i++) {
                for (int j = 0; j < len; j++) {
                    ch = S[i].charAt(j);
                    if (!wordMap.containsKey(ch)) {
                        wordMap.put(ch, new HashMap<Integer, Integer>());
                    }
                    wordMap.get(ch).put(i, j);
                }
            }

            System.out.println(wordMap);
            for (Map m : wordMap.values()) {
                System.out.println(m);

            }



            int[] t = {};
            return t;
        }
    }

    public static void main(String[] args) {

        Solution sol = new NF1().new Solution();

        String[] s1 = {"abc", "bca", "dbe"};
        String[] s2 = {"zzzz", "ferz", "zdsr", "fgtd"};
        String[] s3 = {"gr", "sd", "rg"};
        String[] s4 = {"bdafg", "ceagi"};

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
        System.out.println(sol.solution(s4));

    }
}
