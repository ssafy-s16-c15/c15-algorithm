import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

public class SWEA_LV2_1966_숫자를정렬하자 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int[] numbers =new int[N];
            for(int i = 0; i < N; i++)
                numbers[i] = sc.nextInt();
            Arrays.sort(numbers);
            
            System.out.printf("#%d", test_case);
            for(int i = 0; i < N; i++)
                System.out.printf(" %d",numbers[i]);            
             System.out.println();
		}
	}
}
