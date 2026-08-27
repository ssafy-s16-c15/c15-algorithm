package week5_1;

import java.util.Scanner;

public class Ssafy_LV5_2034_광부게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        int start_row=0;
        int start_col=0;
        for( int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0){
                    start_row = i;
                    start_col = j;
                }
            }
        }
        int M = sc.nextInt();   // 행동의 수
        int[] dr = {-1,-1,-1, 0, 0,+1,+1,+1};
        int[] dc = {-1, 0,+1,-1,+1,-1, 0,+1};
        int curr_row = start_row;
        int curr_col = start_col;
        int break_count = 0;
        for ( int m = 0; m < M; m++){
            String str = sc.next();
            if (str.equals("D")){
                if (matrix[curr_row+1][curr_col] == 0) {
                    curr_row++;
                    continue;
                }
                if (--matrix[curr_row+1][curr_col] == 0) {
                    curr_row++;
                    break_count++;
                }
            } else if (str.equals("U")){
                if (matrix[curr_row-1][curr_col] == 0) {
                    curr_row--;
                    continue;
                }
                if (--matrix[curr_row-1][curr_col] == 0) {
                    curr_row--;
                    break_count++;
                }
            } else if (str.equals("L")){
                if (matrix[curr_row][curr_col-1] == 0) {
                    curr_col--;
                    continue;
                }
                if (--matrix[curr_row][curr_col-1] == 0) {
                    curr_col--;
                    break_count++;
                }
            } else if (str.equals("R")){
                if (matrix[curr_row][curr_col+1] == 0) {
                    curr_col++;
                    continue;
                }
                if (--matrix[curr_row][curr_col+1] == 0) {
                    curr_col++;
                    break_count++;
                }
            } else{
                for (int k = 0; k < dr.length; k++){
                    if (matrix[curr_row+dr[k]][curr_col+dc[k]] != 0) {
                        matrix[curr_row+dr[k]][curr_col+dc[k]] = 0;
                        break_count++;
                    }
                }
            }
        }
        System.out.println("광부 위치 : " + "(" + curr_row + "," + curr_col + ")");
        System.out.println("부순 암석 개수 : "+break_count);

    }// main
}
