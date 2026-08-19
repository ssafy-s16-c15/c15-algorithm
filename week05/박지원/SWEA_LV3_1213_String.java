package week5;

import java.util.Scanner;

public class SWEA_LV3_1213_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for ( int tc = 0; tc < 10; tc++) {
			int tn = sc.nextInt();
			String str = sc.next();
			int str_length = str.length();
			String str2 = sc.next();
			
			StringBuilder sb = new StringBuilder(str2);
			
			int num = 0;
			for (int t = 0; t < sb.length() - str_length+1; t++) {
				if (sb.substring(t, t+str_length).equals(str)) num++; 
			}
			
			System.out.println("#" + tn + " " + num);
			
			
			
			
		}// for믄
		
		
		
		
		
		
	}	// main
	

}
