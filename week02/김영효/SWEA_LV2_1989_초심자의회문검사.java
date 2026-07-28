package week2;

import java.util.Scanner;
public class SWEA_LV2_1989_초심자의회문검사 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++){
			String str = sc.nextLine();
            int TF = 1;
            for(int i = 0; i < str.length()/2; i++){
            	
                if(str.charAt(i) !=  str.charAt(str.length() - i - 1)){
                	TF = 0;
                	break;
             	}
            }
        System.out.printf("#%d %d\n",test_case, TF);
		}
	}
}
