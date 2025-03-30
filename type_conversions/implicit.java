package type_conversions;

public class implicit {

  public static void main(String[] args) {
    byte b = 10;
    short s = b; // byte to short
    int i = s; // short to int
    long l = i; // int to long
    float f = l; // long to float
    double d = f; // float to double

    System.out.println("Byte value: " + b);
    System.out.println("Short value: " + s);
    System.out.println("Int value: " + i);
    System.out.println("Long value: " + l);
    System.out.println("Float value: " + f);
    System.out.println("Double value: " + d);

  }

}
