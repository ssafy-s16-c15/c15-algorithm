import java.util.Scanner;
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            int i = sc.nextInt();
            int[] counts = new int[101];
            for ( int j = 1; j <=1000; j++) {
                int score = sc.nextInt();
                counts[score]++;
            }
            int maxCount = 0;
            int answer = 0;
            for (int score=0; score<=100;score++) {
                if (counts[score] >= maxCount) {
                    maxCount = counts[score];
                    answer = score;
                }
            }
            System.out.println("#" + i + " " + answer);
        }
    }
}