package abstract_classes;

interface Playable {
  void play();
}

// Abstract class implementing an interface
abstract class Instrument implements Playable {
  abstract void tune();
}

// Guitar extends Instrument
class Guitar extends Instrument {
  void tune() {
    System.out.println("Tuning the guitar...");
  }

  public void play() {
    System.out.println("Playing the guitar...");
  }
}

// Main class
public class AbstractWithInterface {
  public static void main(String[] args) {
    Guitar g = new Guitar();
    g.tune();
    g.play();
  }
}

// Final Summary
// Scenario Who Implements Methods?
// Abstract class implements some interface methods...Subclass must implement
// the rest
// Abstract class implements all interface methods... Subclass does not need to
// implement
// Abstract class implements none of the methods... Subclass must implement
// everything