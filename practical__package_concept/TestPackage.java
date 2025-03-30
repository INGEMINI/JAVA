package practical__package_concept;


import practical__package_concept.mypackage.MyClass;
import practical__package_concept.mypackage.SubClass;

public class TestPackage {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        SubClass obj2 = new SubClass();

        obj1.display();
        obj2.show();
    }
}
