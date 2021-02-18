package NF2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NF2 {

    class Solution {
        public int solution(String S) {
            int answer = 0;

            List<Character> spliters = Arrays.asList(new Character[]{'.', '?', '!'});

            List<String> sentences = new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (!spliters.contains(S.charAt(i))) {
                    sb.append(S.charAt(i));
                } else {
                    sentences.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
            sentences.add(sb.toString());

            for (String sentence : sentences) {
                String[] words = sentence.split(" ");
                int wordCnt = 0;
                for (int i = 0; i < words.length; i++) {
                    if (words[i].length() > 0) {
                        wordCnt++;
                    }
                }

                if (wordCnt > answer) {
                    answer = wordCnt;
                }
            }

            return answer;
        }
    }


    public static void main(String[] args) {

        NF2.Solution sol = new NF2().new Solution();

        String s1 = "We test coders. Give us a try?";
        String s2 = "Forget  CVs..Save time . x x";

        System.out.println(sol.solution(s1));
        System.out.println(sol.solution(s2));

    }
}


//"TEST       TEST.   TEST"
//""
//"TESTTESTTESTTESTTESTTESTTEST"
//"TEST       TEST"