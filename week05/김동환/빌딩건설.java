package week05-kdh;

import java.util.*;

public class 빌딩건설 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test = 1; test <= T; test++) {

            int N = sc.nextInt();

            String[][] arr = new String[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.next();
                }
            }

            int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

            int max = 0;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    if (arr[r][c].equals("G")) {
                        continue;
                    }

                    boolean hasG = false;

                    for (int d = 0; d < 8; d++) {

                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        if (nr >= 0 && nr < N && nc >= 0 && nc < N) {

                            if (arr[nr][nc].equals("G")) {
                                hasG = true;
                                break;
                            }
                        }
                    }

                    int height = 0;

                    if (hasG) {
                        height = 2;
                    }

                    else {

                        for (int j = 0; j < N; j++) {
                            if (arr[r][j].equals("B")) {
                                height++;
                            }
                        }

                        for (int i = 0; i < N; i++) {
                            if (arr[i][c].equals("B")) {
                                height++;
                            }
                        }

                        height--;
                    }

                    if (height > max) {
                        max = height;
                    }
                }
            }

            System.out.println("#" + test + " " + max);
        }
    }
}
