public class StoneWall {

    class Solution {
        public int solution(int[] H) {
            int answer = 0;

            int width = H.length;
            int maxHeight = 0;
            for (int i = 0; i < width; i++) {
                if (H[i] > maxHeight) {
                    maxHeight = H[i];
                }
            }

            // Init Wall
            int[][] wall = new int[maxHeight][width];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < H[i]; j++) {
                    wall[maxHeight - 1 - j][i] = 1;
                }
            }
            printWall(wall);

            return answer;
        }

        private void printWall(int[][] wall) {
            for (int i = 0; i < wall.length; i++) {
                for (int j = 0; j < wall[i].length; j++) {
                    System.out.print(wall[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {

        Solution sol = new StoneWall().new Solution();

        int[] h1 = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(sol.solution(h1));
    }
}
