package week5_1;

import java.util.Scanner;

public class Ssafy_LV3_2008_빌딩건설 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();
            char[][] matrix = new char[N][N];
            for(int i = 0; i < N; i++){
                for(int j =0; j < N; j++){
                    matrix[i][j] = sc.next().charAt(0);
                }
            }
            int[] dr = {-1,-1,-1, 0, 0, 0,+1,+1,+1};
            int[] dc = {-1, 0,+1,-1, 0,+1,-1, 0,+1};

            int max = 0;    // count랑 비교할 최대값
            for (int row = 0; row < N; row++){
                for(int col = 0; col < N; col++){
                    int count = 0;
                    if (matrix[row][col] == 'B'){
                        boolean yes = false;  // max랑 비교해서 최대값 할지말지
                        for (int d= 0; d < dr.length; d++){
                            int nr = row + dr[d];
                            int nc = col + dc[d];
                            if ( nr < 0 || nr > N-1 || nc < 0 || nc > N-1){
                                continue;
                            }
                            if (matrix[nr][nc] == 'G'){
                                yes = true;
                                count = 2;
                                break;
                            }
                        }
                        if (!yes){
                            for ( int c_col = 0; c_col< N; c_col++){
                                if (matrix[row][c_col] == 'B') count++;
                            }
                            for ( int c_row = 0; c_row< N; c_row++){
                                if (matrix[c_row][col] == 'B') count++;
                            }
                            count--;    // 현재 위치는 두번 더해졌을테니까 -1
                        }
                    }
                    if ( max < count) max = count;
                }
            }

            System.out.println("#" + test_case + " " + max);

        }   // for문

    }   // main
}
