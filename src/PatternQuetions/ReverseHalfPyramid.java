package PatternQuetions;
//4 -> ReverseHalfPyramid
public class ReverseHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){//decrease from 5 to 1 rows
            for(int j=1;j<=i;j++){//printing from column 1 to number of i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        output
//        *****
//        ****
//        ***
//        **
//        *

//logic
//i=5 j printing from 1 -5 *
//i=4 j printing from 1 -4 *
//i=3 j printing from 1 -3 *
//i=2 j printing from 1 -2 *
//i=1 j printing from 1 -1 *


