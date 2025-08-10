package Array.BinarySearch;
//4

public class SmallestLetter {
    static char findchar(char[] letters ,char target){
        int start = 0;
        int end = letters.length-1;
        while (start <= end){

            int mid = start + (end-start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'd';
       char ans = findchar(letters,target);
        System.out.println(ans);


    }
}

