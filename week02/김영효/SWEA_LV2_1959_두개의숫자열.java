package week2;

import java.util.Scanner;

public class SWEA_LV2_1959_두개의숫자열 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N, M;
            N = sc.nextInt();
            M = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[M];   
            for(int i = 0; i < N; i++)
				A[i] = sc.nextInt();
            for(int i = 0; i < M; i++)
				B[i] = sc.nextInt();
                
            int max = Integer.MIN_VALUE;
			if (M >= N){   
                for(int i = 0; i < M - N + 1; i++){
                    int tmp = 0;
                    for(int j = 0; j < N; j++){
                        tmp += A[j] * B[i + j];                    
                    }
                    max = max > tmp? max: tmp;
                }
            }else{
                for(int j = 0; j < N - M + 1; j++){
                    int tmp = 0;
                    for(int i = 0; i < M; i++){
                        tmp += A[ j + i ] * B[ i ];                    
                    }
                    max = max > tmp? max: tmp;
                }
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
	}
}
