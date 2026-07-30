package algo;

import java.util.*;

public class Solution1966 {

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < num; i++){
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.print("#"+test_case);
            for (int i = 0; i < list.size(); i++) {
                System.out.print(" " + list.get(i));
            }
            System.out.println();
        }
    }
}
