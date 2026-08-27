package week5_2;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_LV2_1974_수도쿠검증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++){
            int[][] sudoku = new int[9][9];
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9 ; j++){
                    sudoku[i][j] = sc.nextInt();
                }
            }   // 입력용 for문

            boolean is_puzzle = true;
            // i나j % 3 ==0 일때 정사각형 비교 ㄱㄱ
            for(int row = 0; row < 9; row++){
                int[] check = new int[10];  // 0은 그냥 미리 채워놓기.
                check[0] = 2;
                for(int col = 0; col < 9; col++){
                    // 가로 -> i = 0
                    check[sudoku[row][col]]++;

                    // 세로
                    check[sudoku[col][row]]++;

                    // 네모
                    if (row % 3 == 0 && col % 3 ==0){
                        int[] small_check = new int[10];
                        small_check[0] = 1;
                        for(int small_row = row; small_row<row+3; small_row++){
                            for (int small_col = col; small_col<col+3; small_col++){
                                small_check[sudoku[small_row][small_col]]++;
                            }
                        }
                        for (int i = 0; i < 10; i++){
                            if(small_check[i] == 0) {
                                is_puzzle = false;
                                break;
                            }
                        }
                    }
                    if (!is_puzzle) break;
                }
                for(int isTwo = 0; isTwo < 9; isTwo++){
                    if (check[isTwo] != 2) {
                        is_puzzle = false;
                        break;
                    }
                }
                if (!is_puzzle) break;

            }

            if (!is_puzzle) System.out.println("#" + test_case + " " + 0);
            else System.out.println("#" + test_case + " " + 1);




        }// for문
    }   // main


}
