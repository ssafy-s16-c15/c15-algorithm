import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int ansH = 0;
            int ansM = 0;
            
            int hour1 = sc.nextInt();
            int min1 = sc.nextInt();
            int hour2 = sc.nextInt();
            int min2 = sc.nextInt();
            
            int addH = (min1+min2) / 60;
            ansM = (min1+min2) % 60;
            ansH = (hour1 + hour2 + addH);
            if(ansH == 24) ansH -= 12;
            else ansH %= 12;

            System.out.printf("#%d %d %d%n",tc,ansH,ansM);
        }
    }
}