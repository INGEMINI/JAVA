package theory__packageconcept;

// Importing a class(scanner) from a package(java.util)

import java.util.Scanner;

// Class
class Greeting {
  // Method
  void sayHello() {
    System.out.println("Hello, Welcome to Java!");
  }
}

public class codeexpall {

  public static void main(String[] args) {
    // Using a class from Java's library
    Scanner sc = new Scanner(System.in);

    // Using a custom class
    Greeting greet = new Greeting();
    greet.sayHello(); // Calls the method

    // Input Example
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
    sc.close();

  }
}


// lib-java
//package-java.util
//class-java.util.scanner,greeting
//method- sayhello, main
//main function is special because it is the starting point of Java execution.Other methods like sayHello() are user-defined methods that perform specific tasks.