import java.util.Scanner;
import java.util.Arrays;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] scores = new int[N];
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
            for (int i = 0; i < N ; i++){
                int score1 = sc.nextInt();
                int score2 = sc.nextInt();
                int score3 = sc.nextInt();
                scores[i] = score1 * 35 + score2 * 45 + score3 * 20;
            }
            int targetScore = scores[K-1];
            Arrays.sort(scores);
            for(int i = 0; i<N; i++){
                if(scores[i] == targetScore){
                    
                    System.out.printf("#%d %s%n",tc,grade[9 - i/(N/10)]);
                    break;
                }
            }
        }
    }
}