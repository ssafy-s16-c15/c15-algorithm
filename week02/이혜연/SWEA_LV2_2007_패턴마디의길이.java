/*
테스트 케이스 개수 입력
문자열 최대 길이 30 / 마디 최대 길이 10
String을 잘라오는 함수가 있나????
0 i // i 2i
substring(n, m)
*/

import java.util.Scanner;

public class SWEA_LV2_2007_패턴마디의길이 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 T

        int result = 0;

        for (int testCase = 1; testCase <= T; testCase++) {

            String str = sc.nextLine();

            for (int i = 1; i < 11; i++) {
                if (str.substring(0, i) == str.substring(i, 2 * i)) {
                    result = str.substring(0, i).length();
                }
                
            }

            System.out.println("#" + testCase + " " + result);
            
        }
        
    }

}
