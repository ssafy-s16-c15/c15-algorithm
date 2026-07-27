import java.util.Scanner;

public class SWEA_LV1_1936_1대1가위바위보 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // 1 = 가위, 2 = 바위, 3 = 보
        // 가위(1) > 보(3) -> (a - b) = -2
        // 보(3) > 바위(2) -> (a - b) = 1
        // 바위(2) > 가위(1) -> (a - b) = 1

        if (a - b == -2 || a - b == 1) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

    }

}
