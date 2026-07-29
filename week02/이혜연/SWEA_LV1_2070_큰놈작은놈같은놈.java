import java.util.Scanner;

public class SWEA_LV1_2070_큰놈작은놈같은놈 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T;
		T = sc.nextInt();

        for (int testCase = 1; testCase <= T; testCase++) {
        
            int leftNum = sc.nextInt();
            int rightNum = sc.nextInt();
            String result;

            if (leftNum < rightNum) {
                result = "<";
            } else if (leftNum > rightNum) {
                result = ">";
            } else {
                result = "=";
            }

            System.out.println("#" + testCase + " " + result);

        }

    }

}
