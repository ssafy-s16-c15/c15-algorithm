import java.util.Scanner;
import java.util.Arrays;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            System.out.println("#" + tc);
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            // 우,하,좌,상
            int[] dr = {0,1,0,-1};
            int[] dc = {1,0,-1,0};
            int nr = 0;
            int nc = 0;
            int cnt = 0;
            int cr = 0;
            int cc = 0;
            for (int i = 1; i<=N*N; i++){      
                if(cr>=0 && cr<N && cc>=0 && cc<N){
                    map[cr][cc] = i;
                }
                int tmp = cnt%4;
                nr += dr[tmp];
                nc += dc[tmp];
                if (nr<0 || nr>=N || nc < 0 ||nc >=N || map[nr][nc] != 0) {
                    cnt++;
                }
                cr += dr[cnt%4];
                cc += dc[cnt%4];
                nr = cr;
                nc = cc;
            }
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            
        }
    }
}