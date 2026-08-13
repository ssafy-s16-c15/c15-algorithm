import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Solution{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int C = 1; C <=10 ; C++){
            int tc = Integer.parseInt(br.readLine());
            int[][] ladder = new int[100][100];
            int startPointCount = 0;
 
            for(int i =0; i<100; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j =0; j<100;j++){
                    ladder[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            List<Integer> startPoint = new ArrayList<>();
            for(int i = 0; i<100; i++) {
                if(ladder[0][i] == 1) startPoint.add(i);
            }
            int r = 0;
            int c = 0;
            int sum = 0;
            int min = 10000;
            int ans = 0;
            for(int i =0; i<startPoint.size(); i++){
                int tmp = i;
                r = 0;
                c = startPoint.get(i);
                sum = 0;
                while(r++<99){
                    if(c>0 && ladder[r][c-1]==1) {
                        sum += startPoint.get(tmp) - startPoint.get(tmp-1);
                        tmp--;
                        c =startPoint.get(tmp);
                    } else if (c<99 && ladder[r][c+1]==1){
                        sum += startPoint.get(tmp+1) - startPoint.get(tmp);
                        tmp++;
                        c =startPoint.get(tmp);
                    }
                }
                if (min>sum) {
                    min = sum;
                    ans = startPoint.get(i);
                }
            }
            sb.append('#')
                .append(tc)
                .append(' ')
                .append(ans)
                .append('\n');
        }
        System.out.print(sb);
    }
}