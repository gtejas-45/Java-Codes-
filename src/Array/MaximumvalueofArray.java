package Array;

public class MaximumvalueofArray {
    // finding maximum value
//    public static void max(int[] arr){
//        int max_val = 0;
//        for (int i = 0 ; i < arr.length ; i++){
//            if(arr[i]>max_val){
//                max_val = arr[i];
//            }
//        }
//        System.out.println("Max Value is :" + max_val);
//    }
//    public static void main(String[] args) {
//        int [] arr = { 11,22,43,65};
//        max(arr);
//    }

    //finding maximum value in given range
    public static void max(int[] arr,int start,int end){
        int max_val = 0;
        for (int i = start ; i < end ; i++){
            if(arr[i]>max_val){
                max_val = arr[i];
            }
        }
        System.out.println("Max Value is :" + max_val);
    }
    public static void main(String[] args) {
        int [] arr = { 11,22,43,65,22,0,33};
        max(arr,1,3);
        max(arr,0,6);
    }
}
