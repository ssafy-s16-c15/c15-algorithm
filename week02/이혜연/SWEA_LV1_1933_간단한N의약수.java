/*
int i = 1부터 나누기 진행
나머지가 0 이면 출력 
*/

import java.util.Scanner;

public class SWEA_LV1_1933_간단한N의약수 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정수 N 입력받기

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
