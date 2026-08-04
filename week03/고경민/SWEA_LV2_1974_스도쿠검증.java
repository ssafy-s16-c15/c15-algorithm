import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int[][] sudoku = new int[9][9];
            for(int i= 0; i<9; i++){
             	for(int j= 0; j<9; j++){
                	sudoku[i][j] = sc.nextInt();
            	}   
            }
            boolean[][] row = new boolean[9][10];
            boolean[][] col = new boolean[9][10];
            boolean[][] box = new boolean[9][10];
            
            int ans = 1;
            for(int i= 0; i<9; i++){
                if(ans == 0) break;
             	for(int j= 0; j<9; j++){
                	if(row[i][sudoku[i][j]] == true){
                        ans = 0;
                        break;
                    }
                    row[i][sudoku[i][j]] = true;
            	}   
            }
            
            for(int i= 0; i<9; i++){
                if(ans == 0) break;
             	for(int j= 0; j<9; j++){
                	if(col[j][sudoku[i][j]] == true){
                        ans = 0;
                        break;
                    }
                    col[j][sudoku[i][j]] = true;
            	}   
            }
            
            for(int i= 0; i<9; i+=3){
                if(ans == 0) break;
             	for(int j= 0; j<9; j+=3){
                    
                    for(int r = 0; r<3; r++){
                        for(int c = 0; c<3; c++){
                            if(box[i + j/3][ sudoku[i+r][j+c]] == true){
                                ans=0;
                            	break;
                            }
                        	box[i + j/3][ sudoku[i+r][j+c]] = true;
                    	}
                    }
                }
            }
            System.out.printf("#%d %d%n",tc,ans);
        }
            
    }
}
