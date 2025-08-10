package Strings;

public class FormatSpecifier {
    public static void main(String[] args) {
        float a = 123.333333f;
        System.out.printf("Float : %.3f" , a); //Float : 123.333
        System.out.println();
        System.out.printf("My name is %s and I am from %s","Tejas","Latur");

        String name = "Alice";
        int age = 30;
        double price = 19.95;

        System.out.printf("Name: %s, Age: %d, Price: %.2f%n", name, age, price);
        // Output: Name: Alice, Age: 30, Price: 19.95


        double myNumber = 123456.78;
        String result;

        // Default
        result = String.format("%f", myNumber);
        System.out.println(result);

        // Two decimal digits
        result = String.format("%.2f", myNumber);
        System.out.println(result);

        // No decimal digits
        result = String.format("%.0f", myNumber);
        System.out.println(result);

        // No decimal digits but keep the decimal point
        result = String.format("%#.0f", myNumber);
        System.out.println(result);

        // Group digits
        result = String.format("%,.2f", myNumber);
        System.out.println(result);

        // Scientific notation with two digits of precision
        result = String.format("%.2e", myNumber);
        System.out.println(result);
    }
}
