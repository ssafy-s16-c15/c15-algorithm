import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            System.out.printf("#%d%n",tc);
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            for (int i = 0; i<N; i++){
                for (int j = 0; j<N; j++){
                    map[i][j] = sc.nextInt();
                }
            }
            
            for (int r = 0; r<N; r++){
                // 90도
                for (int c = 0; c<N; c++){
                    System.out.print(map[N-1-c][r]);
                }
                
                System.out.print(" ");
                
                // 180도
                for (int c = 0; c<N; c++){
                    System.out.print(map[N-1-r][N-1-c]);
                }
                
                System.out.print(" ");

                // 270도
                for (int c = 0; c<N; c++){
                    System.out.print(map[c][N-1-r]);
                }
                
                System.out.println();
            }
        }
    }
}