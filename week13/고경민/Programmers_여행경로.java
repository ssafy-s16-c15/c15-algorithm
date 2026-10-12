import java.util.*;
class Solution {
    int N;
    boolean[] visited;
    List<String> tmp;
    String[][] tickets;
    boolean found;
    String[] answer;
    public String[] solution(String[][] tickets) {
        N = tickets.length;
        visited = new boolean[N];
        this.tickets = tickets;
        
        Arrays.sort(tickets, (a, b) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            }
            return a[0].compareTo(b[0]);
        });

        tmp = new ArrayList<>();
        tmp.add("ICN");
        
        dfs("ICN", 0);
        
        return answer;
    }
    
    void dfs(String from, int cnt){
        if(cnt == N){
            answer = tmp.toArray(new String[0]);
            found = true;
            return;
        } 
        
        
        
        for(int i=0;i<N;i++){
            if(!visited[i] && tickets[i][0].equals(from)){
                visited[i] = true;
                tmp.add(tickets[i][1]);
                dfs(tickets[i][1], cnt+1);
                if(found) return;
                visited[i] = false;
                tmp.remove(tmp.size()-1);
            }
        }
    }
}