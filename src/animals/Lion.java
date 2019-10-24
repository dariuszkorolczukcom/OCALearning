package src.animals;

public class Lion extends Animal {
  private void roar() {
    System.out.println("The "+getAge()+"year old  lion says: ROAR!");
     // would not compile:
    //System.out.println("The "+age+"year old  lion says: ROAR!");
  }
}
