/* A사: 1리터당 P원
 * B사: 기본 요금이 Q원 & 월간 사용량이 R리터 이하면 기본 요금만 청구 & R리터 넘으면 1리터당 S원
 * 종민이 집에서 사용하는 수도의 양은 W리터
 * 더 저렴한 요금 출력
 * P, Q, R, S, W 순서대로 테스트 케이스 주어짐
 */

package LV2;

import java.util.Scanner;

public class SWEA_LV2_1284_수도요금경쟁 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스 수와 테스트 케이스 작성: ");
        int t = sc.nextInt(); // 테스트 케이스 수

        int loop = 0;
        while (loop < t) {
            int ans = 0;
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();

            // A사
            int A = W*P;

            // B사
            int B = 0;
            if (W <= R) {
                B = Q;
            } else {
                B = Q + ((W-R)*S);
            }

            // 비교
            if (A <= B) {
                ans = A;
            } else {
                ans = B;
            }
            
            loop++;
            System.out.println("#" + loop + " " + ans);
        	
        }
    }
}
