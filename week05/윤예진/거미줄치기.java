
import java.util.Scanner;

public class 거미줄치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j) - '0';
            }
        }

        // 8방향 델타 배열 (dr: row 변화, dc: col 변화)
        // 상, 하, 좌, 우, 우상, 우하, 좌상, 좌하
        int[] dr = { -1, 1, 0, 0, -1, 1, -1, 1 };
        int[] dc = { 0, 0, -1, 1, 1, 1, -1, -1 };

        int maxWeb = -1;
        int startR = -1, startC = -1;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1)
                    continue; // 장애물은 시작점 될 수 없음

                int total = 1; // 시작 칸 자기 자신 포함

                for (int d = 0; d < 8; d++) {
                    int nr = r;
                    int nc = c;
                    int obstacleCount = 0; // 연속 장애물 칸 수

                    while (true) {
                        nr += dr[d];
                        nc += dc[d];

                        // 범위를 벗어나면 이 방향 탐색 종료
                        if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                            break;
                        }

                        if (board[nr][nc] == 1) {
                            obstacleCount++;
                            if (obstacleCount >= 2) {
                                // 장애물 2칸 연속이면 이 방향으로 더 진행 불가
                                break;
                            }
                            // 장애물 1칸이면 건너뛰고 계속 진행 (총 개수엔 포함 안됨)
                        } else {
                            obstacleCount = 0; // 장애물 아니면 연속 카운트 리셋
                            total++; // 거미줄 칸 수 증가
                        }
                    }
                }

                if (total > maxWeb) {
                    maxWeb = total;
                    startR = r;
                    startC = c;
                }
            }
        }

        System.out.println(maxWeb);
        System.out.println(startR + "," + startC);
    }
}
