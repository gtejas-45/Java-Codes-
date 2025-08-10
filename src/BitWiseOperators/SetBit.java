package BitWiseOperators;
//2
//set 2nd bit (pos=1) and n=5
public class SetBit {
    public static void main(String[] args) {
        int n = 5;//101--2nd bit is 0 so set 1
        System.out.println(Integer.toBinaryString(n));
        int pos = 1;
        int bitMask = 1 << pos;
        int newnumber = bitMask | n;
        System.out.println(newnumber);
        System.out.println(Integer.toBinaryString(newnumber));

    }
}
