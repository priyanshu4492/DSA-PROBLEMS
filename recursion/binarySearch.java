public class binarySearch {

        public class InnerbinarySearch (int arr[],int target){

        int low=0;
        int high= arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]==target) {
                return mid;
                
            }
            else if (target<arr[mid]) {
                high = mid-1;
            }else{
                low= mid+1;
            }
            return -1;
            
        }
            
        }

    public static void main(String[] args) {
        
        int arr[] ={23,45,56,67,45,34};
        int result = InnerbinarySearch(arr,67);
        if (result != -1) {
            System.out.println("elemet found at index "+result);

        }else{

            System.out.println("not found");
        }
    }
}