package Problems;

public class ReverseNumber {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        //taking input
//        for(int i = 0;i < n;i++){
//            arr[i]=sc.nextInt();
//        }
//        //displaying array
//        for(int i = 0; i < n; i++){
//            System.out.print(arr[i]);
//        }
//        //reverse array logic below
//        for(int i = n-1; i > -1; i--){
//            System.out.print(arr[i]);
//        }

        int n = 12345;
        int reverse = 0;
        while (n>0){
            int rem = n % 10;//get remainder 5 -> 4 -> 3 -> 2 -> 1
            n = n / 10;// after that we got for 1 to 5 iteration -> 1234 -> 123 -> 12 -> 1
            reverse = reverse * 10 + rem;  //0*10 + 5 -> 5*10 + 4 -> 54*10 + 3 -> 543*10 + 2 -> 5432*10 + 1 ->
        }                                   //5         54          543             5432        54321(final result)
        System.out.println(reverse);

    }
}
