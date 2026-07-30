class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		String str = sc.nextLine();
		for(int test_case = 1; test_case <= T; test_case++)
			{
			str = sc.nextLine();
			int i = 0;
			for(i = 1; i <= 10; i++){
				int sign = 1; // 길이 만큼 반복되지 않으면 0
				for(int j = 0; j < i ; j++){
					char tmp = str.charAt( j ); 
					for(int k = 0; j + k * i  < 30; k++ ){
						if(tmp != str.charAt(j + k * i)){
							sign = 0;
							break;
						}
					}// k
				}// j
				if (sign == 1)
					break;
				}// i
			System.out.printf("#%d %d\n",test_case, i );
		} // test case
	}// main
}