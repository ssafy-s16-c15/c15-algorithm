package week5_1;

import java.util.Scanner;

public class Ssafy_LV4_2030_거미줄치기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for( int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] dr = {-1,-1,-1, 0, 0,+1,+1,+1};
        int[] dc = {-1, 0,+1,-1,+1,-1, 0,+1};

        int max = 0;
        int max_row = 0;
        int max_col = 0;
        for ( int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                int count = 0;  // count 는 계속 누적
                for (int k = 0; k < dr.length; k++){
                    for ( int curr_row = row, curr_col = col;
                        curr_row >= 0 && curr_row < N &&  curr_col >= 0 && curr_col < N;
                        curr_row += dr[k], curr_col += dc[k]
                    ){
                        if (matrix[curr_row][curr_col] == 0) count++;
                        else {
                            if (curr_row + dr[k] >= 0 && curr_row + dr[k] <N && curr_col + dc[k] >= 0 && curr_col + dc[k] <N&&matrix[curr_row + dr[k]][ curr_col + dc[k]] == 1) break;
                        }
                    }
                }
                if (matrix[row][col] == 0) count -= 7;
                if (max < count) {
                    max = count;
                    max_row = row;
                    max_col = col;
                }
//                System.out.println(count + " " + row + " " + col);
            }
        }

        System.out.println(max);
        System.out.println(max_row+ "," + max_col);
    }// main
}
