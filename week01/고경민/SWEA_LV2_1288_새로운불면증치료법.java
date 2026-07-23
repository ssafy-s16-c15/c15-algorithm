import java.util.Scanner;
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            boolean[] seen = new boolean[10];
            int N = sc.nextInt();
            int answer = 0;
            int count = 0;
            while (count < 10) {
                answer += N;
                int temp = answer;
                while (temp > 0) {
                    int num = temp % 10;
                    if (!seen[num]) {
                        seen[num] = true;
                        count++;
                    }
                    temp /= 10;
                }
            }
            System.out.println("#" + tc + " " + answer);
        }
    }
}