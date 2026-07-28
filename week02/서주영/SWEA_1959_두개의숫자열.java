/* 짧은 배열 기준으로 짧배의 마지막 인덱스가 긴배의 마지막 인덱스 넘지 않게
 * 짧배[0], 긴배[0]부터 시작
 * 짧배가 인덱스 +1씩 옮기면서 곱하고 더한 값 구하기
 */

package LV2;

import java.util.Scanner;

public class SWEA_1959_두개의숫자열 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 케이스 수와 2개 배열의 길이, 배열 값을 작성: ");
		int t = sc.nextInt();
		
		int loop = 0;
		while (loop < t) {
			int nA = sc.nextInt(); // 첫번째 배열 길이
			int nB = sc.nextInt(); // 두번째 배열 길이
			
			// 배열에 값 넣기
			int[] arra = new int[nA];
			int[] arrb = new int[nB];
			
			for (int i = 0; i<nA; i++) {
				arra[i] = sc.nextInt();
			}
			for (int i = 0; i<nB; i++) {
				arrb[i] = sc.nextInt();
			}
			
			// 더 짧은 길이를 A, 아니면 B에 넣기
			boolean check = false;
			int A = 0;
			int B = 0;
			if (nA <= nB) check = true; // true(이미 A가 더 작은 배열이면 바꿀 필요 Xx)
			
			if (!check) {
				A = nB;
				B = nA;
			} else {
				A = nA;
				B = nB;
			}
			
			// 배열도 맞게 바꿔주기
			int[] arrA = new int[A];
			int[] arrB = new int[B];
			if (!check) {
				for (int i = 0; i<nB; i++) {
					arrA[i] = arrb[i];
				}
				for (int i = 0; i<nA; i++) {
					arrB[i] = arra[i];
				}
			} else {
				arrA = arra;
				arrB = arrb;
			}
			
			//-----------------------------------------
			int ans = 0;
			int cnt = 0;
			int b = 0;
			while (cnt <= B-A) {
				int c = 0;
				for (int i = 0; i<A; i++) {
					c += arrA[i] * arrB[i+b];
				}
				b++;
				ans = Math.max(ans, c);
				cnt++;
			}
			loop++;
			System.out.println("#" + loop + " " + ans);
		}
		
	}
}
