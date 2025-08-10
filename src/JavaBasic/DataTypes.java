package JavaBasic;

public class DataTypes {
    public static void main(String[] args) {
                // Different Primitive data types
                boolean num4 = 4 > 2;
                System.out.println(num4); //true
                char name3 = 's'; //char name3 = "s"; //gives error because character is not in double quote
                System.out.println(name3);//s
                short val = 26653;
                System.out.println(val); //26653
                int val1 = 29999393;
                System.out.println(val1); //29999393
                long val3 = 939303920;
                System.out.println(val3); //939303920
                float pi = 3.14f;//store values up to 7 decimal places
                System.out.println(pi);//3.14
                double pi1 = 3.14;//store values up to 16 decimal places
                System.out.println(pi1); //3.14
                //typecasing means conversion of diff data types
                int num = 122202;
                System.out.println(num);//122202
                long num1 = num; // implicit conversion
                System.out.println(num1);//122202
                byte num2 = (byte) num; //explicit conversion
                // string data type non primitive
                System.out.println(num2);
                String name1 = "Tejas";
                String name2 = "Gaikwad";
                String r = name1 + name2;
                System.out.println(r);
    }
}
