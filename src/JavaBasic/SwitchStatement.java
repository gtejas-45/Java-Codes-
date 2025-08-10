package JavaBasic;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option = sc.next().charAt(0);
        int a= sc.nextInt();
        int b= sc.nextInt();
        switch (option){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            default :
                System.out.println("invalid");

        }

    }
}
