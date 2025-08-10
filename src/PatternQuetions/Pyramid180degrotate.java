package PatternQuetions;
//5->Pyramid 180deg rotate
public class Pyramid180degrotate {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//           output
//              *       3 spaces 1 star
//             **       2 spaces 2 star
//            ***       1 spaces 3 star
//           ****       0 spaces 4 star