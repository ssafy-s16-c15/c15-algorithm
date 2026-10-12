import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int max = 0;
        String[] numbersStr = new String[numbers.length];
        for (int i = 0; i<numbers.length; i++) {
            numbersStr[i] = String.valueOf(numbers[i]);
        }

//     	for (int i = 0; i <numbersStr.length -1; i++) {
//     		for (int j = i+1; j<numbersStr.length; j++) {
//     			int num1 = Integer.valueOf(numbersStr[i].concat(numbersStr[j]));
//     			int num2 = Integer.valueOf(numbersStr[j].concat(numbersStr[i]));

//                 if (num1 < num2) {
//     				String temp = numbersStr[i];
//     				numbersStr[i] = numbersStr[j];
//     				numbersStr[j] = temp;
//     			}
//     		}
//     	}
        Arrays.sort(numbersStr, (a, b) -> (b + a).compareTo(a + b));

        if (numbersStr[0].equals("0")) {
            return "0";
        }

        String answer = "";
        for (int i = 0; i<numbersStr.length; i++) {
            answer = answer.concat(numbersStr[i]);
        }

        return answer;
    }



//  int max;
// 	String[] numbersStr;
// 	boolean[] used;

// 	public void dfs(String num, int current) {
// 		if (current == numbersStr.length) {
// 			max = Math.max(max, Integer.valueOf(num));
// 			return;
// 		}

// 		for (int i = 0; i<numbersStr.length; i++) {
// 			if (used[i] == false) {
// 				used[i] = true;
// 				String temp = num;
// 				temp = temp.concat(numbersStr[i]);
// 				dfs(temp, current+1);
// 				used[i] = false;
// 			}

// 		}
// 	}

//     public String solution(int[] numbers) {
//     	used = new boolean[numbers.length];
//         max = 0;
//         numbersStr = new String[numbers.length];
//         for (int i = 0; i<numbers.length; i++) {
//         	numbersStr[i] = String.valueOf(numbers[i]);
//         }

//         dfs("", 0);

//         String answer = String.valueOf(max);
//         return answer;
//     }
}

