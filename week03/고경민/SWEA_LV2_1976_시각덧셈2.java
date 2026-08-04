import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            int totalMin = 60*(h1 + h2) + m1 +m2;
            int ansH = ((totalMin/60)-1) % 12 +1;
            int ansM = totalMin%60;
                
            

            System.out.printf("#%d %d %d%n",tc,ansH,ansM);
        }
    }
}