import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int[] priceArr = new int[N];
            
            for (int i = 0; i<N; i++) {
                priceArr[i] = sc.nextInt();
            }
            long max = 0;
            long ans = 0;
            for (int i =0; i<N; i++) {
                if(max>priceArr[N-1-i]){
                    ans += max - priceArr[N-1-i];
                } else {
                    max = priceArr[N-1-i];
                }
            }

            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}