import java.util.Scanner;
import java.util.Arrays;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            double ans = 0;
            int[] arr = new int[10];
            for (int i = 0 ; i<10; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 1; i<9; i++){
                ans += arr[i];
            }

            System.out.printf("#%d %d%n",tc,Math.round(ans/8));
        }
    }
}