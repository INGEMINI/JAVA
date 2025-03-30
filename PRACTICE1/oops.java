// 1 java file can have 1 public class only

class employee {
  int id;
  String name;

  public void printdetails() {
    System.out.println("my id is " + id);

    System.out.println("my name is " + name);
  }

}

public class oops {
  public static void main(String[] args) {

    System.out.println("this is our custom class demo.");

    employee mahi = new employee();

    mahi.id = 12;
    mahi.name = "coding & mahi ";
    // System.out.println(mahi.id);
    // System.out.println(mahi.name);

    mahi.printdetails();

    employee anuj = new employee();

    anuj.id = 21;
    anuj.name = "coding & anuj ";
    // System.out.println(mahi.id);
    // System.out.println(mahi.name);

    anuj.printdetails();

  }

}
