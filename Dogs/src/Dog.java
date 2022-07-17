public class Dog {
  String name; // field
  String breed;
  int age;

  Dog(String name, String breed, int age) { // Constructor assigns field values
    this.name = name;
    this.breed = breed;
    this.age = age;
  }
  public String toString() { // toString method returns string if call myDog.toString
    return name + " " + breed + " " + age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public String getName(String name) {
    return name;
  }
  public String getBreed(String breed) {
    return breed;
  }
  public static int compareDogs(Dog d1, Dog d2) {
    return d1.name.compareTo(d2.name);
  }
}