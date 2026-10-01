import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[n+1][m+1];
        
        for(int[] i : puddles){
            int r = i[1];
            int c = i[0];
            map[r][c] = -1;
        }

        map[1][1] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j==1) continue;
                if(map[i][j] == -1) {
                    map[i][j] = 0;
                    continue;
                }
                map[i][j] = (map[i-1][j]% 1000000007) + (map[i][j-1]% 1000000007);

            }
        }
        int answer = 0;
        if(map[n][m] >0) answer = map[n][m]% 1000000007;
        
        
        return answer;
    }
}