class cars {

  private int id;
  private String model;

  public void setname(String n) {

    model = n;
  }

  public String getname() {
    return model;
  }

  public void setid(int i) {
    id = i;

  }

  public int getid() {
    return id;
  }

}

// in cpp by default access modifier is private
// in java it will be package-private, meaning it can be accessed only within
// the same package.
public class accessmodifier {
  public static void main(String[] args) {

    cars tesla = new cars();
    // tesla.id = 11;
    // tesla.model = "X";

    tesla.setid(90);
    tesla.setname("X");

    System.out.println(tesla.getname());
    System.out.println(tesla.getid());

  }
}
