package Arrays.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(linearSearch(arr,2,1,3));
    }

    static boolean linearSearch(int[] arr, int target,int start,int end ) {
        if (start >= end){
            return false;
        }
        else if (end>arr.length-1){
            return false;
        }
        if(arr.length == 0){
            return false;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
