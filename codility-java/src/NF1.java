import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NF1 {

    class Solution {
        public int[] solution(String[] S) {

            int len = S[0].length();

            Map<Character, Map<Integer, ArrayList<Integer>>> wordMap = new HashMap<>();
            char ch;
            for (int i = 0; i < S.length; i++) {
                for (int j = 0; j < len; j++) {
                    ch = S[i].charAt(j);
                    if (!wordMap.containsKey(ch)) {
                        wordMap.put(ch, new HashMap<Integer, ArrayList<Integer>>());
                    }
                    if (!wordMap.get(ch).containsKey(j)) {
                        wordMap.get(ch).put(j, new ArrayList<>());
                    }
                    wordMap.get(ch).get(j).add(i);
                }
            }

            int[] answer = {};
            for (Character chKey : wordMap.keySet()) {
                for (Integer intKey : wordMap.get(chKey).keySet()) {
                    if (wordMap.get(chKey).get(intKey).size() >= 2) {
                        answer = new int[3];
                        answer[0] = wordMap.get(chKey).get(intKey).get(0);
                        answer[1] = wordMap.get(chKey).get(intKey).get(1);
                        answer[2] = intKey;
                        break;
                    }
                }
            }

            return answer;
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
