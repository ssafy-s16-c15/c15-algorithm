package algorithmstudy;
import java.util.Scanner;
// 거미줄 치기
// 2차원 배열에서 장애물 1개는 그다음으로 넘어갈 수있음 장애물 연속 2개이상이면 해당 방향 거미줄 스탑
// 한 포인트에서 가로 세로 대각선 으로  거미줄 
// 진행된 만큼 ++ 
// 각 포인트중 최대값 , 해당 포인트 출력
// 거미줄 시작 가능 포인트는 0만 가능  장애물 1
public class SpiderWeb_hw2 {
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
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (space[i][j] == 0) {
					int count = 1;
					int checkCount = 0;
					// 가로
					for (int k = j + 1; k < N; k++) {
						if (space[i][k] == 1) {
							checkCount++;
							if (checkCount >= 2) {
								break;
							}
						} else {
							checkCount = 0;
							count++;
						}
					}
					checkCount = 0;
					for (int k = j - 1; k >= 0; k--) {
						if (space[i][k] == 1) {
							checkCount++;
							if (checkCount >= 2) {
								break;
							}
						} else {
							checkCount = 0;
							count++;
						}
					}
					checkCount = 0;
					// 세로
					for (int k = i + 1; k < N; k++) {
						if (space[k][j] == 1) {
							checkCount++;
							if (checkCount >= 2) {
								break;
							}
						} else {
							checkCount = 0;
							count++;
						}
					}
					checkCount = 0;
					for (int k = i - 1; k >= 0; k--) {
						if (space[k][j] == 1) {
							checkCount++;
							if (checkCount >= 2) {
								break;
							}
						} else {
							checkCount = 0;
							count++;
						}
					}
					// 대각선 우하
					checkCount = 0;
					for (int k = 1; i + k < N && j + k < N; k++) {
						if (space[i + k][j + k] == 1) {
							checkCount++;
							if (checkCount >= 2) break;
						} else {
							checkCount = 0; 
							count++;
						}
					}
					
					// 대각선 좌상
					checkCount = 0;
					for (int k = 1; i - k >= 0 && j - k >= 0; k++) {
						if (space[i - k][j - k] == 1) {
							checkCount++;
							if (checkCount >= 2) break;
						} else {
							checkCount = 0; 
							count++;
						}
					}
					
					// 대각선 우상
					checkCount = 0;
					for (int k = 1; i - k >= 0 && j + k < N; k++) {
						if (space[i - k][j + k] == 1) {
							checkCount++;
							if (checkCount >= 2) break;
						} else {
							checkCount = 0;
							count++;
						}
					}
					
					// 대각선 좌하
					checkCount = 0;
					for (int k = 1; i + k < N && j - k >= 0; k++) {
						if (space[i + k][j - k] == 1) {
							checkCount++;
							if (checkCount >= 2) break;
						} else {
							checkCount = 0; 
							count++;
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
