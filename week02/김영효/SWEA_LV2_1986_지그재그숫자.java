package week2;

import java.util.Scanner;
public class ZZ_Number_1986 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			
			if((N & 0x01) == 0)
				System.out.printf("#%d %d\n",test_case, - N/2);
			else
				System.out.printf("#%d %d\n",test_case, N/2 + 1);


		}
	}
}
