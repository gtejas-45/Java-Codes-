import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max number index : ");
        int index = sc.nextInt();
        System.out.print(arr[--index]);

    }
}