import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Solution{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for(int k =0; k<10; k++){
            int tc=Integer.parseInt(br.readLine());
            int[][] ladder = new int[100][100];
			
            for(int i =0; i<100; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j =0; j<100; j++){
                    ladder[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int r = 99;
            int c = -1;
            for(int i = 0; i<100; i++) {
                if(ladder[99][i] == 2) {
                    c = i;
                    break;
                }
            }
            while(r-->0){
                if(c>0 && ladder[r][c-1] ==1 ){
                    while(c>0 && ladder[r][c-1] == 1){
                        c--;
                    }
                } else if(c<99 && ladder[r][c+1] ==1 ){
                    while(c<99 &&ladder[r][c+1] == 1){
                        c++;
                    }
                }
            }
            
            sb.append('#')
               .append(tc)
               .append(' ')
               .append(c)
               .append('\n');
        }
        System.out.print(sb);
    }
}