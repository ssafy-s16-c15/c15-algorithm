import java.util.Scanner;

public class SWEA_LV2_1989_초심자의회문검사 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt(); // 테스트 케이스 수 입력 받기

        for (int testCase = 1; testCase <= T; testCase++) { // T만큼 반복
        
            String word = sc.next();
            int result = 1; // 회문이라고 가정 

            // for (int i = 0; i < (word.length() / 2); i++) { 
            //     if (word.charAt(i) == word.charAt(word.length() - 1 - i)) { 

            //     } else {
            //         result = 0;
            //         break;
            //     }
            // } 
            // 처음엔 위 코드로 작성했으나, if문에서 별도의 변경사항이 없다는 점을 고려해 아래 코드로 변경 

            for (int i = 0; i < (word.length() / 2); i++) { 
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) { // 앞뒤가 같지 않은 경우
                    result = 0; // 결과값 변경 후 
                    break; // 반복문 중지 
                } 
            }

            System.out.println("#" + testCase + " " + result);

        }

    }
}
