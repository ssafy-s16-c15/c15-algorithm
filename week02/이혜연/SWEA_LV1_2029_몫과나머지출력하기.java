import java.util.Scanner;

public class SWEA_LV1_2029_몫과나머지출력하기 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T;
		T = sc.nextInt();

        for (int testCase = 1; testCase <= T; testCase++) {

            int dividend = sc.nextInt();
            int divisor = sc.nextInt();

            int quotient = dividend / divisor; // 몫
            int remainder = dividend % divisor; // 나머지

            System.out.println("#" + testCase + " " + quotient + " " + remainder);

        }

    }

}
