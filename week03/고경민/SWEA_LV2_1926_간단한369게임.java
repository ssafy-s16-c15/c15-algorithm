import java.util.Scanner;
class Solution{
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String str = "-";
        for(int i =1; i<=N;i++){
            int count = 0;
            int tmp = i;
            while(tmp>0){
                if( tmp % 10 == 3 || tmp % 10 == 6 || tmp % 10 == 9){
                    count++;
                }
                tmp /= 10;
            }
            if(count != 0){
            	for(int j = 0; j<count; j++){
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");    
            }
            
            
        }
    }
}