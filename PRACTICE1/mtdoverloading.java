public class mtdoverloading {

  static void joke() {
    System.out.println(
        "genz call love but they r actually living in delulu and then call in situationship..fuck u that 80% genz category..u will pay for yr sins");
  }

  static void joke(int a) {
    System.out.println(
        "bye bye ");
  }

  static void array(int[] v) {
    // Integer Immutability in for-each loops:

    // When you use a for-each loop, Java assigns each array element to ele, which
    // is a copy of the actual array value, not a direct reference.
    // Modifying ele inside the loop does not change the actual array.

    for (int ele : v) {
      ele = ele + 1;
    }

    for (int i = 0; i < v.length; i++) {
      v[i] = v[i] + 1;
      // Modifying actual array elements
    }
  }

  public static void main(String[] args) {

    joke();
    int[] m = { 1, 2, 3, 4, 5 };
    array(m);
    System.out.println(" ");
    for (int ele : m) {
      System.out.println(ele);
    }

    joke(2);

  }
}
