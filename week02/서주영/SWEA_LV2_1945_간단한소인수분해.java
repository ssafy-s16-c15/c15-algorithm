/* N = 2^a * 3^b * 5^c * 7^d * 11^e
 * N은 2 이상, 10,000,000 이하
 * 2, 3, 5, 7, 11 순서대로 나누면서 각 개수 세기
 */
package LV2;

import java.util.Scanner;

public class SWEA_LV2_1945_간단한소인수분해 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스 개수와 그 개수에 맞는 테스트 케이스를 작성해 주세요: ");
        int t = sc.nextInt();
        int[] nArr = new int[t];
       
        
        for (int i = 0; i<t; i++) {
            nArr[i] = sc.nextInt();
        }

        int[] arr = {2, 3, 5, 7, 11};
        int[] result = new int[arr.length];

        for (int N : nArr) {
            for (int i = 0; i<arr.length; i++) {
                int cnt = 0;
                if (N%arr[i] == 0) {
                    result[i] = cnt++;
                }
            }
            for (int i = 0; i<result.length; i++) {
                System.out.print("#" + i+1 + " " + result[i]);
            }
        }

    }
}