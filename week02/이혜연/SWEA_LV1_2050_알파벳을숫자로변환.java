/*
String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
int i = 0; i < str.length(); i++
int j = 0; j < 26; j++
str.charAt(i) == abc.charAt(j) 이면 (i + 1) 출력
*/

import java.util.Scanner;

public class SWEA_LV1_2050_알파벳을숫자로변환 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (str.charAt(i) == abc.charAt(j)) {
                    System.out.print(j + 1 + " ");
                }
            }
        }

    }

}
