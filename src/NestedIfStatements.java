public class NestedIfStatements {
  public static void main(String[] args) {
    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

    if (isStudent) {
      if (isSenior) {
        System.out.println("You have a senor discount of 20%%%n");
        System.out.printf("You have a student discount of 10%%%n");

        price *= 0.7;
      } else {
        System.out.printf("You have a student discount of 10%%%n");

        price *= 0.9;
      }
    } else {
      if (isSenior) {
        System.out.println("You have a senor discount of 20%%%n");

        price *= 0.8;
      }
    }

    System.out.printf("The price of a ticket is: $%.2f%n", price);
  }
}