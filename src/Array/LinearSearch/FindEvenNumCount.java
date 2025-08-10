package Array.LinearSearch;

public class FindEvenNumCount {
    static int findNum(int[] nums){
        int count =0;
      for (int num : nums){
          if(even(num)){
              count++;
          }
      }
     return count;
    }
    static boolean even(int num){
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }
    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;

        }
        return count;

    }
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
        System.out.println(findNum(nums));
    }
}
