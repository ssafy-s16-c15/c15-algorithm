import java.util.Scanner;
import java.io.FileInputStream;

public class SWEA_LV2_1288_새로운불면증치료법 {
	public static void main(String args[]) throws Exception
	{
	Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
									
			int binary = 0;
            int N_tmp;
            int cnt = 0;
			while(binary != 0b1111111111){
                cnt++;
                N_tmp = N * cnt;
                while(N_tmp >= 1){
					binary |= (1 << (N_tmp % 10));
					N_tmp /= 10;
				}
			}
            System.out.printf("#%d %d \n", test_case, cnt*N);
		}
	}
}