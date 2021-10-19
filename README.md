1.What is the difference between java and C++?
                       Java	                                                                        C++
        *Java is platform independent.	                                     *C++ is platform dependent.
        *It can be executed on platform	                   *Needs to be compiled on every platform
        *Portable                                                                    *Not portable
        *There is garbage collection in java                              *There is no garbage collection         
        * There are no pointers                                                * There are pointers in C++
2.Why pointers are not used in Java?
    Java doesn’t use pointers because they are unsafe and increases the complexity of the program. Since, Java is known for its simplicity of code, adding the concept of pointers will be contradicting. Moreover, since JVM is responsible for implicit memory allocation, thus in order to avoid direct access to memory by the user, pointers are discouraged in Java.

3.What is the platform?
      A platform is the hardware or software environment in which a piece of software is executed. There are two types of platforms, software-based and hardware-based. Java provides the software-based platform.

4.What is portability?
   The capability of programing language get compiled one platform and getting executed on any other platform.

5.What is platform dependent language?
    Any programming languages that expects the platform to be the same at the time of compilation  and execution are called platform dependent language.

6.What is platform independent language?
    Any programming languages that do not expects the platform to be the same at the time of compilation  and execution are called platform independent language.

7.Why Java is platform independent? 
    Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.

8.What gives Java its 'write once and run anywhere' nature?
     The bytecode. Java compiler converts the Java programs into the class file (Byte Code) which is the intermediate language between source code and machine code. This bytecode is not platform specific and can be executed on any computer.

9.List the features of Java Programming language.
   There are the following features in Java Programming Language.
   o  Simple: 
         Java is easy to learn. The syntax of Java is based on C++ which makes easier to write the program in it.
   o  Object-Oriented:
         Java follows the object-oriented paradigm which allows us to maintain our code as the combination of different type of objects that incorporates both data and behavior
   o  Portable:
          Java supports read-once-write-anywhere approach. We can execute the Java program on every machine. Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.
   o  Platform Independent: 
          Java is a platform independent programming language. It is different from other programming languages like C and C++ which needs a platform to be executed. Java comes with its platform on which its code is executed. Java doesn't depend upon the operating system to be executed.
   o Secured: 
         Java is secured because it doesn't use explicit pointers. Java also provides the concept of ByteCode and Exception handling which makes it more secured.
   o Robust: 
       Java is a strong programming language as it uses strong memory management. The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.
   o Architecture Neutral:
        Java is architectural neutral as it is not dependent on the architecture. In C, the size of data types may vary according to the architecture (32 bit or 64 bit) which doesn't exist in Java.
   o Interpreted: 
         Java uses the Just-in-time (JIT) interpreter along with the compiler for the program execution.
   o High Performance: 
         Java is faster than other traditional interpreted programming languages because Java bytecode is "close" to native code. It is still a little bit slower than a compiled language (e.g., C++).
   o Multithreaded: 
         We can write Java programs that deal with many tasks at once by defining multiple threads. The main advantage of multi-threading is that it doesn't occupy memory for each thread. It shares a common memory area. Threads are important for multi-media, Web applications, etc.
   o Distributed: 
         Java is distributed because it facilitates users to create distributed applications in Java. RMI and EJB are used for creating distributed applications. This feature of Java makes us able to access files by calling the methods from any machine on the internet.
   o Dynamic: 
         Java is a dynamic language. It supports dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, i.e., C and C++.

10.What are the various access specifiers in Java?
      In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. In Java, there are four access specifiers given below.
     oPublic -->The classes, methods, or variables which are defined as public, can be accessed by any class or method.
     oProtected--> Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
     oDefault -->Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
     oPrivate--> The private class, methods, or variables defined as private can be accessed within the class only.

11.What if I write static public void instead of public static void?
    The program compiles and runs correctly because the order of specifiers doesn't matter in Java.

12.What will happen when public is not specified?
      JVM will not access main method not found it is not visible to JVM because it is not public, so we have to define public.

13.What will happen static keyword is not specified? 
      It will compile but execution will not take place. Due to there is no object created,jvm will not call main method.

14.Explain about main() method in java?
      Main() method is starting point of execution for all java applications.
      public static void main(String[] args){}
      String args[] are array objects we need to pass command line arguements. 

15.Explain JVM, JRE and JDK? 
    *JVM (Java Virtual Machine): 
       JVM(Java Virtual Machine) acts as a run-time engine to run Java applications. JVM is the one that actually calls the main method present in a Java code. JVM is a part of JRE(Java Runtime Environment).
   *JRE (Java Runtime Environment): 
       JRE refers to a runtime environment in which Java bytecode can be executed. It implements the JVM (Java Virtual Machine) and provides all the class libraries and other support files that JVM uses at runtime. So JRE is a software package that contains what is required to run a Java program. Basically, it’s an implementation of the JVM which physically exists. 
    *JDK(Java Development Kit): 
      It is the tool necessary to compile, document and package Java programs. The JDK completely includes JRE which contains tools for Java programmers. The Java Development Kit is provided free of charge. Along with JRE, it includes an interpreter/loader, a compiler (javac), an archiver (jar), a documentation generator (javadoc) and other tools needed in Java development. In short, it contains JRE + development tools.

