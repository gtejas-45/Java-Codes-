package JavaBasic;

public class ContinueStatement {
    // Java Program to illustrate the use of
// continue statement inside the Do-While loop
        public static void main(String[] args)
        {
            int i = 0;

            // Do-While loop for iteration
            do
            {
                // Continue Statement used when
                // i is equal to 3
                if (i == 3)
                {
                    i++;
                    continue;
                }

                System.out.print(i+" ");
                i ++;

                // Condition check
            } while (i <= 5);
        }
}
