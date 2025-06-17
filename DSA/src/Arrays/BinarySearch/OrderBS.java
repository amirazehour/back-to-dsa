package Arrays.BinarySearch;

public class OrderBS {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8,9,10};
        int[] arr2={10,9,8,7,6,5,4,3,2,1};
        System.out.println(binarySearchByOrder(arr,9));
        System.out.println(binarySearchByOrder(arr2,9));
    }

    static int binarySearchByOrder(int[] arr, int target) {
        int start =0;
        int end = arr.length-1;
        int mid =1;
//        if(target > arr[end] || target < arr[start]){
//            return -1;
//        }
        boolean asc= arr[start]<arr[end];
        while( start<=end  ){
//           mid =  (start+end)/2;// start+end could exceed int range
            mid = start + (end - start) /2;
            if(arr[mid]==target){
                return mid;
            }


            if (asc){
                if (arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid +1;
                }
            }else{
                if (arr[mid]>target){
                    start=mid +1;
                }else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}
