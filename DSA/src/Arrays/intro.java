package Arrays;
import java.util.Scanner;
import java.util.*;

public class intro {
    //syntax array
    int[] row = new int[10];
    static int[] row2 = {1,1,1,1,1};

    int[] ros;// declaration in stack(compile time)
    int[] ros2= new int[7];// initialisation the object is here being created (run time/ dynamic mem allocation)

    //multi dimentinal
    static int[][] matrix =new int[3][3];


    //syntax Array lists
    static ArrayList<Integer> list = new ArrayList<>(10);

    //multi dimentinal arraylist
    static ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0 ; i < row2.length ;i++){}
        // inhenced for loop
        for (int num : row2){}

//        for (int row=0 ; row < matrix.length ;row++){
//            for (int col=0 ; col < matrix[row].length ;col++){
//                matrix[row][col]=sc.nextInt();
//            }
//        }
//
//        for (int row=0 ; row < matrix.length ;row++){
//            for (int col=0 ; col < matrix[row].length ;col++){
//                System.out.print(matrix[row][col]+" ");
//            }
//            System.out.println("");
//        }
        // inhenced for loop
        for (int num : row2){}

        //even with the initial capacity you can still add as many items as you want
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);

        for (int j=0 ; j < 3 ;j++){
            matrix2.add(new ArrayList<>(3));

        }

        for (int i=0 ; i < matrix2.size() ;i++){
            for (int j=0 ; j < matrix2.size() ;j++){
                matrix2.get(i).add(j);

            }
        }

        System.out.println(matrix2);




    }


}
