package Arrays.linearSearch;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1666525322/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {10,2345,3,4,5,6000,7,8,9};
        System.out.println(findNumburs(arr));

    }
    static int findNumburs(int[] arr){
        int number = 0;
        for(int i = 0; i < arr.length; i++){
            if(numberofDigitsEven(arr[i])){
                number++;
            }
        }
        return number;
    }

    static boolean numberofDigitsEven(int n){
        int number = 0;
        while(n >=10){
            n=n/10;
            number++;
        }
        if(number%2==1 && number!=0) {
            return true;
        }
        return false;
    }
}
