package Week11;

import java.util.ArrayList;
import java.util.Scanner;


public class process {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			cell = new int[N][N];
            core = new ArrayList<>();
            min = 0x7fffffff;
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    cell[i][j] = sc.nextInt();
                    if(cell[i][j] == 1)
                    	core.add(new int[] {i, j});
                }
            }
            coreNum = core.size();
            maxConnectedNum = 0;
            minCntLen(0, 0, 0, cell);
            System.out.println("#" + test_case + " " + (min == 0x7fffffff ?  0 : min) );
            
		}
		sc.close();
	}
	static int N;
	static int[][] cell;
	static ArrayList<int[]> core;
	static int[] di = {1, -1, 0, 0};
	static int[] dj = {0, 0, 1, -1};
	static int coreNum;
    static int maxConnectedNum;
	
	static int min;
	static void minCntLen(int coreIdx, int lenSum, int connectedCell, int[][] cellOrg) {
		if(coreIdx == coreNum) {
            if(maxConnectedNum < connectedCell){
	            maxConnectedNum = connectedCell;
            	min = lenSum;
            } else if(maxConnectedNum == connectedCell){
				min = Math.min(lenSum, min);
            }                
			return;
		}
		
		int[] currCore = core.get(coreIdx);
		if(isBoundCore(core.get(coreIdx))){
			minCntLen(coreIdx + 1, lenSum, connectedCell + 1, cellOrg);
            return;
		}

		int addLen;
		int[][] cellCpy;
        minCntLen(coreIdx + 1, lenSum, connectedCell, cellOrg);
        
		for(int d = 0; d < 4; d++) {
			cellCpy = cpyCell(cellOrg);
			addLen = connectCore(currCore[0], currCore[1], d, cellCpy);
            if(addLen < 0)
				continue;
			minCntLen(coreIdx + 1, lenSum + addLen, connectedCell + 1, cellCpy);
		}
	}
	
	static int connectCore(int ci, int cj, int dir, int[][] cellCopy) {
		int connectedLen = 0;
		ci += di[dir];
		cj += dj[dir];
		
		while(inRange(ci, cj)) {
			if(cellCopy[ci][cj] > 0)
				return -1;
			cellCopy[ci][cj]++;
			connectedLen++;
			ci += di[dir];
			cj += dj[dir];
		}
		return connectedLen;
	}
		
	static boolean isBoundCore(int[] core) {
		return core[0] == 0 || core[1] == 0 || core[0] == N - 1 || core[1] == N - 1 ;
	}
	static boolean inRange(int i, int j) {
		return 0 <= i && 0 <= j && i < N && j < N; 
	}
	
	static int[][] cpyCell(int[][] cellOrg){
		int[][] ret = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				ret[i][j] = cellOrg[i][j];
			}
		}
		return ret;
	}
	
	static void printCell(int[][] C) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
	            System.out.print(C[i][j] + " ");
			}
            System.out.println();
		}
		System.out.println();	
	}
	
}
