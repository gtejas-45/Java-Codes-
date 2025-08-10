package Problems;
// Amstrong Number
//        153 (3 digits):
//        1³ + 5³ + 3³ = 1 + 125 + 27 = 153
//
//        9474 (4 digits):
//        9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474
public class AmstrongNumber {
    public static void main(String[] args) {
        //checking amstrong number
        int orignal = 152;
//        int orignal = 9474;
//        int a= 9474; //4 number
        int a = orignal;
        int sum = 0;
        while (a > 0){
            int rem = a % 10;
            a = a / 10;
            int cube = rem*rem*rem;
            //sum = sum + rem*rem*rem*rem;//for 4
            sum = sum + cube;

        }
        if(sum == orignal) {
            System.out.println("It is amstrong number");
        }
        else{
            System.out.println(" no ");
        }
    }
}
