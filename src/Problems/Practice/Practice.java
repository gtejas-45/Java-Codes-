package Problems.Practice;
import java.util.*;

public class Practice {

        public static int minEnergy(int A) {
            if (A == 1) return 0; // Already have 1 line at start

            int[] dp = new int[A + 1];
            Arrays.fill(dp, Integer.MAX_VALUE);
            dp[1] = 0;

            for (int i = 2; i <= A; i++) {
                // Option 1: select 1 line and paste (2 energy)
                dp[i] = dp[i - 1] + 2;
                // Option 2: for any factor of i
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        // select all 'j' lines (cost 1) + (i/j - 1) pastes (cost 1 each)
                        dp[i] = Math.min(dp[i], dp[j] + 1 + (i / j - 1));
                    }
                }
            }

            return dp[A];
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A = sc.nextInt();           // e.g., 2
            System.out.println(minEnergy(A));
        }
    }