package 알깨기;

import java.util.ArrayDeque;
import java.util.Deque;

public class Programmers_단어변환 {

    static String begin = "hit";
    static String target = "cog";
    static String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

    public static void main(String[] args) {

        boolean hasContain = false;
        // words에 target이 없는 경우
        for (String word : words) {
            if(word.equals(target)) {
                hasContain = true;
                break;
            }
        }

        if(!hasContain) {
            System.out.println(0);
            return;
        }

        boolean[] visited = new boolean[words.length];
        Deque<String> queue = new ArrayDeque<>();

        queue.add(begin);
        int answer = 0; // 변환횟수

        while(!queue.isEmpty()) {
            int size = queue.size(); // 변환 될 수 있는 단어 갯수

            for(int i=0 ; i<size; i++) {
                String current = queue.pollFirst();

                // 단어가 같다면?
                if(current.equals(target)) {
                    System.out.println(answer);
                    return;
                }
                // 같지 않다면 다음 단어 확인
                for(int j=0 ; j<words.length ; j++) {
                    if(!visited[j] && canChange(current, words[j])) {
                        visited[j] = true;
                        queue.add(words[j]);
                    }
                }
            }

            answer++;
        }
        System.out.println(answer);
    }

    static boolean canChange(String current, String next) {
        int diff = 0;

        for(int i=0; i <current.length() ; i++) {
            if(current.charAt(i) != next.charAt(i)) diff++;
        }

        if(diff==1) {
            return true;
        } else {
            return false;
        }
    }

}
