public class commandprac {
  public static void main(String[] args) {

    if (args.length < 4) {
      System.out.println("error");
      return;

    }

    String name = args[0];
    String course = args[1];
    String uniroll = args[2];
    String sem = args[3];

    System.out.println(name);
    System.out.println(course);
    System.out.println(uniroll);
    System.out.println(sem);
  }
}
