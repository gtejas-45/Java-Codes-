package Problems;

public class PrimeNumber {
    static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 21;
      //  System.out.println(isPrime(n));
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " +isPrime(i));
        }
    }
}
