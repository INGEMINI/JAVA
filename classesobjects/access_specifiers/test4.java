package classesobjects.access_specifiers;
//default

public class test4 {
  int data = 10; // Default access variable

    void display() { // Default access method
        System.out.println("Default Access Method");
    }
  
}


// Usage in the same package:

// public class Main {
//   public static void main(String[] args) {
//       Test obj = new Test();
//       System.out.println(obj.data); // ✅ Accessible
//       obj.display(); // ✅ Accessible
//   }
// }

//Usage in a different package:

// package anotherpackage;
// import mypackage.Test;

// public class Main {
//     public static void main(String[] args) {
//         Test obj = new Test();
//         // System.out.println(obj.data); // ❌ ERROR: Not accessible
//         // obj.display(); // ❌ ERROR: Not accessible
//     }
// }