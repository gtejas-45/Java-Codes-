package PatternQuetions;
//8-> HalfPyramidByNumber and special number manipulating
/*
public class HalfPyramidByNumber {
    public static void main(String[] args) {
        int n=4;
        int number=1;//start the number from 1 and later number increase by 1 when inner loop is stisfy the condition
        //outer
        for(int i=1;i<=n;i++){
            //inner-> Actual counting of number starts from here
            for(int j=1;j<=i;j++){

                System.out.print(" " + number + " ");
                number++;

            }
            System.out.println();
        }
    }
}

//         1
//         2  3
//         4  5  6
//         7  8  9  10
*/

/*

public class HalfPyramidByNumber {
    public static void main(String[] args) {
        int n=4;
        int number=1;//start the number from 1 and later number increase by 1 when inner loop is stisfy the condition
        //outer
        for(int i=1;i<=n;i++){
            //inner-> Actual counting of number starts from here
            for(int j=1;j<=i;j++){

                System.out.print(" " + number + " ");

                if(number==1){//by this we can do change by using if else
                    number=0;
                }
                else {
                    number=1;
                }
            }
            System.out.println();
        }
    }
}

    //output
    // 1
    // 0  1
    // 0  1  0
    // 1  0  1  0


 */
    //another logic for above code
public class HalfPyramidByNumber {
    public static void main(String[] args) {
        int n=4;
        //outer
        for(int i=1;i<=n;i++){
            //inner-> Actual counting of number starts from here
            for(int j=1;j<=i;j++){
                int sum=i+j;//actual here we add the the i and j value if their sum is even it gives 1 if not 0
                if(sum%2==0){//even
                    System.out.print(" 1 ");
                }
                else {
                    System.out.print(" 0 ");
                }

            }
            System.out.println();//new line
        }
    }
}




