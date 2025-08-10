package BitWiseOperators;

public class OddNum {
    static boolean isodd(int num){
        return (num & 1) == 1;
    }
    public static void main(String[] args) {
        int num = -1;
        System.out.println(isodd(num));
    }
}
