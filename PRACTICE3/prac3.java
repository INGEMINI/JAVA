
import java.util.Scanner;

abstract class c {
  abstract void intro();

  void season() {
    System.out.println("month of march");
  }
}

class d extends c {
  void intro() {
    System.out.println("welcome to d class");
  }
}

class a {
  int n;
  String name;

  a() {
    System.out.println("hi i am constructor");
  }

  a(String name) {
    this.name = name;
    System.out.println("my name is " + name);
  }

  a(String s, int n) {
    name = s;
    this.n = n;
    System.out.println("const of 2 parameter gets called");

  }

  a(int n) {
    this("unknown", n);
  }

  void intro() {
    System.err.println("jst practicing");
  }
}

class b extends a {
  void intro() {
    System.out.println("jst prcaticing on holi");
  }

}

public class prac3 {
  public static void main(String[] args) {
    b b1 = new b();
    b1.intro();
    Scanner sc = new Scanner(System.in);

    a a1 = new a("mahi ");
    a1.intro();

    d d1 = new d();
    d1.intro();
    d1.season();

    System.out.println("how many object of a u want");
    int n = sc.nextInt();
    a[] array = new a[n];
    for (int i = 0; i < n; i++) {
      array[i] = new a("name", 18);

    }
    for (int i = 0; i < n; i++) {
      array[i].intro();
    }

    sc.close();
  }
}