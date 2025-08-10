package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //1
        int[] arr1 ;//declaration of array
        arr1 = new int[0];//initialization of array //dynamically allocate the memory
        //new keyword is used for creating object
        System.out.println(arr1.length);//array length

        //2
        int[] arr2 = {11,22,33};
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));

        //3
        Scanner sc = new Scanner(System.in);
        int[] arr3 = new int[5];
        //taking input from user
        for(int i = 0 ; i < arr3.length ; i++){
            arr3[i] = sc.nextInt();
        }

        //displaying output
        //1
        for(int i = 0 ; i < arr3.length ; i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        //2
        System.out.println(Arrays.toString(arr3));

        //3- by for-each loop
        for(int a : arr3){
            System.out.print(a + " ");
        }



    }
}
