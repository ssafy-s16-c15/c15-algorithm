package algorithm;

import java.util.Arrays;

public class PROGRAMMERS_가장큰수 {
	// 숫자를 전부 이어붙여서 비교값 가장큰게 빠를지도
	// 생각해낸방법들 조낸 복잡하네
//		[6, 10, 2]
	public String solution(int[] numbers) {
		// 1. 모든 경우의수 로 숫자 합치기
		// 2. 들을 최대값과 비교후 맥스 입력

		// 숫자 문자로 변경
		String[] str = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			str[i] = numbers[i] + "";
		}

		// 숫자 붙여서 비교
		// 두자리수이상이 문제라 두 숫자 합쳐져서 더 큰게 큰값이되는듯
		// for (int i = 0; i < str.length; i++) {
		// for (int j = i + 1; j < str.length; j++) {
		// String a = str[i] + str[j];
		// String b = str[j] + str[i];
		// if (a.compareTo(b) < 0) {
		// String temp = str[i];
		// str[i] = str[j];
		// str[j] = temp;
		// }
		// }
		// } => 시간초과 거하다
		Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

		// 0이 최대 값이면 답은 0
		if (str[0].equals("0")) {
			return "0";
		}

		String answer = "";

		for (int i = 0; i < str.length; i++) {
			answer += str[i];
		}
		return answer;
	}
}
