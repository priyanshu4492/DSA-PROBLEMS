package sorting;

import java.util.Arrays;

public class selectionDecreasing {
    public static void main(String[] args) {
        int[] arr= {7,5,6,3,4,1,2};
        for(int i= 0;i<arr.length;i++){
            int MinIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j] <arr[MinIndex]){
                    MinIndex = j;
                }
            }
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
