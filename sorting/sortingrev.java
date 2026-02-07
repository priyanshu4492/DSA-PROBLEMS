package sorting;

import java.util.Arrays;

class sortingrev {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,1};
        for(int i =0;i<arr.length;i++){
            int Mindex = i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j] <arr[Mindex]){
                    Mindex = j;
                }
            }
            int temp = arr[Mindex];
            arr[Mindex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    }

