public class throwdemo {
  public static void validate(int age) {
    try {
      if (age < 18)
        throw new ArithmeticException("Not eligible");
      else
        System.out.println("Eligible");
    } finally {

    }

  }

  public static void main(String[] args) {
    validate(15);
  }
}
