package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class PROGRAMMERS_여행경로 {
	// 모든 경로 사용 =>dfs , 잘못된 방법이면 취소=>백트래킹
	// 경로 리턴이긴한데 배열 출력이라 dfs 넘기는게 편할수도
	// 알파벳 순서 처리
	boolean[] visited;
	ArrayList<String> Routes;

	public void dfs(String current, int cnt, String ans, String[][] tickets) {
		// 종료 조건
		if (cnt == tickets.length) {
			Routes.add(ans);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			// 사용 안한 티켓 && 현재 공항 출발일 경우
			if (!visited[i] && tickets[i][0].equals(current)) {
				visited[i] = true;
				dfs(tickets[i][1], cnt + 1, ans + " " + tickets[i][1], tickets);
				visited[i] = false;
			}
		}
	}

//		[["ICN", "JFK"],
//		["HND", "IAD"], 
//		["JFK", "HND"]]
	public String[] solution(String[][] tickets) {
		visited = new boolean[tickets.length];
		Routes = new ArrayList<>();

		// 알파벳순으로 변경
		for (int i = 0; i < tickets.length; i++) {
            for (int j = i + 1; j < tickets.length; j++) {

                if (tickets[i][1].compareTo(tickets[j][1]) > 0) {

                    String[] temp = tickets[i];
                    tickets[i] = tickets[j];
                    tickets[j] = temp;
                }
            }
        }

		dfs("ICN", 0, "ICN", tickets);

		return Routes.get(0).split(" ");
	}
}
