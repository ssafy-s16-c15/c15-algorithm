/*
N 크기 배열 생성
오름차순 정렬
출력 
*/

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_LV2_1966_숫자를정렬하자 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 T

        for (int testCase = 1; testCase <= T; testCase++) {

            int N = sc.nextInt(); // N 길이의 숫자열 

            int[] arr = new int[N]; // N 크기의 배열 생성 

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            } // 배열에 값 넣기 

            Arrays.sort(arr); // 배열 오름차순 정렬 

            System.out.print("#" + testCase + " "); // 테스트 케이스 번호 출력
            for (int i = 0; i < N; i++) { 
                System.out.print(arr[i] + " ");
            } // 배열 출력 
            System.out.println(); // 테스트 케이스 넘어갈 때 줄 바꿈 
            
        }
        
    }

}
