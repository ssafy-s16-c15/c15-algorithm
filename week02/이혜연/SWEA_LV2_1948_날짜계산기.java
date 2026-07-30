/*
테스트 케이스 개수 입력
월1 일1 월2 일2
월1, 월2 비교
    월1 == 월2
        (일2 - 일1 + 1) 출력
    월1 < 월2
        ((월1 일수 - 일1 + 1) + (월1이랑 월2 사이 달 일수) + 일2) 출력
*/

import java.util.Scanner;

public class SWEA_LV2_1948_날짜계산기 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수 T
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 월별 일수 
        int result;

        for (int testCase = 1; testCase <= T; testCase++) {

            int month1 = sc.nextInt();
            int day1 = sc.nextInt();
            int month2 = sc.nextInt();
            int day2 = sc.nextInt();

            if (month1 == month2) { // 월1과 월2가 같은 달인 경우 
                result = day2 - day1 + 1; 
            } else { // 월1과 월2가 다른 달인 경우 (이때, 항상 월2 > 월1으로 주어짐) 
                
                int sum = 0; // 월1과 월2 사이에 있는 달의 일수 합 

                for (int i = 1; month1 + i < month2; i++) { // 월1 다음달부터 월2 전달까지 반복 
                    sum += days[month1 + i - 1];
                }

                result = (days[month1 - 1] - day1 + 1) + sum + day2;
            }

            System.out.println("#" + testCase + " " + result);

        }
        
    }

}
