package Arrays.linearSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println(linearSearch(arr,9));
    }

    static boolean linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
