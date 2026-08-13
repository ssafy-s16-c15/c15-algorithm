import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        for(int tc = 1; tc <= 10; tc++){
            int N=sc.nextInt();
            int[] arr = new int[N+4];
            int ans = 0;
            for (int i = 2; i< N+2 ; i++){
                arr[i] = sc.nextInt();
            }
            
            for (int i = 2; i< N+2 ; i++){
                int f1 = arr[i -2];
                int f2 = arr[i -1];
                int c = arr[i];
                int f3 = arr[i +1];
                int f4 = arr[i +2];
				int max = Math.max( Math.max(f1, f2), Math.max(f3, f4) );
                if(c > max) {
                    ans += c- max;
                }
            }
            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}