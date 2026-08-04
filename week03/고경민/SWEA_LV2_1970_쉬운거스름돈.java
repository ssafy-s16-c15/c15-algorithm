import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            System.out.println("#" + tc);
            int N = sc.nextInt();
            int [] money = {50000,10000,5000,1000,500,100,50,10};
            for(int i =0; i<8; i++){
                System.out.print(N/money[i] + " ");
                N %= money[i];
            }
            System.out.println();
        }
    }
}