package Problems;
//2-> Accurance of element in given set of series
// 1385757879 find 7 accurance means count is 3

public class MoreAccuranceOfeEement {
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


        //finding count of element
        int n = 1385757879;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 7){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Count of 7 is : " + count);

    }

}
