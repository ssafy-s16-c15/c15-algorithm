import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] map = new int[N][N];
            
            int max = 0;
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    map[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<N-M+1; i++){
                for(int j = 0; j<N-M+1; j++){
                    int tempSum = 0;
                    
                    for(int r = 0; r<M; r++){
                        for(int c = 0; c<M; c++){
                            tempSum += map[i+r][j+c];
                        }
                    }
                    max = Math.max(max, tempSum);
                }
            }
            int ans = max;

            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}