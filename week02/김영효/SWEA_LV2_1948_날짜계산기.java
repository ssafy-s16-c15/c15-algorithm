class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int test_case = 1; test_case <= T; test_case++)
		{
			int m1 = sc.nextInt();
   			int d1 = sc.nextInt();
   			int m2 = sc.nextInt();
   			int d2 = sc.nextInt();
			int sum = 0;
            for(int i = m1; i !=m2; ){
            	sum += month[(i - 1) % 12];
                i = i + 1 % 12;
            }
            sum -=  (d1 - 1);
            sum += d2;
            
            System.out.printf("#%d %d\n",test_case,  sum);
		}
	}
}