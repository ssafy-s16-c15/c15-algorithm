import java.util.Scanner;

public class SWEA_LV2_1284_수도요금경쟁 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt(); // 테스트 케이스 수 입력 받기

        for (int testCase = 1; testCase <= T; testCase++) { // T만큼 반복

            int P = sc.nextInt(); // A사 1L당 요금
            int Q = sc.nextInt(); // B사 기본 요금
            int R = sc.nextInt(); // B사 기본 요금 기준 수도량
            int S = sc.nextInt(); // B사 기준 수도량 초과 시 1L당 요금
            int W = sc.nextInt(); // 한 달간 사용하는 수도량

            int A = P * W; // A사 선택 시 수도 요금
            int B; // B사 선택 시 수도 요금
            int result;

            // B사 기준으로 먼저 계산 후 A사와 비교 진행
            if (W <= R) { // 사용량이 기준 수도량 이하
                B = Q; // 기본 요금
            } else { // 사용량이 기준 수도량 초과
                B = Q + (W - R) * S; // 기본 요금 + 초과분 비례 요금
            }

            if (A < B) { // A가 더 저렴
                result = A;
            } else { // B가 더 저렴하거나 동일
                result = B;
            }

            System.out.println("#" + testCase + " " + result);
        }

    }

}
