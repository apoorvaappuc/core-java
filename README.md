1.What is the difference between java and C++?
                       Java	                                                                        C++
        *Java is platform independent.	                                     *C++ is platform dependent.
        *It can be executed on platform	                   *Needs to be compiled on every platform
        *Portable                                                                    *Not portable
        *There is garbage collection in java                              *There is no garbage collection         
        * There are no pointers                                                * There are pointers in C++
 
2.What is the platform?
      A platform is the hardware or software environment in which a piece of software is executed. There are two types of platforms, software-based and hardware-based. Java provides the software-based platform.

3.What is portability?
   The capability of programing language get compiled one platform and getting executed on any other platform.

4.What is platform dependent language?
    Any programming languages that expects the platform to be the same at the time of compilation  and execution are called platform dependent language.

5.What is platform independent language?
    Any programming languages that do not expects the platform to be the same at the time of compilation  and execution are called platform independent language.

6.Why Java is platform independent? 
    Platform independent practically means “write once run anywhere”. Java is called so because of its byte codes which can run on any system irrespective of its underlying operating system.

7.What gives Java its 'write once and run anywhere' nature?
     The bytecode. Java compiler converts the Java programs into the class file (Byte Code) which is the intermediate language between source code and machine code. This bytecode is not platform specific and can be executed on any computer.

8.List the features of Java Programming language.
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

9.What are the various access specifiers in Java?
      In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. In Java, there are four access specifiers given below.
     oPublic -->The classes, methods, or variables which are defined as public, can be accessed by any class or method.
     oProtected--> Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
     oDefault -->Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
     oPrivate--> The private class, methods, or variables defined as private can be accessed within the class only.

10.What if I write static public void instead of public static void?
    The program compiles and runs correctly because the order of specifiers doesn't matter in Java.

11.What will happen when public is not specified?
      JVM will not access main method not found it is not visible to JVM because it is not public, so we have to define public.

12.What will happen static keyword is not specified? 
      It will compile but execution will not take place. Due to there is no object created,jvm will not call main method.

13.Explain about main() method in java?
      Main() method is starting point of execution for all java applications.
      public static void main(String[] args){}
      String args[] are array objects we need to pass command line arguements. 

14.