16.How many types of memory areas are allocated by JVM?
    1.Class(Method) Area: Class Area stores per-class structures such as the runtime constant pool, field, method data, and the code for methods.
    2.Heap: It is the runtime data area in which the memory is allocated to the objects
    3.Stack: Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation and return. Each thread has a private JVM stack, created at the same time as the thread. A new frame is created each time a method is invoked. A frame is destroyed when its method invocation completes.
    4.Program Counter Register: PC (program counter) register contains the address of the Java virtual machine instruction currently being executed.
    5.Native Method Stack: It contains all the native methods used in the application.

17.What is classloader?
       Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded first by the classloader. There are three built-in classloaders in Java.
              1.	Bootstrap ClassLoader: This is the first classloader which is the superclass of Extension classloader. It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, java.net package classes, java.util package classes, java.io package classes, java.sql package classes, etc.
              2.	Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader. It loads the jar files located inside $JAVA_HOME/jre/lib/ext directory.
              3.	System/Application ClassLoader: This is the child classloader of Extension classloader. It loads the class files from the classpath. By default, the classpath is set to the current directory. You can change the classpath using "-cp" or "-classpath" switch. It is also known as Application classloader
18.Why use JDK?
Here are the important reasons of using JDK:
JDK contains tools required to write Java programs, and JRE to execute them.
It includes a compiler, Java application launcher, Appletviewer, etc.
Compiler converts code written in Java into byte code.
Java application launcher opens a JRE, loads the necessary class, and executes its main method.

19.Why use JRE?
Here are the important reasons of using JRE:
JRE contains class libraries, JVM, and other supporting files. It does not contain any tool for Java development like a debugger, compiler, etc.
It uses important package classes like math, swingetc, util, lang, awt, and runtime libraries.
If you have to run Java applets, then JRE must be installed in your system.

20.Why JVM?
Here are the important reasons of using JVM:
JVM provides a platform-independent way of executing Java source code.
It has numerous libraries, tools, and frameworks.
Once you run Java program, you can run on any platform and save lots of time.
JVM comes with JIT(Just-in-Time) compiler that converts Java source code into low-level machine language. Hence, it runs more faster as a regular application.

21.What is an object in Java and how is it created?
     An object is a real-world entity that has a state and behavior. An object has three characteristics:
              1.	State: represents the data (value) of an object.
              2.	Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
              3.	Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.
       An object is created using the ‘new’ keyword. For example:
            ClassName obj = new ClassName();

22.What is a class in Java
    A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical.
      A class in Java can contain:
        Fields
        Methods
        Constructors
        Blocks
        Nested class and interface
   
23.What are the ways initialize an object list them?
     *By using reference variable
     *By using method
      *By using constructor

24.What are the ways initialize an object list them?
    *By new keyword
    *By newInstance() method
    *By clone() method
    *By factory() method
    *By serialization

25.What Is The Variable?
     Variable is a name which is given to a memory cell. Variable is also known as a container (or box) which is used to store data value during program execution in memory.

    example:
    public class VariableDemo {
 
    public static void main(String[] args) {
 
        // variable declaration
        int number;    
     
        // initialization / assign a value to variable
        number = 10;
 
        // modify variable value and assign it again
        number = number + 20;
    }
 
}
What are local variables in Java programming language?
   Local variables are variables declared within a method body.
     Local variables live only as long as the method in which it is declared remains on the stack.Local variables are stored on the stack.

What are static variables in Java programming language?
   Static variables (or fields) are variables declared within the class body, outside of any methods or blocks, and declared with 'static' keyword.
   Static variables have the longest scope. They are created when the class is loaded, and remain in memory as long as the class remains loaded in JVM.

What are instance variables in Java programming language?
   Instance variable are variables declared within the class body, outside of any method or block, and declared without 'static' keyword.
   Instance variables have the second highest scope. Instance variables are created when a new class instance is created, and live until the instance is removed from memory.

Can static method access instance variables ?
    Though Static methods cannot access the instance variables directly, They can access them using instance handler.  

When are static variables loaded in memory ?
    They are loaded at runtime when the respective Class is loaded. 

What happens if there are multiple main methods inside one class in Java?
  The program can't compile as the compiler says that the method has been already defined inside the class.

How Many Types Of Datatypes Are There In Java?
Java has two types of datatypes. 
1.	Primitive Data Type 
        There are 8 primitive data types in java i.e. short, byte, int, long, float, double, boolean and char.
2.	Non-primitive Data Type
      – array, class, interface and enum are non-primitive data types. If you have noticed, String is not primary / primitive data type in java. String is a name of class. Similarly you can also define your own custom class types like Student, User, etc.
