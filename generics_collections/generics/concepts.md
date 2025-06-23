## Generics allow you to write classes, interfaces, and methods where the type of data is specified as a parameter.

Why use Generics?
To reuse code with different data types.

To provide stronger type checks at compile time.

To avoid explicit casting.

## To improve code readability and maintainability.

---

example (generic classes)

public class Box<T> {  
 // T is a type parameter (can be anything)
private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

}

public class main{
public static void main(string [] args){

    Box<Integer> intBox = new Box<>();

intBox.set(123);
System.out.println(intBox.get()); // outputs: 123

Box<String> strBox = new Box<>();
strBox.set("Hello Generics");
System.out.println(strBox.get()); // outputs: Hello Generics

}
}

//The type inside <> is called the type argument.

---

example (generic methods)

public class Util {
public static <T> void printArray(T[] array) {
for (T element : array) {
System.out.print(element + " ");
}
System.out.println();
}
}

---

Bounded Type Parameters -->
Sometimes you want to restrict the kinds of types a generic can accept.

1.upper bound
2.lower bound

Upper Bound (extends)
Limits type to be a subtype of a particular class/interface.

---

upper bound example

public class Numbers<T extends Number> {
private T num;

    public Numbers(T num) {
        this.num = num;
    }

    public double doubleValue() {
        return num.doubleValue();
    }

}

public class main{
public static void main(){

    Numbers<Integer> n1 = new Numbers<>(5);

Numbers<Double> n2 = new Numbers<>(5.5);
// Numbers<String> n3 = new Numbers<>("Hello"); // error, String not subclass of Number

}
}

---
lower bound example

Used with wildcards — more on wildcards later.

Wildcards (?)
Represents an unknown type.

Used mostly with method parameters and collections.

Example

List<?> list = new ArrayList<String>();
You can’t add to list except null because type is unknown, but you can read elements as Object.

Wildcard Bounds
? extends Type — Accepts Type or any subclass (upper bounded wildcard)

? super Type — Accepts Type or any superclass (lower bounded wildcard)

Example of bounded wildcard--

public void processNumbers(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}


