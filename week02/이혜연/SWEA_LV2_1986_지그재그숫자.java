import java.util.Scanner;

public class SWEA_LV2_1986_지그재그숫자 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt(); // 테스트 케이스 수 입력 받기

        for (int testCase = 1; testCase <= T; testCase++) { // T만큼 반복

            int N = sc.nextInt();
            int result = 0;

            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) { // 짝수인 경우
                    result -= i;
                } else { // 홀수인 경우
                    result += i;
                }
            }
            
            System.out.println("#" + testCase + " " + result);

        }
    }    
}
