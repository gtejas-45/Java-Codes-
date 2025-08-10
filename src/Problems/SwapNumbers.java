package Problems;

public class SwapNumbers {
    public static void main(String[] args) {
        int a= 2;
        int b= 4;
        System.out.println("Before swapping : " + a + " " + b);

        //swap logic
        int temp =a;
        a = b;
        b = temp;

        System.out.println("After swapping : " + a + " " + b);
    }
}
