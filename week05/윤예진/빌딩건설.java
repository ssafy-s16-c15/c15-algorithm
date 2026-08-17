package ssafy.algo;

import java.util.Scanner;

public class 빌딩건설 {
    public static void main(String[] args) {
        int N;
        char[][] map;
        int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(sc.nextLine().trim());
            map = new char[N][N];

            for (int i = 0; i < N; i++) {
                String[] tokens = sc.nextLine().trim().split("\\s+");
                for (int j = 0; j < N; j++) {
                    map[i][j] = tokens[j].charAt(0);
                }
            }

            int maxHeight = 0;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if (map[r][c] != 'B')
                        continue;

                    int height;

                    if (isParkNearby(map, N, dr, dc, r, c)) {
                        height = 2;
                    } else {
                        int rowCount = countRow(map, N, r);
                        int colCount = countCol(map, N, c);
                        height = rowCount + colCount - 1; // 현재 칸 중복 보정
                    }

                    if (height > maxHeight) {
                        maxHeight = height;
                    }
                }
            }

            System.out.println("#" + tc + " " + maxHeight);
        }
    }

    // 인접 8방향에 G 가 있는지 체크
    static boolean isParkNearby(char[][] map, int N, int[] dr, int[] dc, int r, int c) {
        for (int d = 0; d < 8; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];
            if (nr < 0 || nr >= N || nc < 0 || nc >= N)
                continue;
            if (map[nr][nc] == 'G')
                return true;
        }
        return false;
    }

    // 해당 행의 B 개수
    static int countRow(char[][] map, int N, int r) {
        int cnt = 0;
        for (int j = 0; j < N; j++) {
            if (map[r][j] == 'B')
                cnt++;
        }
        return cnt;
    }

    // 해당 열의 B 개수
    static int countCol(char[][] map, int N, int c) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (map[i][c] == 'B')
                cnt++;
        }
        return cnt;
    }
}
