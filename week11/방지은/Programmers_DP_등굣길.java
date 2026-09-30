package 알깨기;

import java.util.Arrays;

class 등굣길 {
	
	public static int main(String[] args) {
		int n = 6;
		int m = 5;
		int[][] puddles = new int[][] {{2,2}, {4,4}};
		
	  int[][] dp = new int[n][m];
        
        dp[0][0] = 1;
        
        for(int i=0 ; i<puddles.length ; i++) {
            dp[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<m ; j++) {
                
                if(dp[i][j]==-1) continue;

                if(i-1>=0 && dp[i-1][j]!=-1) {
                    dp[i][j] += dp[i-1][j] %1_000_000_007;
                }
                
                if(j-1>=0 && dp[i][j-1]!=-1) {
                    dp[i][j] += dp[i][j-1]%1_000_000_007;
                }
            }
        }
        
        int answer = dp[n-1][m-1] % 1_000_000_007;
        
        return answer;
	}
}