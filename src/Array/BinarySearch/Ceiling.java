package Array.BinarySearch;
//2
import java.util.Arrays;
//ceiling : It is the smallest number which is greater than or equals to target element
//Sorted array : [1, 3, 4, 5, 11, 12, 33, 44, 55]
//tagert is 13 - greater elements are 33,44,55 --among this 3 smallest is 33 --this 33 callest ceiling
public class Ceiling {
    static int findnum(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        if(target > arr[arr.length-1]){ //this is changed in binary program the greatest number of last number is not present on array so return -1 value
            return -1;
        }

        while (start <= end){

            int mid = start + (end-start) / 2;
//            is to avoid a potential problem known as integer overflow.
            if(target < arr[mid]){//if element is less than middle element end less than 1
                end = mid - 1;
            } else if (target > arr[mid]) {//if element is greater than middle element start is greater than 1
                start = mid + 1;
            }else {
                return mid;//if element is equal return middle element index
            }
        }
        return start;//only this change in binary search program //return the start index
    }
    public static void main(String[] args) {
        int[] arr = {11,12,33,4,5,3,44,55,1};
        Arrays.sort(arr); // binary serach is only works on sorted array
        System.out.println("Sorted array : " + Arrays.toString(arr));
        //int target = 55;
        int target = 13;
        int ans = findnum(arr,target);
        System.out.println(" Index : " + ans);

    }
}

/*
Sorted array : [1, 3, 4, 5, 11, 12, 33, 44, 55]
Start: 0, End: 8, Mid: 4, arr[mid]: 11
Start: 5, End: 8, Mid: 6, arr[mid]: 33
Start: 5, End: 5, Mid: 5, arr[mid]: 12
Start: 6, End: 5
Target: 13, Ceiling: 33 at index 6

 */