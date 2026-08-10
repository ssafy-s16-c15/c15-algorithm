import java.util.Scanner;
import java.io.FileInputStream;

public class 1961_숫자회전배열 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[][] numbers = new int[N][N];
            int[][] numbers_tmp1 = new int[N][N];
            int[][] numbers_tmp2 = new int[N][N];
            int[][] numbers_tmp3 = new int[N][N];
            for(int i = 0; i < N; i++){	
                for(int j = 0; j < N; j++){
						numbers[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < N; i++){	
                for(int j = 0; j < N; j++){
						numbers_tmp1[j][ N - i - 1] = numbers[i][j];              		
                }
            }    
            

            for(int i = 0; i < N; i++){	
                for(int j = 0; j < N; j++){
						numbers_tmp2[j][ N - i - 1] = numbers_tmp1[i][j];              		
                }
            }    
			for(int i = 0; i < N; i++){	
                for(int j = 0; j < N; j++){
						numbers_tmp3[j][ N - i - 1] = numbers_tmp2[i][j];              		
                }
            }    

            System.out.printf("#%d\n", test_case);
            for(int i = 0; i < N; i++){	
                for(int j = 0; j < N; j++){
					System.out.printf("%d",numbers_tmp1[i][j] );
                }
                System.out.printf(" ");
                for(int j = 0; j < N; j++){
					System.out.printf("%d",numbers_tmp2[i][j] );
                }
                System.out.printf(" ");
                for(int j = 0; j < N; j++){
					System.out.printf("%d",numbers_tmp3[i][j] );
                }
					 System.out.println();              
            }            
            
			
		}
	}
}
}
