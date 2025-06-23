class Calculator<T extends Number> {
  private T number;

  public Calculator(T number) {
    this.number = number;
  }

  public double doubleValue() {
    return number.doubleValue();
  }
}

public class upperboundexp {
  public static void main(String[] args) {
    Calculator<Integer> calc1 = new Calculator<>(10);
    Calculator<Double> calc2 = new Calculator<>(20.5);

    System.out.println(calc1.doubleValue());
    System.out.println(calc2.doubleValue());
  }
}
