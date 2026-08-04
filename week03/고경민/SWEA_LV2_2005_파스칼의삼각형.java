import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            System.out.println("#"+tc);
            int N = sc.nextInt();
            int[][] triangle = new int[N][N];
            for(int i = 0; i<N; i++) {
                for(int j = 0; j<=i; j++){
                    if(j == 0 || j == i){
                        triangle[i][j] = 1;
                    } else {
                        triangle[i][j] = triangle[i-1][j-1] +triangle[i-1][j];
                    }
                    System.out.print(triangle[i][j] + " "); 
                }
                System.out.println(); 
            }
        }
    }
}