package week05;

import java.util.*;

public class 체크메이트 {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int T = sc.nextInt();

	        for (int test = 1; test <= T; test++) {

	            int N = sc.nextInt();

	            int wr = sc.nextInt();
	            int wc = sc.nextInt();
	            int br = sc.nextInt();
	            int bc = sc.nextInt();

	            int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};

	            int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

	            int answer = 0;

	            for (int d = 0; d < 8; d++) {

	                int nr = wr + dr[d];
	                int nc = wc + dc[d];

	                if (nr < 1 || nr > N || nc < 1 || nc > N) {
	                    continue;
	                }
	                // 이동한 위치에 블랙 퀸이 있다면
	                if (nr == br && nc == bc) {
	                    answer = 1;
	                    break;
	                }
	            }

	            System.out.println("#" + test + " " + answer);
	        }
	 }
}
