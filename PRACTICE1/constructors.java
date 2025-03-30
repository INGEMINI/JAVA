class employs {
  private int id;
  private String name;

  public void printdetails() {
    System.out.println("my id is " + id);

    System.out.println("my name is " + name);
  }

  public employs() {
    id = 00;
    name = "u can call me x";

  }

  public employs(String n, int i) {
    id = 00;
    name = n;

  }

  // no return value for constructor..
  // constructor will call automatically
  // automatic invoke of constructor

  // const can be parameterized or non parameterized
  // overloading of constructor is possible

  public String getname() {
    return name;
  }

  public void setname(String n) {
    this.name = n;

  }

  public void setid(int i) {
    id = i;

  }

  public int getid() {
    return id;

  }

}

public class constructors {

  public static void main(String[] args) {

    employs e1 = new employs();
    System.out.println(e1.getid());
    System.out.println(e1.getname());

  }
}
