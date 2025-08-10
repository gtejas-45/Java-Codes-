package JavaBasic;

import java.util.Scanner;

public class Robustness {
    public static void main (String [] agrs){
        System.out.println("For understanding what is real Robust check the code and understand from comment  ");
        System.out.println("Definition:\n" +
                "Robustness is the quality of a software system to operate correctly even in the presence of invalid inputs, system faults, or unexpected usage.");
        System.out.println(" Key Features of a Robust Program:\n" +
                "Error Handling: It catches exceptions and handles them properly (e.g., try-catch blocks in Java).\n" +
                "\n" +
                "Validation: It checks for invalid inputs before processing.\n" +
                "\n" +
                "Boundary Checking: It avoids buffer overflows, index out of bounds, etc.\n" +
                "\n" +
                "Fails Gracefully: It does not crash; instead, it shows user-friendly error messages or logs the error.\n" +
                "\n" +
                "Fault Tolerance: It continues operating even if some parts fail.\n" +
                "\n" +
                "Security-Aware: It protects against malicious or malformed inputs (like SQL injection or buffer overflow)");
        Scanner sc = new Scanner(System.in);
//        try{
//            //int num = sc.nextInt();
//            int num = Integer.parseInt("abc")
//        }catch (Exception e){
//            System.out.println("Invalid");
//        }
        System.out.println("enter number : ");
        Integer num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println(" number is 1");
                break;
            case 2:
                System.out.println("number is 2 ");
                break;
            default:
                System.out.println("Invalid input");// it don't give errors because we give the default vales
        }

    }

}

//Definition:
//Robustness is the quality of a software system to operate correctly even in the presence of invalid inputs, system faults, or unexpected usage.
//Key Features of a Robust Program:
//      Error Handling: It catches exceptions and handles them properly (e.g., try-catch blocks in Java).
//      Validation: It checks for invalid inputs before processing
//      Boundary Checking: It avoids buffer overflows, index out of bounds, etc.
//      Fails Gracefully: It does not crash; instead, it shows user-friendly error messages or logs the error.
//      Fault Tolerance: It continues operating even if some parts fail.
//      Security-Aware: It protects against malicious or malformed inputs (like SQL injection or buffer overflow)