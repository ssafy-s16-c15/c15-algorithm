import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc = 1; tc <= T; tc++){
            String str = sc.next();
            int stringLength = str.length();
            int ans = 1;
            for(int i =0; i<stringLength/2; i++){
                if(str.charAt(i) != str.charAt(stringLength-1-i)){
                    ans = 0;
                    break;
                }
            }
            System.out.printf("#%d %d%n",tc,ans);
        }
    }
}