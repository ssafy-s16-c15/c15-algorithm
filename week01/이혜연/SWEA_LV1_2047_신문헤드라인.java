// 자바 파일 순서가 정해져 있는 이유 : 
// 자바 컴파일러가 파일을 읽을 때,
// 1. 이 클래스가 어느 패키지에 속하는지 확인 (package)
// 2. 어떤 외부 클래스를 사용할지 확인 (import)
// 3. 클래스 내용을 해석 (class)
// 순서로 처리하기 때문

// 자바 파일 순서는 정해져 있음 1. package (가장 위)

import java.util.Scanner; // 2. import 

public class SWEA_2047 { // 3. class

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 지역 변수(메서드 안에서 만든 변수)이므로 보통 main() 메서드 안에서 가장 먼저 선언  

		String headline = sc.next();
		String upper = headline.toUpperCase(); // 변수.toUpperCase(); -> 변수를 대문자로 변환해 반환 (새로운 변수에 저장 필요) 
		
		System.out.println(upper); 

	}

}
