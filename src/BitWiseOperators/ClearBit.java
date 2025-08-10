package BitWiseOperators;
//3
//clear the 3rd bit (position = 2)
public class ClearBit {
    public static void main(String[] args) {
        int n =5;//we want to clear 3rd bit before that 101 and so last 001
        int pos = 2;
        int bitMask = 1 << pos;//so left shift 2 become 100
        int do_Not = ~bitMask;//do not operation of bitMask
        int do_clear = do_Not & n;//clear operation to clear pos 2
        System.out.println(do_clear);//1
    }

}
