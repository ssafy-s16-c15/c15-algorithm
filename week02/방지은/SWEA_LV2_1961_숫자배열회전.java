package problems;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


public class SWEA_LV2_1961_숫자배열회전 {

	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt(); // 테스트 케이스 갯수 
	
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int size = sc.nextInt();
			int[][] arr = new int[size][size];
			
			// 숫자 넣기
			for(int i=0 ; i<size ; i++) {
				for(int j=0 ; j<size ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
//			System.out.println(Arrays.toString(arr));
			
			// 회전한 숫자 넣을 배열
			String[][] result = new String[size][3];
			
			
			
			for(int i=0 ; i<size ; i++) {
				
				String nums1 = "";
				String nums2 = "";
				String nums3 = "";
				
				for(int j=0 ; j<size; j++) {
					nums1 += arr[size-1-j][i];
					nums2 += arr[size-1-i][size-1-j];
					nums3 += arr[j][size-1-i];
				}
				result[i][0] = nums1;
				result[i][1] = nums2;
				result[i][2] = nums3;
				
			}
			
			
			
			System.out.println("#" + test_case);
			for(int i=0 ; i<size ; i++) {
				
				for(int j=0 ; j<3 ; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			
			
			
		}
	}
	
}
