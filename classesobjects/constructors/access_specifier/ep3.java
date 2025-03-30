package classesobjects.constructors.access_specifier;



class Animal {
    String type;

    // Protected Constructor
    protected Animal(String type) {
        this.type = type;
    }

    void showType() {
        System.out.println("Animal Type: " + type);
    }
}

//
// package anotherpackage;
// import classesobjects.constructors.access_specifier.Animal;

// // Subclass in another package
// class Dog extends Animal {
//     Dog() {
//         super("Dog");  // Calling the protected constructor
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         // Animal a = new Animal("Lion"); // ERROR: Cannot access protected constructor
//         Dog d = new Dog();
//         d.showType();
//     }
// }

