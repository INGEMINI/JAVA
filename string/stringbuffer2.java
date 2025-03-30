public class stringbuffer2 {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println(sb.capacity()); // 16 (default) + 5 ("Hello") = 21

    sb.append("This is a long text to exceed capacity.");
    System.out.println(sb.capacity()); // Automatically increased
  }

}
