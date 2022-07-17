import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortDogs {


  public static List<Dog> dogs = new ArrayList<Dog>(
      List.of(new Dog("Bella", "Labrador", 2), new Dog("Axel", "Miniature Pincher", 14),
          new Dog("Sophie", "Chihuahua", 10), new Dog("Ruby", "Dachsund", 8)));

  public static List<Dog> dogs2 = new ArrayList<Dog>(
      List.of(new Dog("Bella", "Labrador", 2), new Dog("Axel", "Miniature Pincher", 14),
          new Dog("Sophie", "Chihuahua", 10), new Dog("Ruby", "Dachsund", 8)));

  public static void main(String[] arghs) {
    sortLambda(dogs);

    System.out.println(dogs);  // to print after sorting; Move it?
    sortMethodReference(dogs2);
    System.out.println(dogs2);
  }
  public static void sortLambda(List<Dog> doggs) {
    Comparator<Dog> comp = null;
    comp = (d1, d2) -> Dog.compareDogs(d1, d2); // Lambda expression
    doggs.sort(comp);
  }
  public static void sortMethodReference(List<Dog> doggs) {
    Comparator<Dog> comp = null;
    comp = Dog::compareDogs;

    doggs.sort(comp);
  }
}