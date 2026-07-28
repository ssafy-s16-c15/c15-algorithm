import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int AN = sc.nextInt();
            int BN = sc.nextInt();
            int[] a = new int[AN];
            int[] b = new int[BN];
            int ans = Integer.MIN_VALUE;
            
            
            for(int i = 0; i < AN; i++) {
                a[i] = sc.nextInt();
            }
            
            for(int i = 0; i < BN; i++) {
                b[i] = sc.nextInt();
            }
            if (BN < AN) {
                int tmpN = AN;
                AN = BN;
                BN = tmpN;
                
                int[] tmp = a;
                a = b;
                b = tmp;
            }
            // AN = 5, BN = 10, -> 
            for(int i = 0; i<= BN-AN; i++) {
                int tmpSum = 0;
                for(int j = 0; j<AN; j++){
                    tmpSum += a[j] * b[i+j];
                }
                ans = Integer.max(tmpSum, ans);
            }

            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}