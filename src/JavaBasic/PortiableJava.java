package JavaBasic;

public class PortiableJava {
//    What is Portability?
//    Portability means:
//
//            "Write once, run anywhere."
//
//    Java programs can run on any device or operating system that has a Java Virtual Machine (JVM).
    public static void main(String [] args){
        System.out.println("What is Portability?\n" +
                "Portability means:\n" +
                "\n" +
                "\"Write once, run anywhere.\"\n" +
                "\n" +
                "Java programs can run on any device or operating system that has a Java Virtual Machine (JVM).");
        System.out.println();
        System.out.println("| Feature                        | Explanation                                                                 |\n" +
                "| ------------------------------ | --------------------------------------------------------------------------- |\n" +
                "| Bytecode                       | Java code is compiled into platform-independent **bytecode** (.class files) |\n" +
                "| JVM                            | The same bytecode can run on **any machine** that has a JVM                 |\n" +
                "| No platform-dependent features | Unlike C/C++, Java avoids OS-specific instructions                          |\n");
    }


}

//        | Feature                        | Explanation                                                                 |
//        | ------------------------------ | --------------------------------------------------------------------------- |
//        | Bytecode                       | Java code is compiled into platform-independent **bytecode** (.class files) |
//        | JVM                            | The same bytecode can run on **any machine** that has a JVM                 |
//        | No platform-dependent features | Unlike C/C++, Java avoids OS-specific instructions                          |
