package LV2;

import java.util.Scanner;

public class SWEA_LV2_1986_지그재그숫자 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스 개수와 그에 맞는 테스트 케이스를 작성해 주세요: ");
        int t = sc.nextInt();

        int loop = 0;
        while (loop < t) {
        	int a = sc.nextInt();
            int ans = 0;
            for (int j = 1; j<=a; j++) {
                if (j%2 != 0) {
                    ans += j;
                } else {
                    ans -= j;
                }
            }
            loop++;
            System.out.println("#" + loop + " " + ans);
        }
    }
}
