import java.util.*;

public class NF3 {

    class Solution {
        public int solution(String S) {
            int answer = 0;

            Character[] position = new Character[S.length() + 1];
            Map<Integer, List<Character>> countMap = new HashMap<>();
            Map<Character, Integer> characterMap = new HashMap<>();

            for (int i = 0; i < S.length(); i++) {
                Character chr = S.charAt(i);
                if (!characterMap.containsKey(chr)) {
                    characterMap.put(chr, 0);

                }
                characterMap.put(S.charAt(i), characterMap.get(chr) + 1);
            }

            for (Character key : characterMap.keySet()) {
                int count = characterMap.get(key);
                if (!countMap.containsKey(count)) {
                    countMap.put(count, new ArrayList<>());
                }
                countMap.get(count).add(key);

            }

            for (Integer count : countMap.keySet()) {
                List<Character> chrList = countMap.get(count);
                if (chrList.size() == 1) {
                    position[count] = chrList.get(0);
                } else {
                    for (int i = 1; i < chrList.size(); i++) {
                        int current = count;
                        while (chrList.size() != 1) {
                            answer += 1;
                            current -= 1;
                            if (current == 0 || position[current] == null) {
                                position[count - current] = chrList.get(i);
                                break;
                            }
                        }
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        NF3.Solution sol = new NF3().new Solution();

        String s1 = "aaaabbbb";
        String s2 = "ccaaffddecee";
        String s3 = "eeee";
        String s4 = "example";

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));
        System.out.println(sol.solution(s3));
        System.out.println(sol.solution(s4));
    }

}
