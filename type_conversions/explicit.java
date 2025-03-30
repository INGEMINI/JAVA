package type_conversions;

public class explicit {

  public static void main(String[] args) {
    double d = 99.99;
    float f = (float) d; // double to float
    long l = (long) f; // float to long
    int i = (int) l; // long to int
    short s = (short) i; // int to short
    byte b = (byte) s; // short to byte

    System.out.println("Double value: " + d);
    System.out.println("Float value: " + f);
    System.out.println("Long value: " + l);
    System.out.println("Int value: " + i);
    System.out.println("Short value: " + s);
    System.out.println("Byte value: " + b);

  }

}
