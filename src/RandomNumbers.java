import java.util.Random;

public class RandomNumbers {
  public static void main(String[] args) {
    Random random = new Random();

    int number = random.nextInt(1, 7); // exclusive 7

    System.out.println(number);

    int number1 = random.nextInt(1, 101);
    int number2 = random.nextInt(1, 101);
    int number3 = random.nextInt(1, 101);

    System.out.println(number1);
    System.out.println(number2);
    System.out.println(number3);

    double doubleNumber = random.nextDouble(); // from 0 to 1
    System.out.println(doubleNumber);

    boolean isHeads = random.nextBoolean();

    if (isHeads) {
      System.out.println("HEADS");
    } else {
      System.out.println("TAILS");
    }
  }
}
