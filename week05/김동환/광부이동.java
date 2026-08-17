package week05;

import java.util.Scanner;

public class 광부이동 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] map = new int[N][N];

        int r = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.next();

            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';

                if (map[i][j] == 0) {
                    r = i;
                    c = j;
                }
            }
        }

        int M = sc.nextInt();

        int brokenCount = 0;

        for (int i = 0; i < M; i++) {

            char command = sc.next().charAt(0);

            if (command == 'X') {

                for (int dr = -1; dr <= 1; dr++) {
                    for (int dc = -1; dc <= 1; dc++) {

                        if (dr == 0 && dc == 0) {
                            continue;
                        }

                        int nr = r + dr;
                        int nc = c + dc;

                        if (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                            map[nr][nc] = 0;
                        }
                    }
                }

            } else {

                int nr = r;
                int nc = c;

                if (command == 'U') {
                    nr--;
                } else if (command == 'D') {
                    nr++;
                } else if (command == 'L') {
                    nc--;
                } else if (command == 'R') {
                    nc++;
                }

                if (nr >= 0 && nr < N && nc >= 0 && nc < N) {

                    if (map[nr][nc] > 0) {

                        map[nr][nc]--;

                        if (map[nr][nc] == 0) {
                            brokenCount++;
                            r = nr;
                            c = nc;
                        }

                    } else {

                        r = nr;
                        c = nc;
                    }
                }
            }
        }

        System.out.println("광부 위치 : (" + r + "," + c + ")");
        System.out.println("부순 암석 개수 : " + brokenCount);

    }
}