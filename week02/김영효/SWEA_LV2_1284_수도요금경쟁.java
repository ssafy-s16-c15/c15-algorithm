import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int P = sc.nextInt(); // A사 요금
			int Q = sc.nextInt(); // B사 기본요금
			int R = sc.nextInt(); // B사 R리터 이하 기본요금지불
			int S = sc.nextInt(); // B사 R리터당 가격
			int W = sc.nextInt(); // 사용량
			
			int A = P * W;
			int B = R >= W ? Q : Q + S * (W - R);
					
			if(A < B)
				System.out.printf("#%d %d\n",test_case ,A);
			else
				System.out.printf("#%d %d\n",test_case ,B );
		}
	}
}