package BitWiseOperators;
//4
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 = set   2=clear
        int a = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1 << pos;
        if (a == 1) {
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        }else {
            int do_Not = ~bitMask;//do not operation of bitMask
            int do_clear = do_Not & n;//clear operation to clear pos 2
            System.out.println(do_clear);
        }

    }
}
