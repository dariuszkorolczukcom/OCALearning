package src.animals;

public class Animal {
  private int age;
  private String name;

  public Animal(int age) {
    this(age, "Anonymous");
  }
  public Animal(int age, String name) {
    this.age = age;
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
}
