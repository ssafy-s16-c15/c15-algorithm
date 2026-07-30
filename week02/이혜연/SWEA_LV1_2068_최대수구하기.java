import java.util.Scanner;

public class SWEA_LV1_2068_최대수구하기 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 입력 받기 

        for (int testCase = 1; testCase <= T; testCase++) {

            int max = sc.nextInt(); // 주어진 10개 수 중 첫번째 수를 최대값이라고 설정 

            for (int i = 1; i < 10; i++) { // 두번째 수부터 열번째 수까지 반복 
                int num = sc.nextInt();
                if (max < num) { // 새로 입력받은 수가 max보다 크면
                    max = num; // 새로운 값을 max로 설정 
                }
            }

            System.out.println("#" + testCase + " " + max);

        } // 테스트 케이스 수만큼 반복 

    }

}
