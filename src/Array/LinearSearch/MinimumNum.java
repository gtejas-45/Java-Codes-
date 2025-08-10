package Array.LinearSearch;

public class MinimumNum {
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] arr = {11,2,33,44};
    int res = min(arr);
        System.out.println(res);
    }
}
