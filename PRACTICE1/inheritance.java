class base {
  int x;

  public int getx() {
    return x;

  }

  base() {
    System.out.println("i am constructor of base");
  }

  base(int x) {

    System.out.println("i am an overloaded constructor of base " + x);
  }

  public void setx(int x) {
    this.x = x;

  }

  public void printme() {
    System.out.println("i am constructor");

  }

}

class derive extends base {

  int y;

  public int gety() {
    return y;

  }

  derive() {
    super(0);
    // super keyword is used in derive class constructor with d purpose that
    // parameterized constructor of base class will be called instead of non
    // parametrized constructor.
    System.out.println("i am constructor of derive");
  }

  derive(int x, int y) {
    super(x);
    // this means that x ko base ke constructor pr lekar jao ..aur base main usee
    // then milega constructor to then vo call hoga.

    System.out.println("i am an overloaded constructor of base" + y);
  }

  public void sety() {
    this.y = y;
  }

}

class childderive extends derive {

  childderive() {
    System.out.println("i am child of derive ");
  }

  childderive(int x, int y, int z) {
    super(x, y);

    System.out.println("i am overloaded const of derive " + z);
  }

}

public class inheritance {
  public static void main(String[] args) {

    base b = new base();

    derive d = new derive();
    d.setx(5);
    System.out.println(d.getx());

    childderive cd = new childderive(12, 13, 14);

  }

}
