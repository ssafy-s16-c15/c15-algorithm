import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] map = new int[N][N];
            int tmp = 0;
            int ans = 0;
            for (int r = 0; r<N; r++){
                for (int c = 0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            
            // 가로 방향 검사
            for (int r = 0; r<N; r++){
                int cnt = 0;
                for (int c = 0; c<N; c++){
                    if(map[r][c] == 1){
                        cnt++;
                    } else {
                        if (cnt == K) {
                            ans++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == K) {
                    ans++;
                }
            }
            
            // 세로 방향 검사
            for (int c= 0; c<N; c++){
                int cnt = 0;
                for (int r = 0; r<N; r++){
                    if(map[r][c] == 1){
                        cnt++;
                    } else {
                        if (cnt == K) {
                            ans++;
                        }
                        cnt = 0;
                    }
                }
                if (cnt == K) {
                    ans++;
                }
            }
            


            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}