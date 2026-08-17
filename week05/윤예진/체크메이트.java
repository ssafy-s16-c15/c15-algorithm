package ssafy.algo;

import java.util.Scanner;

public class 체크메이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(sc.nextLine().trim());

            int kingX = sc.nextInt();
            int kingY = sc.nextInt();
            int queenX = sc.nextInt();
            int queenY = sc.nextInt();
            sc.nextLine(); // 다음 줄 읽기 전에 개행 처리

            // 킹과 퀸의 가로좌표 차이(절댓값) - 몇 칸 떨어져 있는지
            int dx = Math.abs(kingX - queenX);

            // 킹과 퀸의 세로좌표 차이(절댓값) - 몇 칸 떨어져 있는지
            int dy = Math.abs(kingY - queenY);

            // 결과값 저장 변수, 기본값은 "공격 불가능(0)"으로 초기화
            int result = 0;

            // dx == 0 : 가로좌표가 같음 -> 같은 세로줄(열)에 있음 -> 공격 가능
            // dy == 0 : 세로좌표가 같음 -> 같은 가로줄(행)에 있음 -> 공격 가능
            // dx == dy : 가로/세로 차이가 같음 -> 대각선 위에 있음 -> 공격 가능
            if (dx == 0 || dy == 0 || dx == dy) {
                result = 1; // 셋 중 하나라도 해당하면 공격 가능(1)으로 변경
            }

            System.out.println("#" + tc + " " + result);
        }
    }
}
