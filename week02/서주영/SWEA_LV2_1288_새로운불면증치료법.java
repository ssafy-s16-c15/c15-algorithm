/* N의 배수 번호인 양 세기
 * N번 -> N*2번 -> N*3번 . . . N*k번
 * 셌던 번호들의 각 자리수에서 0~9까지 모든 숫자가 나오려면 최소 몇 번 양을 세야 하나?
 * ex) N=1295
 * 1295 1번: 1 2 9 5
 * 2590 2번: 0 1 2 5 9
 * 3885 3번: 0 1 2 3 5 8 9
 * 5180 4번: 0 1 2 3 5 8 9
 * 6475 5번: 0 1 2 3 4 5 6 7 8 9 <- 끝! answer은 6475
 * ----------
 * 0~9 인덱스 가진 배열 생성 -> switch로 해당하는 칸 채우기 -> 반복문으로 돌면서 빈 칸 있나 확인 -> 없으면 그때의 answer 출력
 */

package LV2;

import java.util.Scanner;

public class SWEA_LV2_1288_새로운불면증치료법 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("테스트 케이스와 그에 맞는 테스트 케이스를 작성해 주세요: ");
        int t = sc.nextInt();

        int[] arr = new int[10];
        boolean b = false;
        boolean zero = false;
        int count = 0;
        
        int loop = 0;
        while (loop < t) {
        	int cm = sc.nextInt();
            int g = 2; // 곱하기
            while (!b && !zero) { // 모든 숫자가 초깃값(0)이 아닐 때까지 반복
                String[] sArr = String.valueOf(cm).split("");
                for (String s : sArr) {
                    arr[Integer.parseInt(s)] = Integer.parseInt(s);
                    if (s.equals("0")) {
                        zero = true;
                    } // 0 등장
                } // 배열에 등장한 숫자 넣기
                for (int check = 1; check<10; check++) {
                    if (arr[check] == 0) {
                        count++;
                    }
                } // 현재 배열에서 아직 초기값(0)인 개수 세기 (0은 따로 체크할거임)
                if (count == 0) {
                    b = true;
                } // 초기값이 없으면 count가 0이 됨 = 모든 숫자가 나온 것

                cm *= g++;
            } // 배열이 다 찰 때까지 반복 boolean b로 확인
            
            loop++;
            System.out.println("#" + loop + cm*(g-1));
        	
        }
    }
}
