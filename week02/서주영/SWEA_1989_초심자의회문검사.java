package LV2;

import java.util.Scanner;

public class SWEA_1989_초심자의회문검사 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트 케이스와 그에 맞는 테스트 케이스 작성: ");
		int t = sc.nextInt(); // 테스트 케이스 개수
		
		String s = sc.next();
		String[] arr = s.split("");
		int length = arr.length;
		
		int check = 0;
		int halfLength = 0;
		if (length%2==0) {
			halfLength = length/2 -1;
		} else {
			halfLength = length/2;
		}
		for (int i = 0; i<=halfLength; i++) {
			if (arr[i] == arr[length-i-1]) {
				check++;
			}
		}
		int ans = 0;
		if (length%2 == 0) {
			if (check == length/2) {
				ans = 1;
			}
		} else {
			if (check == length/2 +1) {
				ans = 0;
			}
		}
		
		System.out.println(ans);
		
	}
}
