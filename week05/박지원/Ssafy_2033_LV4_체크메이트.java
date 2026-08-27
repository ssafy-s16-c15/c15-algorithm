package week5_1;

import java.util.Scanner;

public class Ssafy_2033_LV4_체크메이트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case<=T; test_case++){
            int N = sc.nextInt();
            int w_row = sc.nextInt()-1;
            int w_col = sc.nextInt()-1;
            int b_row = sc.nextInt()-1;
            int b_col = sc.nextInt()-1;
            int[][] matrix = new int[N][N];

            matrix[w_row][w_col] = 100;
            matrix[b_row][b_col] = 200;

            int[] dr = {-1,-1,-1, 0, 0,+1,+1,+1};
            int[] dc = {-1, 0,+1,-1,+1,-1, 0,+1};
            boolean win = false;
            for (int k =0; k< dr.length; k++){
                for ( int n_row = w_row + dr[k], n_col = w_col + dc[k];
                    n_row >= 0 && n_row < N && n_col >= 0 && n_col < N;
                    n_row += dr[k], n_col += dc[k]
                ){
                    if (matrix[n_row][n_col] == 200) {
                        win = true;
                        break;
                    }
                }
                if (win) break;
            }
            if (win){
                System.out.println("#" + test_case + " " + 1);
            } else System.out.println("#" + test_case + " " + 0);
        }
    }
}
