public class methodexample {
  public static <T> void printArray(T[] array) {
    for (T element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Integer[] ints = { 1, 2, 3 };
    String[] strings = { "a", "b", "c" };

    methodexample.printArray(ints);
    methodexample.printArray(strings);
  }
}
