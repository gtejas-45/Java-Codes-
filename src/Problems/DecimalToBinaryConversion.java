package Problems;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("0");
        }
        //Decimal to Binary conversion
//        String Binary = " ";
//        while(num > 0){
//            int rem = num % 2;
//            num /= 2;
//            Binary = rem + Binary;
//        }
//        System.out.println(Binary);

        //Decimal to Octal conversion
//        String Octal = " ";
//        while(num > 0){
//            int rem = num % 8;
//            num /= 8;
//            Octal = rem + Octal;
//        }
//        System.out.println(Octal);

        //Decimal to Hexadecimal conversion

        String hex = "";
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9',
                'A','B','C','D','E','F'};

        while (num > 0) {
            int remainder = num % 16;
            hex = hexDigits[remainder] + hex;
            num = num / 16;
        }

        System.out.println("Hexadecimal: " + hex);


    }
}

