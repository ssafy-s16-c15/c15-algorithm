package Week11;

import java.util.Arrays;

public class toSchool {
    public int solution(int m, int n, int[][] puddles) {
        int answer;
        int[] arr = new int[n];
        boolean[][] pud = new boolean[m][n];
        for(int i = 0; i < puddles.length; i++)
            pud[puddles[i][0] - 1][puddles[i][1] - 1] = true;

        
        arr[0] = 1;
        for(int i = 0; i < m; i++){
            arr[0] = pud[i][0] ? 0 : Math.min(arr[0], 1);
            for(int j = 1; j < n; j++){
             arr[j] = pud[i][j] ? 0 : (arr[j] + arr[j - 1]) % 1_000_000_007;
            }
        }
            
        
        return arr[n - 1];
    }
}

