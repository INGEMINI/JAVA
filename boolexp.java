public class boolexp {
  public static void main(String[] args) {
    boolean flag = true;
    int num = 1;

    // Trying to compare boolean and int (Invalid)
    // System.out.println(flag == num); // ❌ ERROR: Incompatible types

    // Correct way:
    if (flag) {
      System.out.println("Boolean is true!");
    }

    // Numeric check
    if (num == 1) {
      System.out.println("Number is 1!");
    }
  }
}
