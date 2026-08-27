package week5_2;

import java.util.Scanner;

public class SWEA_LV2_1979_어디에단어가들어갈수있을까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case =1; test_case <= T; test_case++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] puzzle = new int[N][N];
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    puzzle[i][j] = sc.nextInt();
                }
            }   // 입력

            // 정답 저장
            int ans = 0;

            // while을 써보자
            for (int row = 0; row < N; row++){
                for(int col = 0; col < N; col++){
                    if (puzzle[row][col] ==1 && (col == 0 || puzzle[row][col-1] == 0)){
//                        System.out.println("여기 가로 " + row + "랑 " + col);
                        int count = 1;
                        int next_col = 1;
                        while(col+next_col < N && puzzle[row][col+next_col] == 1){
                            next_col++;
                            count++;

                        }
//                        System.out.println(count);
                        if (count == K) ans++;
                    }
                    if (puzzle[row][col] ==1 && (row == 0 || puzzle[row-1][col] == 0)){
//                        System.out.println("여기 세로 " + row + "랑 " + col);
                        int count = 1;
                        int next_row = 1;
                        while(row + next_row < N && puzzle[row + next_row][col] == 1){
                            next_row++;
                            count++;
                        }
//                        System.out.println(count);
                        if (count == K) ans++;
                    }

                }
            }

            System.out.println("#" + test_case + " " + ans);

        }// for문

    }   // main
}
