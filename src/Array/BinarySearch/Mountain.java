package Array.BinarySearch;
//6  finding Mountain element --
public class Mountain {
    static int findmountain(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int ans = findmountain(arr);
        System.out.println(ans);

    }
}
