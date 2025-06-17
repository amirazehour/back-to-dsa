package Arrays.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6},
        };
        System.out.println( maximumWealth(arr));

    }

     public static   int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum;
        for (int i = 0; i < accounts.length; i++) {
             sum= rowSum(accounts[i]);
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static int rowSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

}
