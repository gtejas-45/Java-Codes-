package PatternQuetions;
//1 ->Rectangle
public class RectanglePattern {
    public static void main(String[] args) {
        //5 col 4 rows
        //outer loop
        for(int i=0;i<4;i++){//rows ->we can start from 1 also but condition makes the equals to the rows
            //inner loop
            for(int j=0;j<5;j++){//column-> it prints the column * till condition false it is inner loop
                System.out.print("*");
            }
            System.out.println();//new line after executing inner loop
        }
    }
}

//        *****
//        *****
//        *****
//        *****