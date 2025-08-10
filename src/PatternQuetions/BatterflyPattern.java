package PatternQuetions;
//10->BatterflyPattern
/*
 *        *
 **      **
 ***    ***
 ****  ****
 **********
 **********
 ****  ****
 ***    ***
 **      **
 *        *
 */
public class BatterflyPattern {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            //1st half part of pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //3d * part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //1st half part of pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //3d * part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
