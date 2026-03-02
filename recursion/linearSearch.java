public class linearSearch {

public class linSearch(int arr[] ,int target){
            for(int i=0;i<arr.length;i++){
                if (arr[i]=target) {
                    return i;
                    
                }else {
                    return -1;
                }
            }
}

    public static void main(String[] args) {
        int arr[] = {10,23,34,56,67};
        int result = linSearch(arr,56);
        if (result != -1) {
            System.out.println("element found at index"+ result);
            
            
        }else{
            System.out.println("not found");
        }
    }
    
}
