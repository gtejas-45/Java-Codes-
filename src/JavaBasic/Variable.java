package JavaBasic;

public class Variable {
       /*
       public static void main(String[] args) {
           //Variable Manipulation
           // declaring variable
            int num = 12;//local variable declaration
            System.out.println(num);// calling local//12
            String name="tejas";// string S always in uppercase
            System.out.println(name);//tejas
            int age;
            age=12;
            System.out.println(age);//12
            int val = 12;
            val=17;
            System.out.println(val);//17 o/p not 12
            //displaying variable
            String name1= "Tejas";
            String name2 = "Gaikwad";
            System.out.println(name1 + name2);//TejasGaikwad
            int x = 1;
            int y = 4;
            int c = x + y;
            System.out.println(c);//5
            //declaring variable
            int a = 3;
            int b = 4;
            int r = 4;
            System.out.println(a+b+r);//11
            int k,l,m;
            k=l=m=2;
            System.out.println(k+l+m);//6
            int u=2,t=4;
            System.out.println(u+t);//6

        */

            public static int num = 17; // static variable declaraion
            public String name;  // instance variable declaration
            public Variable(){
                // default constructor initializing of variable
                this.name= "Tejas";
            }
            public static void main(String[] args) {
                int num = 12;//local variable declartion
                System.out.println(num);// calling local
                System.out.println(Variable.num);//calling static by class name
                Variable obj = new Variable();//calling instance variable by creating obj
                System.out.println(obj.name);
        }

}

/*

In Java, variables are containers that store data in memory.
Key Components of Variables in Java:

A variable in Java has three components, which are listed below:

Data Type: Defines the kind of data stored (e.g., int, String, float).
Variable Name: A unique identifier following Java naming rules.
Value: The actual data assigned to the variable.
 */

/*
            There are three types of variables in Java: Local, Instance and Static.
    1) Local Variable
    A variable defined within a block or method or constructor is called a local variable.

    1]The Local variable is created at the time of declaration and destroyed when the function completed its execution.
    2]The scope of local variables exists only within the block in which they are declared.
    3]We first need to initialize a local variable before using it within its scope.

    2) Instance Variables
    Instance variables are known as non-static variables and are declared in a class outside of any method, constructor, or block.

    1]Instance variables are created when an object of the class is created and destroyed when the object is destroyed.
    2]Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier, then the default access specifier will be used.
    3]Initialization of an instance variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
    4]Scope of instance variables are throughout the class except the static contexts.
    5]Instance variables can be accessed only by creating objects.
    6]We initialize instance variables using constructors while creating an object. We can also use instance blocks to initialize the instance variables.

    3. Static Variables
    Static variables are also known as class variables.

    1]These variables are declared similarly to instance variables. The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
    2]Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.
    3]Static variables are created at the start of program execution and destroyed automatically when execution ends.
    4]Initialization of a static variable is not mandatory. Its default value is dependent on the data type of variable. For String it is null, for float it is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
    5]If we access a static variable like an instance variable (through an object), the compiler will show a warning message, which won't halt the program. The compiler will replace the object name with the class name automatically.
    6]If we access a static variable without the class name, the compiler will automatically append the class name. But for accessing the static variable of a different class, we must mention the class name as 2 different classes might have a static variable with the same name.
    7]Static variables cannot be declared locally inside an instance method.
    8]Static blocks can be used to initialize static variables.
 */