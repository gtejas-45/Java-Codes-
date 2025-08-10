package Array.BinarySearch;
//1
import java.util.Arrays;

public class BinarySearch {
    static int findnum(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;

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
    public static void main(String[] args) {
        int[] arr = {11,12,33,4,5,3,44,55,1};
        Arrays.sort(arr); // binary serach is only works on sorted array
        System.out.println("Sorted array : " + Arrays.toString(arr));
        int target = 12         ;
        int ans = findnum(arr,target);
        System.out.println(ans);

    }
}

/*
Problem with (low + high) / 2:
If low and high are very large integers, adding them together could exceed the maximum value an int can store in Java.

The maximum value of int in Java is:
Integer.MAX_VALUE = 2,147,483,647
So, if:
low = 2_000_000_000
high = 2_000_000_000
Then:
(low + high) = 4_000_000_000   // This is more than Integer.MAX_VALUE
This causes an overflow, and the result becomes negative or incorrect.

✅ Why low + (high - low) / 2 is Safer:
int mid = low + (high - low) / 2;
Let’s say:
low = 2_000_000_000
high = 2_000_000_010
Then:
(high - low) = 10
(high - low) / 2 = 5
mid = low + 5 = 2_000_000_005  ✅ Safe!
Since we subtract first, (high - low) will never exceed the size of the array, so the calculation always stays within the int range.

✅ When Does Overflow Happen?
In small arrays like {5, 3, 4, 10, 40}, overflow won't happen.

But in:

Big arrays (like int[] arr = new int[1_000_000_000])

Complex systems (like large-scale search algorithms, memory-intensive programs, etc.)

You should always prefer:
int mid = low + (high - low) / 2;
🧠 Conclusion:
✅ You can use (low + high) / 2 safely in small programs, but in professional or large-scale systems, always use:

int mid = low + (high - low) / 2;
 */