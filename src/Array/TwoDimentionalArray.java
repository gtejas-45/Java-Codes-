package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        //1
        int [][] arr4 = {
                        {1,2,3},
                        {4,5},
                        {6,7,8,9}
        };
        System.out.println(arr4.length);//rows
        System.out.println(arr4[1].length);//second rows column length
        System.out.println(arr4[2].length);//3rd rows column length

        //2
        Scanner sc = new Scanner(System.in);
        int [][] arr5 = new int[3][4];//3 row 4 column
        System.out.println(arr5.length);//gives row length
        //taking input
        for(int row = 0; row < arr5.length; row++ ){
            for(int col = 0; col < arr5[row].length; col++){
                arr5[row][col]=sc.nextInt();
            }
        }

        //display output
        //1
        for(int row = 0; row < arr5.length; row++ ){
            for(int col = 0; col < arr5[row].length; col++){
                System.out.print(arr5[row][col] + " ");
            }
            System.out.println();
        }
        //2
//        for (int[] a : arr5){
//            System.out.print(a);
//        }
        //3
        for(int row = 0; row < arr5.length; row++ ){
            System.out.println(Arrays.toString(arr5[row]));
        }
    }
}
