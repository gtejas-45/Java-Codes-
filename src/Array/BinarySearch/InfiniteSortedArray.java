package Array.BinarySearch;
//find element in infinite sorted array
public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,16,18,20,25,30,35,40,55,60,77,88,99,100};
        int target = 35;
        int ans = ans(arr,target);
        System.out.println(ans);

    }
    static int ans(int [] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
            int temp = end + 1;//new start
            //end = previous end + sizeofpreviousbox*2
            end = end + (end - start +1) *2;//end pointing to double the size than previous block
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr ,int target, int start, int end){
        while (start <= end){
            //  int mid = (start + end)/ 2;
            //does work in Java for most cases. But the reason we often prefer writing it like this:
            int mid = start + (end-start) / 2;
//            is to avoid a potential problem known as integer overflow.
            if(target < arr[mid]){//if element is less than middle element end less than 1
                end = mid - 1;
            } else if (target > arr[mid]) {//if element is greater than middle element start is greater than 1
                start = mid + 1;
            }else {
                return mid;//if rlrmnt is equal return middle element index
            }
        }
        return -1;//if element is not found return this
    }
}
