import java.util.Scanner;
class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append("\n");
            int N = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                char c = sc.next().charAt(0);
                int n = sc.nextInt();
                
                for (int j = 0; j < n; j++) {
                    sb.append(c);
                    count++;
                    
                    if (count == 10) {
                        sb.append("\n");
                        count = 0;
                    }
                }
            }
            if (count != 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}