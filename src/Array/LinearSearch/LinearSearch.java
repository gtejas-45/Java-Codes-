package Array.LinearSearch;

//1,22,33,44,55 find 33 index
public class LinearSearch {
    static int findNum(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i<arr.length;i++){
            int ele = arr[i];
            if(ele == target){
                System.out.print("number found at index : ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,22,33,44,55};
       int target = 33;
       int num = findNum(arr,target);
        System.out.println(num);

    }
}
