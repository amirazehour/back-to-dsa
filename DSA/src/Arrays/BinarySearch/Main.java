package Arrays.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,10};
        System.out.println(binarySearch(arr,9));

    }

    //return -1 if does not exist else return index
    static int binarySearch(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        int mid =1;
//        if(target > arr[end] || target < arr[start]){
//            return -1;
//        }

        while( start<=end  ){
//           mid =  (start+end)/2;// start+end could exceed int range
            mid = start + (end - start) /2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target){
                end=mid-1;
            }else{
                start=mid +1;
            }
        }
        return -1;
    }
}
