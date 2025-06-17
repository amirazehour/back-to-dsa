package Arrays.BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args){
        int[] arr ={1,2,3,5,7,9,13,16,22,32,43,120};
        System.out.println(ceiling(arr,6));
    }

    public static int ceiling(int[] arr,int num){
        //array is ordred <==> binary search
        int mid; int start = 0; int end = arr.length -1;

        while( start<=end  ){
//          mid =  (start+end)/2;// start+end could exceed int range
            mid = start + (end - start) /2;
            if(arr[mid]==num){
                System.out.println("1");
                return arr[mid];
            }

            if (arr[mid]>num){
                end= mid-1;
            }else{
                start=mid +1;
            }
        }

        if(arr[start]>num  ){
            return arr[start];
        }
        if(arr[start]<num){
            return arr[start +1];
        }

        return Integer.MIN_VALUE;
    }
}

















//    public static int ceiling(int[] arr,int num){
//        //array is ordred <==> binary search
//        int mid;
//        int start = 0;
//        int end = arr.length -1;
//
//        while( start<=end  ){
////          mid =  (start+end)/2;// start+end could exceed int range
//            mid = start + (end - start) /2;
//            if(arr[mid]==num){
//                System.out.println("1");
//                return arr[mid];
//            }
//            if(start==end-1 && mid<start){
//                System.out.println("2");
//                return arr[end];
//            }
//            if(start==end-1 && mid>start){
//                System.out.println("3");
//                return arr[end+1];
//            }
//            if (start==end && arr[end]>num){
//                System.out.println("4");
//                return arr[end];
//            }
//            if (start==end && arr[end]<num ){
//                System.out.println("6");
//                return arr[end +1];
//            }
//
//            if (arr[mid]>num){
//                end= mid-1;
//            }else{
//                start=mid +1;
//            }
//        }
//
//        if(start< arr.length-1 && arr[start]>num){
//            System.out.println("7");
//            return arr[start];
//        }
//        else if(start< arr.length-2 && arr[start]<num){
//
//            System.out.println("8");return arr[start+1];
//        }
//
//
//        return Integer.MIN_VALUE;
//    }
//}
