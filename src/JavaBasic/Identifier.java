package JavaBasic;

public class Identifier {
    public static void main(String[] args) {
        int a=10;
        System.out.println("An identifier in Java is the name given to Variables, Classes, Methods, Packages, Interfaces, etc. \nThese are the unique names used to identify programming elements. Every Java Variable must be identified with a unique name.");
        System.out.println("for more information go to code Comment");
    }
}
/*
An identifier in Java is the name given to Variables, Classes, Methods, Packages, Interfaces, etc.
These are the unique names used to identify programming elements. Every Java Variable must be identified with a unique name.

In the above Java code, we have 5 identifiers as follows:
        Identifier: Class Name
        main: Method Name
        String: Predefined Class Name
        args: Variable Name
        a: Variable Name

        Rules For Naming Java Identifiers
        There are certain rules for defining a valid Java identifier. These rules must be followed, otherwise, we get a compile-time error. These rules are also valid for other languages like C and C++.

        1)The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), '$'(dollar sign) and '_' (underscore). For example, "geek@" is not a valid Java identifier as it contains a '@', a special character.
        2)Identifiers should not start with digits([0-9]). For example, "123geeks" is not a valid Java identifier.
        3)Java identifiers are case-sensitive.
        4)There is no limit on the length of the identifier, but it is advisable to use an optimum length of 4 - 15 letters only.
        5)Reserved Words can't be used as an identifier. For example, "int while = 20;" is an invalid statement as a while is a reserved word.
 */

/*
Reserved Words in Java
Any programming language reserves some words to represent functionalities defined by that language. These words are called reserved words. They can be briefly categorized into two parts:

Keywords (50): Keywords define functionalities.
literals (3): Literals define value.
 */