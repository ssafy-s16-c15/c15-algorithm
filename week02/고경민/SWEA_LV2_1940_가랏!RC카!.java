import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int speed = 0;
            int ans = 0;
            int ms = 0;
            for (int i = 0; i<N; i++) {
                int cmd = sc.nextInt();
                if (cmd == 1 || cmd == 2) {
                    ms = sc.nextInt();
                }
                if (cmd == 1){
                    speed += ms;
                } else if (cmd == 2) {
                    speed -= ms;
                    speed = Integer.max(0,speed);
                }
                ans += speed;
            }

            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}

/*
[예시 입력]

5
1 2
1 2
2 1
0
0

초기 상태
speed = 0
ans   = 0

┌──────┬─────┬─────┬─────────────┬─────────────┐
│ 순서 │ cmd │ m/s │ 현재 속도   │ 총 이동거리 │
├──────┼─────┼─────┼─────────────┼─────────────┤
│  1   │  1  │  2  │ 0 + 2 = 2   │ 0 + 2 = 2   │
│  2   │  1  │  2  │ 2 + 2 = 4   │ 2 + 4 = 6   │
│  3   │  2  │  1  │ 4 - 1 = 3   │ 6 + 3 = 9   │
│  4   │  0  │  -  │ 3 유지      │ 9 + 3 = 12  │
│  5   │  0  │  -  │ 3 유지      │ 12 + 3 = 15 │
└──────┴─────┴─────┴─────────────┴─────────────┘

최종 이동거리: 15

cmd가 1이면 가속
    speed += ms

cmd가 2이면 감속
    speed -= ms
    단, 속도는 음수가 될 수 없으므로 최소값은 0

cmd가 0이면 현재 속도 유지

각 명령을 처리한 후
    ans += speed
*/