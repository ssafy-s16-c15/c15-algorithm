import java.util.Scanner;
class Solution {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
            System.out.print("#"+tc+" ");
            int N = sc.nextInt();
            int[] sosu={2,3,5,7,11};
            int[] result= new int[5];
            for (int i = 0; i<5; i++) {
                while (N%sosu[i] == 0) {
                    N /= sosu[i];
                    result[i] += 1;
                }
                System.out.print(result[i]+ " ");
            }
            System.out.println("");
		}
	}
}