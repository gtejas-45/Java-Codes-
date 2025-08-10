package PatternQuetions;
//14
public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;
        //upper part
        for(int i =1; i <= n; i++){
            //spaces in upper part
            for(int j =1;j <= n-i ;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower part
        for(int i =n; i >= 1; i--){
            //spaces in Lower part
            for(int j =1;j <= n-i ;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*

    *
   ***
  *****
 *******
 *******
  *****
   ***
    *

 */