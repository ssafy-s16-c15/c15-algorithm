package algorithmstudy;

import java.util.Scanner;

public class SpiderWeb_hw2_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[][] space = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                space[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;
        int maxX = 0;
        int maxY = 0;
        
        // 상, 하, 좌, 우, 우상, 우하, 좌상, 좌하 (총 8방향 대각선 포함)
        int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};
        int[] dy = {0, 0, -1, 1, 1, 1, -1, -1};
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
                // 거미줄 시작 가능 포인트는 0만 가능
                if (space[i][j] == 0) {
                    int count = 1; // 시작 포인트 자기 자신 포함
                    
                    // 8방향 탐색
                    for (int d = 0; d < 8; d++) {
                        int checkCount = 0; // 연속된 장애물 수 카운트
                        int nx = i;
                        int ny = j;
                        
                        while (true) {
                            nx += dx[d];
                            ny += dy[d];
                            
                            // 배열 범위를 벗어나면 해당 방향 스탑
                            if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                                break;
                            }
                            
                            if (space[nx][ny] == 1) {
                                checkCount++;
                                // 장애물이 연속 2개 이상이면 스탑
                                if (checkCount >= 2) {
                                    break;
                                }
                            } else {
                                // 빈칸(0)을 만나면 연속 장애물 카운트 리셋
                                checkCount = 0; 
                                count++;
                            }
                        }
                    }
                    
                    if (count > max) {
                        max = count;
                        maxX = i;
                        maxY = j;
                    }
                }
            }
        }
        
        System.out.println(max);
        System.out.println(maxX + "," + maxY);
        sc.close();
    }
}
