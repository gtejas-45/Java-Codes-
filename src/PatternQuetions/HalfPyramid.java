package PatternQuetions;
//3 ->HalfPyramid
public class HalfPyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){//rows
            for(int j=1;j<=i;j++){//columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//        output
//        *         //main logic is number of rows is equals to number of columns so in second for loop it is used
//        **
//        ***
//        ****