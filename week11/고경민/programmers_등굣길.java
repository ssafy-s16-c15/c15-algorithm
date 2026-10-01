import java.util.*;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        long[][] map = new long[n+1][m+1];
        int MIN = Integer.MIN_VALUE;
        for(int[] i : puddles){
            int r = i[1];
            int c = i[0];
            map[r][c] = MIN;
        }
        for(int i=0; i<n+1;i++){
            map[i][0] = MIN;
        }
        Arrays.fill(map[0], MIN);
        map[1][1] = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j==1) continue;
                if(map[i][j] == MIN) continue;
                int upR = i-1;
                int upC = j;
                int leftR = i;
                int leftC = j-1;
                if(map[upR][upC] == MIN && map[leftR][leftC] >=0){
                    map[i][j] = map[leftR][leftC];
                } else if(map[upR][upC] >= 0 && map[leftR][leftC] == MIN){
                    map[i][j] = map[upR][upC];
                } else if(map[upR][upC] >= 0 && map[leftR][leftC] >= 0){
                    map[i][j] = (map[upR][upC]% 1000000007) + (map[leftR][leftC]% 1000000007);
                } else {
                map[i][j] = MIN;
                }
            }
        }
        int answer = 0;
        if(map[n][m] >0) answer = (int)map[n][m]% 1000000007;
        
        
        return answer;
    }
}