package classesobjects.ovveride_annotation;

class Parent {
  void showMessage() {
    System.out.println("Message from Parent class");
  }
}

class Child extends Parent {
  @Override
  void showMessage() {
    System.out.println("Message from Child class");
  }
}

public class concept {
  public static void main(String[] args) {
    Parent obj = new Child();
    obj.showMessage(); // Calls the overridden method in Child class
  }
}
