package JavaBasic;

public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello World");
        System.out.println("If u want brief Information it is on code part i comment in code");

    }
}
/*
public class HelloWorld {
  public -> It is access Specifier it is used to access the class from everywhere from various package
  class -> it is the blueprint of class . It donot take the memory in the class.
           ****In java there is minimum one java class****
  HelloWorld -> It is the class name
                The name of Class start's with capital letter and second letter also capital
  { -> starting of class
 */
/*
public static void main(String [] args){
| Part            | Meaning                                                                          |
| --------------- | -------------------------------------------------------------------------------- |
| `public`        | Can be accessed from outside the class. JVM needs to call it.                    |
| `static`        | Belongs to the class, not an object. JVM can call it without creating an object. |
| `void`          | This method does not return any value.                                           |
| `main`          | Special method where the program starts.                                         |
| `String[] args` | Accepts command-line arguments (an array of Strings).                            |
| '{'              Starting of main function                                                         |
 */
/*
System.out.println("Hello World");
System-> Built-in class in Java.
out-> A static object (of PrintStream) that represents the standard output (usually the console).
println()-> A method that prints the message and moves to a new line.
print() -> it also used for not printing in next line what we write it print in single line
}-> closing of main function
}-> closing of class

 */

/*
OUTPUT
What we write in print() printed
 */