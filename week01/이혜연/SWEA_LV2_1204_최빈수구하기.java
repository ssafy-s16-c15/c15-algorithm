import java.util.Scanner;
import java.util.Arrays;

public class SWEA_1204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T;
		T = sc.nextInt(); // 테스트 케이스 개수 입력 저장

		for (int i = 1; i <= T; i++) {

			int testCase = sc.nextInt(); // 테스트 케이스 넘버 입력 저장

			int[] scores = new int[101]; // 0 이상 100 이하인 점수 (총 101개의 점수) 크기의 배열 생성

			for (int j = 0; j < 1000; j++) {
				int score = sc.nextInt();

				scores[score] = scores[score] + 1; // scores[score]++ 과 동일

			} // 배열에 점수 1000개 입력 

			int maxCount = 0; // 가장 많이 나온 횟수
			int answer = 0; // 가장 많이 나온 횟수를 가진 점수

			for (int k = 100; k >= 0; k--) {
				if (scores[k] > maxCount) { // (j점이 나온 횟수 > 현재 가장 많이 나온 횟수)일 경우
					maxCount = scores[k]; // 가장 많이 나온 횟수를 j점이 나온 횟수로 갱신해 저장
					answer = k; // 가장 많이 나온 회수를 가진 점수 = j점
				}
			}

			System.out.println("#" + testCase + " " + answer);

		}

	} // main

}
