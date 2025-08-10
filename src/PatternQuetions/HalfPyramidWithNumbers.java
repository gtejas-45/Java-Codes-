package PatternQuetions;
//6->HalfPyramidWithNumbers
import java.util.Scanner;

public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number of row : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);//if 1 iterate 1 times it also it is going till n
            }
            System.out.println();
        }

    }
}

//        output
//        5 //input
//        1 //pattern
//        12
//        123
//        1234
//        12345