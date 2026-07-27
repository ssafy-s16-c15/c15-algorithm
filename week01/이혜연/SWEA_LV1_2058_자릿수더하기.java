import java.util.Scanner;

public class SWEA_LV1_2058_자릿수더하기 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;

        while (N > 0) {
            sum += N % 10; // 10으로 나눈 나머지(마지막 자릿수)를 더하기
            N /= 10; // 마지막 자릿수를 제거 
        }

        System.out.println(sum);

    }

}
