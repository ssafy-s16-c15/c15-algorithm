package ssafy.algo;

import java.util.Scanner;

public class 광부게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 광산 크기 입력
        int N = sc.nextInt();

        int[][] map = new int[N][N];
        int minerR = -1, minerC = -1;

        // 광산 정보 입력 + 시작 위치(0) 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 0) {
                    minerR = i;
                    minerC = j;
                }
            }
        }

        // 이동 횟수 입력
        int M = sc.nextInt();

        int brokenCount = 0; // 부순 암석 개수

        // 상하좌우 이동을 위한 델타 배열 (U, D, L, R 순서)
        int[] dr = { -1, 1, 0, 0 };
        int[] dc = { 0, 0, -1, 1 };

        for (int m = 0; m < M; m++) {
            String cmd = sc.next();

            if (cmd.equals("X")) {
                // 다이너마이트: 주변 8방향 암석 내구도 0으로
                int[] ddr = { -1, -1, -1, 0, 0, 1, 1, 1 };
                int[] ddc = { -1, 0, 1, -1, 1, -1, 0, 1 };

                for (int d = 0; d < 8; d++) {
                    int nr = minerR + ddr[d];
                    int nc = minerC + ddc[d];

                    if (nr < 0 || nr >= N || nc < 0 || nc >= N)
                        continue;

                    if (map[nr][nc] > 0) {
                        brokenCount++; // 원래 0이 아니었던 것만 카운트
                        map[nr][nc] = 0;
                    }
                }
                // 다이너마이트는 이동 없음 -> 다음 명령으로
                continue;
            }

            // 이동 명령 -> 방향 인덱스 결정
            int idx;
            switch (cmd) {
                case "U":
                    idx = 0;
                    break;
                case "D":
                    idx = 1;
                    break;
                case "L":
                    idx = 2;
                    break;
                case "R":
                    idx = 3;
                    break;
                default:
                    continue; // 잘못된 입력은 무시
            }

            int nr = minerR + dr[idx];
            int nc = minerC + dc[idx];

            // 범위를 벗어나면 이동 불가
            if (nr < 0 || nr >= N || nc < 0 || nc >= N)
                continue;

            if (map[nr][nc] == 0) {
                // 이미 뚫려있는 길이면 곡괭이질 없이 바로 이동
                minerR = nr;
                minerC = nc;
            } else if (map[nr][nc] == 1) {
                // 내구도 1 -> 곡괭이질 한번에 부서짐 -> 이동
                map[nr][nc] = 0;
                brokenCount++;
                minerR = nr;
                minerC = nc;
            } else {
                // 내구도 2 이상 -> 곡괭이질로 내구도만 1 감소, 이동 못함
                map[nr][nc]--;
            }
        }

        // 결과 출력: 광부 위치와 부순 암석 개수
        System.out.println("광부 위치: (" + minerR + "," + minerC + ")");
        System.out.println("부순 암석 개수: " + brokenCount);

    }
}
