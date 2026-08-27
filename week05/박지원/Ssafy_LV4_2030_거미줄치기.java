package week5_1;

import java.util.Scanner;

public class Ssafy_LV4_2030_거미줄치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for( int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] dr = {-1,-1,-1, 0, 0, 0,+1,+1,+1};
        int[] dc = {-1, 0,+1,-1, 0,+1,-1, 0,+1};

        int max = 0;
        for ( int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                int count = 0;  // count 는 계속 누적, yes는 계속 초기화
                int yes = 0;
                // 왼쪽 위 dr[0]
                for ( int right_up_row = row, right_up_col = col ;
                      right_up_row>0 && right_up_col>0;
                      right_up_row += dr[0] ,right_up_col += dc[0] ){
                    if (matrix[right_up_row][right_up_col] == 0) count++;   //count는 계속 중복으로 더해지니까 마지막에 -8하기
                    else yes++;
                    if (yes >= 2) {
                        yes = 0;    // yes 다시 0으로
                        break;
                    }
                }

                // dr[1]
                for ( int up_row = row, up_col = col ;
                      up_row>0 && up_col>0;
                      up_row += dr[1] ,up_col += dc[1] ){
                    if (matrix[up_row][up_col] == 0) count++;   //count는 계속 중복으로 더해지니까 마지막에 -8하기
                    else yes++;
                    if (yes >= 2) {
                        yes = 0;    // yes 다시 0으로
                        break;
                    }
                }

                // dr[2]
                for ( int left_up_row = row, left_up_col = col ;
                      left_up_row>0 && left_up_col<N;
                      left_up_row += dr[2] ,left_up_col += dc[2] ){
                    if (matrix[left_up_row][left_up_col] == 0) count++;   //count는 계속 중복으로 더해지니까 마지막에 -8하기
                    else yes++;
                    if (yes >= 2) {
                        yes = 0;    // yes 다시 0으로
                        break;
                    }
                }
                // dr[3]
                for ( int c_row = row, c_col = col ;
                      c_row>0 && c_col<0;
                      c_row += dr[3] ,c_col += dc[3] ){
                    if (matrix[c_row][c_col] == 0) count++;   //count는 계속 중복으로 더해지니까 마지막에 -8하기
                    else yes++;
                    if (yes >= 2) {
                        yes = 0;    // yes 다시 0으로
                        break;
                    }
                }








            }
        }





    }// main
}
