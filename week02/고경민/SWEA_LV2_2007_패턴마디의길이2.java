import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            String text = sc.next();
            int ans = 0;
            for (int length = 1; length <= 10; length++) {
                boolean isPattern = true;
                for (int i = length; i < text.length(); i++) {
                    
                    char current = text.charAt(i);
                    char previousPattern = text.charAt(i - length);
                    
                    if (current != previousPattern) {
                        isPattern = false;
                        break;
                    }
                }
                if (isPattern) {
                    ans = length;
                    break;
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
    }
}