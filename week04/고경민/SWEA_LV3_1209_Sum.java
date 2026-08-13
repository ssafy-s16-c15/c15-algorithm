import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
         
        for(int k = 0; k<10 ; k++){
            int tc=sc.nextInt();
            int[] row = new int[100];
            int[] col = new int[100];
            int[] cross = new int[2];
            for(int r = 0; r<100; r++){
                for(int c = 0; c<100; c++){
                    int tmp = sc.nextInt();
                    row[r] += tmp;
                    col[c] += tmp;
 
                    if(r == c) {
                        cross[0] += tmp;
                    }
                    if (r+c == 100) {
                        cross[1] += tmp;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i<100; i++) {
                max = Math.max(max, Math.max(row[i], col[i]));
            }
            max = Math.max(max, Math.max( cross[0], cross[1] ) );
 
         System.out.printf("#%d %d%n",tc,max);
         }
    }
}