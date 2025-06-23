
public class multiplecatch {
  public static void main(String[] args) {

    try {
      int[] arr = new int[3];
      arr[5] = 10;
    } catch (ArithmeticException e) {
      System.out.println("Math error!");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array error!");
    }

  }

}
