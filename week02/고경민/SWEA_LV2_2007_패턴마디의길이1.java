import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++){
            String str = sc.next();
            System.out.print("#"+test_case+ " ");
            for (int j = 0; j < 30; j++) {
                String temp1 = str.substring(0, 1+j);
                String temp2 = str.substring(1+j, 2*(1+j));
                if (temp1.equals(temp2)) {
                    System.out.println(j+1);
                    break;
                }
            }
		}
	}
}