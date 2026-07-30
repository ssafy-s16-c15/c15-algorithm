import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        for(int tc = 1; tc <= T; tc++){
            int aMonth = sc.nextInt();
            int aDay = sc.nextInt();
            int bMonth = sc.nextInt();
            int bDay = sc.nextInt();            
			int ans = 0;
            
            for(int i = 0; i< bMonth - aMonth; i++){
                ans += days[aMonth + i];
            }
            ans += bDay -aDay +1;
            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}