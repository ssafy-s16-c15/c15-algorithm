public class Solution {
    public int solution(int m, int n, int[][] puddles) {
        
        int DIV = 1_000_000_007;
        int[][] water = new int[m][n];
        
        for (int[] puddle : puddles) {
            
            int x = puddle[0] - 1;
            int y = puddle[1] - 1;
            water[x][y] = -1;
        }
        
        water[0][0] = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                if (water[i][j] == -1) {
                    
                    water[i][j] = 0;
                    continue;
                }
                
                if (i == 0 && j == 0) {
                    continue;
                }
                
                if (i > 0) {
                    
                    water[i][j] += water[i-1][j];
                }
                
                if (j > 0) {
                    
                    water[i][j] += water[i][j-1];
                }
                
                water[i][j] %= DIV;
            }
        }
        
        return water[m-1][n-1] % DIV;
    }
}