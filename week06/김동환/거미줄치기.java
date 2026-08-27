package 알깨기b;

import java.util.Scanner;

public class 거미줄치기 {

    static int N;
    static int[][] map;

    static int[] dr = {-1, -1, 1, 1};
    static int[] dc = {-1, 1, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        map = new int[N][N];

        for (int r = 0; r < N; r++) {
            String line = sc.next();

            for (int c = 0; c < N; c++) {
                map[r][c] = line.charAt(c) - '0';
            }
        }

        int max = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {

                if (map[r][c] == 1) {
                    continue;
                }

                int count = 1;

                for (int d = 0; d < 4; d++) {
                    count += spread(r, c, d);
                }

                max = Math.max(max, count);
            }
        }

        System.out.print(max);

        sc.close();
    }

    static int spread(int r, int c, int d) {

        int count = 0;

        int nr = r + dr[d];
        int nc = c + dc[d];

        while (nr >= 0 && nr < N && nc >= 0 && nc < N) {

            if (map[nr][nc] == 0) {
                count++;
            }

            else {

                // 그 다음 칸 위치
                int nextR = nr + dr[d];
                int nextC = nc + dc[d];

                if (nextR >= 0 && nextR < N
                        && nextC >= 0 && nextC < N
                        && map[nextR][nextC] == 1) {

                    break;
                }

            }

            nr += dr[d];
            nc += dc[d];
        }

        return count;
    }
}