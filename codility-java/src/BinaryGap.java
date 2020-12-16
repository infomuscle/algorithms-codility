import java.util.ArrayList;
import java.util.List;

/**
 * Lesson 1
 */
public class BinaryGap {
    class Solution {
        public int solution(int N) {

            int answer = 0;

            String bin = Integer.toBinaryString(N);
//            System.out.println(bin);

            List<Integer> indice = new ArrayList<Integer>();
            for (int i = 0; i < bin.length(); i++) {
//                System.out.println(bin.charAt(i));
                if ('1' == bin.charAt(i)) {
                    indice.add(i);
                }
            }
//            System.out.println(indice);

            int temp = 0;
            if (indice.size() >= 2) {
                for (int i = 0; i < indice.size() - 1; i++) {
                    temp = indice.get(i + 1) - indice.get(i) - 1;
                    if (temp > answer) {
                        answer = temp;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution sol = new BinaryGap().new Solution();

        int n1 = 1041;
        int n2 = 32;

        System.out.println(sol.solution(n1));
        System.out.println(sol.solution(n2));

    }
}
