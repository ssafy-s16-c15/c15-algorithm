import java.util.*;

class Solution {

    String[][] tickets;
    boolean[] used;
    ArrayList<String> path;
    String[] answer;


    public void dfs(String current, int n) {
        if (n == tickets.length) {
            int cnt = 0;
            answer = new String[tickets.length+1];
            for (String p : path) {
                answer[cnt] = p;
                cnt++;
            }
            return;
        }

        for (int i = 0; i<tickets.length; i++) {
            if (tickets[i][0].equals(current) && used[i] == false) {
                used[i] = true;
                path.add(tickets[i][1]);
                dfs(tickets[i][1], n+1);
                used[i] = false;
                path.remove(path.size()-1);

                if (answer != null) {
                    return;
                }
            }
        }

    }

    public String[] solution(String[][] tickets) {
        for (int i = 0; i <tickets.length -1; i++) {
            for (int j = i+1; j<tickets.length; j++) {
                if (tickets[i][1].compareTo(tickets[j][1]) > 0) {
                    String[] temp = tickets[i];
                    tickets[i] = tickets[j];
                    tickets[j] = temp;
                }
            }
        }
        this.tickets = tickets;


        used = new boolean[tickets.length];
        path = new ArrayList<>();

        path.add("ICN");

        dfs("ICN", 0);

        return answer;
    }
}