package JavaBasic;

public class BreakStatement {
    // Java Program to Illustrate break statement
        public static void main (String[] args) {

            //assigning n as integer value
            int n = 1;

            //passing n to switch
            // it will check n and display output accordingly
            switch(n) {

                case 1:
                    System.out.println("1st case");
                    break;
                case 2:
                    System.out.println("Second Case");
                    break;
                default:
                    System.out.println("default case");
            }
        }
}
