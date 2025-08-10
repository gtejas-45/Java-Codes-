package Array.BinarySearch;
//3
import java.util.Arrays;
//Floor : It is the Greatest number which is Smaller than or equals to target element
//Sorted array : [1, 3, 4, 5, 11, 12, 33, 44, 55]
//tagert is 13 - smallest elements are 1, 3, 4, 5, 11, 12 --among this Greatest is 12 --this 12 is floor
public class Floor {
    static int findnum(int[] arr ,int target){
        int start = 0;
        int end = arr.length-1;
        if(target < arr[0]){ //this is changed in binary program the smallest number of first number is not present on array so return -1 value
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
        return end;//only this change in binary search program
    }
    public static void main(String[] args) {
        int[] arr = {11,12,33,4,5,3,44,55,1};
        Arrays.sort(arr); // binary serach is only works on sorted array
        System.out.println("Sorted array : " + Arrays.toString(arr));
//        int target = 1;
        int target = 13;
        int ans = findnum(arr,target);
        System.out.println(" Index : " + ans);

    }
}

/*
Dry run of code

Sorted array : [1, 3, 4, 5, 11, 12, 33, 44, 55]
Start: 0, End: 8, Mid: 4, arr[mid]: 11
Start: 5, End: 8, Mid: 6, arr[mid]: 33
Start: 5, End: 5, Mid: 5, arr[mid]: 12
Start: 6, End: 5
Target: 13, Floor: 12 at index 5

 */