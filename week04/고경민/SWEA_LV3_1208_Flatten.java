import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++){
            int N = sc.nextInt();
            int[] arr = new int[100];
            for(int i = 0; i<100; i++){
                arr[i] = sc.nextInt();
            }
            int dump = 0;
            int ans = 0;
            while(dump<N ){
                int max_v = 0;
                int max_i = -1;
                int min_v = 101;
                int min_i = -1;
                for(int i = 0; i<100; i++){
                    if(max_v < arr[i]){
                        max_v = arr[i];
                        max_i = i;
                    }
                    if(min_v > arr[i]){
                        min_v = arr[i];
                        min_i = i;
                    }
                }
                if(max_v - min_v <= 1) break;
                arr[max_i] = --max_v;
                arr[min_i] = ++min_v;
                dump++;
            }
            int max_v = 0;
            int max_i = -1;
            int min_v = 101;
            int min_i = -1;
            for(int i = 0; i<100; i++){
                if(max_v < arr[i]){
                    max_v = arr[i];
                    max_i = i;
                }
                if(min_v > arr[i]){
                    min_v = arr[i];
                    min_i = i;
                }
            }
            ans = max_v - min_v;
 
            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}