import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDog {
  public static List<Dog> dogs2 = new ArrayList<Dog>(
      List.of(new Dog("Bella", "Labrador", 2), new Dog("Axel", "Miniature Pincher", 14),
          new Dog("Sophie", "Chihuahua", 10), new Dog("Ruby", "Dachsund", 8)));

  public static void main(String[] args) {
    String bones = dogs2.stream().map(Dog::toString).sorted().collect(Collectors.joining(", "));
    System.out.println(bones);
    // turned dog2 into stream, added map method and passed the string method into it to turn it into 
    //string use the toString method  
  }
}
