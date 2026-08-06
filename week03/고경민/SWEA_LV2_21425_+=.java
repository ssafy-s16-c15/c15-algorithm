import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();
            int ans = 0;
            
            while(!(A>N || B > N)){
                if(A>B) B +=A;
                else A +=B;
                ans++;
            }

            System.out.printf("%d%n",ans);
        }
    }
}