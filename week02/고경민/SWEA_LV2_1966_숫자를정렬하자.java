import java.util.Scanner;
import java.util.Arrays;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.printf("#%d ",tc);
            for(int i : arr){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}