package JavaBasic;

public class DoWhileLoop {
    // Java Program to Illustrate One Time
    // Iteration Inside do-while Loop
    // When Condition is Not Satisfied
        public static void main(String[] args)
        {
            // initial counter variable
            int c = 0;

            do {
                // Body of loop that will execute minimum
                // 1 time for sure no matter what
                System.out.println("Print Statement");
                c++;
            }
            // Checking condition
            // Note: It is being checked after
            // minimum 1 iteration
            while (c < 0);
        }

}
