import java.util.Scanner;
class Solution{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int ans = 0;
            int oddSum = 0;
            int evenSum = 0;
            if (N%2==0){
                oddSum = (((N-1)+1)/2)*(((N-1)+1)/2); // 1~N까지의 홀수의 합은 (N/2)^2
                evenSum = (N/2)*(N/2+1);              // 1~N까지의 짝수의 합은 (N/2) * ((N/2)+1)
                ans = oddSum - evenSum;
            } else {
                oddSum = ((N+1)/2)*((N+1)/2);
                evenSum = ((N-1)/2)*((N-1)/2+1);
                ans = oddSum - evenSum;
            }
            System.out.printf("#%d %d%n",tc,ans);
		}
	}
}