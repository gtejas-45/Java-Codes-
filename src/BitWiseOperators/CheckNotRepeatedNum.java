package BitWiseOperators;

public class CheckNotRepeatedNum {
    public static void main(String[] args) {
        int[] arr = {1,33,4,5,1,4,5};
        System.out.println(check(arr));

    }
    static int check(int[] arr){
        int single = 0;
        for (int a : arr) {
            single^=a;
        }
        return single;

    }
}
