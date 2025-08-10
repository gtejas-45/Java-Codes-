package PatternQuetions;
//2 -> HollowRectangle
public class HollowRectangle {
    public static void main(String[] args) {
        //5 column 4 rows
        int n=4;// rows
        int m=5;// col
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();//new line
        }
    }
}

//        output
//        *****     //start outer loop  from 1 - rows -> after that inner loop from 1 to column
//        *   *     //main logic is this here where i=1 ,j=1,i=total row number,j=total column number star is present to do this in inner loop
//        *   *
//        *****
