package BitWiseOperators;
//1
//get bit at 3rd bit (position is 2)
public class GetBit {
    public static void main(String[] args) {
        int n = 5;//101--3rd bit is 1 so bit is not zero
        System.out.println(Integer.toBinaryString(n));
        int pos = 2;
        int bitMask = 1 << pos;
        System.out.println(Integer.toBinaryString(bitMask));
        if((bitMask & n) == 0){
            System.out.println("bit is zero");
        }else {
            System.out.println("bit is not zero");
        }
    }
}
