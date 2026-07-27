import java.util.Scanner;

public class SWEA_LV1_1938_아주간단한계산기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // 방법 1
        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);

        // System.out.println(a + b, a - b, a * b, a / b);
        // 이런식으로 한 번에 출력은 안 되나 찾아봤는데...
        // println() 메서드는 한 번에 하나의 값만 출력 가능

        // 대신 printf() 메서드를 통해 한 번에 출력 가능
        // 방법 2
        System.out.printf("%d%n%d%n%d%n%d%n",
                a + b,
                a - b,
                a * b,
                a / b);

    }

}
