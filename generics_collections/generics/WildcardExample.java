import java.util.*;

public class WildcardExample {
  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.println(obj);
    }
  }

  public static void main(String[] args) {
    List<String> strList = Arrays.asList("A", "B", "C");
    List<Integer> intList = Arrays.asList(1, 2, 3);

    printList(strList);
    printList(intList);
  }
}
