package week2;


import java.util.Scanner;
public class SWEA_LV2_1945_간단한소인수분해 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] m = {0,0,0,0,0};

			while(N % 2 == 0 ) {
				N = N>> 1;
				m[0]++;
			}while(N % 3 == 0 ) {
				N /= 3;
				m[1]++;
			}while(N % 5 == 0 ) {
				N /= 5;
				m[2]++;
			}while(N % 7 == 0 ) {
				N /= 7;
				m[3]++;
			}while(N % 11 == 0 ) {
				N /= 11;
				m[4]++;
			}
			System.out.printf("#%d %d %d %d %d %d\n", test_case,m[0],m[1],m[2],m[3],m[4]);
		}
	}
}
