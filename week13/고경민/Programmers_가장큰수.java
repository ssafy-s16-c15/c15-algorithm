import java.util.*;
class Solution {
    String[] arr;
    String[] tmp;
    public String solution(int[] numbers) {
        arr = Arrays.stream(numbers)
            .mapToObj(String::valueOf)
            .toArray(String[]::new);
        
//         Arrays.sort(arr, Collections.reverseOrder());
        
        
        int N = numbers.length;
        tmp = new String[N];
        mergeSort(0, N-1);
        // for(int i=0;i<N-1;i++){
        //     for(int j=0;j<N-1-i;j++){
        //         if(Integer.parseInt(arr[j]+arr[j+1]) < Integer.parseInt(arr[j+1]+arr[j])){
        //             String tmp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = tmp;
        //         }
        //     }
        // }
        
        
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(String i : arr){
            sb.append(i);
        }
        return sb.toString();
    }
    
    void mergeSort(int left, int right){
        if (left >= right) return;
        
        int mid = (left + right) / 2;
        
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        
        merge(left, mid, right);
    }
    
    void merge(int left, int mid, int right){
        int i = left;
        int j = mid +1;
        int k = left;
        
        while(i<=mid && j <= right){
            int a = Integer.parseInt(arr[i] + arr[j]);
            int b = Integer.parseInt(arr[j] + arr[i]);
            
            if(a>=b) tmp[k++] = arr[i++];
            else tmp[k++] = arr[j++];
        }
        
        while(i<=mid) tmp[k++] = arr[i++];
        while(j<=right) tmp[k++] = arr[j++];
        
        for(int o =left; o<= right; o++){
            arr[o] = tmp[o];
        }
    }
}