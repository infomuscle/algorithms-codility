import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NF1 {

    class Solution {
        public int[] solution(String[] S) {

            // 문자열의 길이(M)을 구한다.
            // 배열 S의 길이가(N) 1~30000이기 때문에 S[0]을 집어도 예외 발생 X.
            int len = S[0].length();

            // {"문자" : {문자열 내에서의 위치: [해당 위치에 해당 문자를 갖고 있는 문자열의 인덱스]}}인 맵 생성.
            // [“abc”, “ade”, “xyz”, "qrz"] -> {“a”: {0: [0,1]}, "z": {2: [2,3]}}
            Map<Character, Map<Integer, ArrayList<Integer>>> wordMap = new HashMap<>();

            // S의 각 문자열들을 처리.
            char ch;
            for (int i = 0; i < S.length; i++) { // S.length == N

                // 문자열 S[i]의 각 문자들을 맵에 넣는다.
                // N * M <= 30000이라 시간복잡도에는 큰 이슈 없을 것.
                for (int j = 0; j < len; j++) { // len == M
                    ch = S[i].charAt(j);

                    // 문자 ch가 처음 나오는 거면, Key ch의 Value로 빈 맵 생성하여 넣는다.
                    if (!wordMap.containsKey(ch)) {
                        wordMap.put(ch, new HashMap<Integer, ArrayList<Integer>>());
                    }
                    // 문자 ch의 Value인 맵 안에 문자의 인덱스 j가 없으면, Key j의 Value로 빈 리스트 생성하여 넣는다.
                    if (!wordMap.get(ch).containsKey(j)) {
                        wordMap.get(ch).put(j, new ArrayList<>());
                    }

                    // 문자 ch -> 인덱스 j -> 리스트에 S에서 문자열의 위치 추가
                    wordMap.get(ch).get(j).add(i);
                }
            }
            System.out.println(wordMap);

            // 빈 문자열 생성한다.
            int[] answer = {};
            for (Character chKey : wordMap.keySet()) { // 최대 26번
                for (Integer intKey : wordMap.get(chKey).keySet()) { // 최대 2000(M)
                    // 문자 ch가 문자열 내 인덱스에 등장한 횟수가 2보다 클 경우 정답에 해당.
                    if (wordMap.get(chKey).get(intKey).size() >= 2) {
                        // 리스트의 크기가 2보다 크니깐 0, 1 다 집어도 예외 발생 X.
                        answer = new int[3];
                        answer[0] = wordMap.get(chKey).get(intKey).get(0);  // <- 문자 ch가 인덱스 j에 등장한 첫번째 문자열의 인덱스.
                        answer[1] = wordMap.get(chKey).get(intKey).get(1);  // <- 문자 ch가 인덱스 j에 등장한 두번째 문자열의 인덱스.
                        answer[2] = intKey;                                 // <- 위 두 문자열들에서 문자 ch의 인덱스 j.
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
