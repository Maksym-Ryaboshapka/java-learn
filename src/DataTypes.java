public class DataTypes {
  public static void main(String[] args) {
    int age = 15;
    int year = 2025;
    int quantity = 1;

    double price = 19.99;
    double gpa = 3.5;
    double temperature = -12.5;

    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    boolean isStudent = true;
    boolean forSale = false;
    boolean isOnline = true;

    String name = "Maksym";
    String food = "coffee";
    String email = "example@gmail.com";
    String color = "black";

    System.out.println("Your choice is a " + color + " " + year + " " + food);
    System.out.println("The price is: " + currency + price);

    if (forSale) {
      System.out.println("There is a " + food + " for sale");
    } else {
      System.out.println("The " + food + " is not for sale");
    }
  }
}
