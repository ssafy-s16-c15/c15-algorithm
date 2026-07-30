/*
_ _ _ _ _
0 1 2 3 4
*/

public class SWEA_LV1_2027_대각선출력하기 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) { // i 위치가 0일 때,
            for (int j = 0; j < 5; j++) { // j 위치는 0~4까지 이동 
                if (i == j) { // i 위치와 j 위치가 동일하면 # 출력
                    System.out.print("#");
                } else { // 아닐 경우, + 출력 
                    System.out.print("+");
                } // 첫번째 반복 결과 -> #++++
            }

            System.out.println(); // 줄바꿈 후 반복 

        }

    }

}
