import java.util.Scanner;
import java.util.Locale;

public class MathClass {
  public static void main(String[] args) {
//    System.out.println(Math.PI);
//    System.out.println(Math.E);
//
//    double result1 = Math.pow(2, 3);
//    System.out.println(result1);
//
//    double result2 = Math.abs(-5);
//    System.out.println(result2);
//
//    double result3 = Math.sqrt(9);
//    System.out.println(result3);
//
//    double result4 = Math.round(3.14);
//    System.out.println(result4);
//
//    double result5 = Math.ceil(3.14);
//    System.out.println(result5);
//
//    double result6 = Math.floor(3.99);
//    System.out.println(result6);
//
//    double result7 = Math.max(10, 20);
//    System.out.println(result7);
//
//    double result8 = Math.min(10, 20);
//    System.out.println(result8);

//    Scanner scanner = new Scanner(System.in);
//    scanner.useLocale(Locale.US);
//
//    double a;
//    double b;
//    double c;
//
//    System.out.print("Enter the length of side A: ");
//    a = scanner.nextDouble();
//
//    System.out.print("Enter the length of side B: ");
//    b = scanner.nextDouble();
//
//    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//    System.out.println("The hypotenuse (side c) is: " + c);
//
//    scanner.close();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the radius: ");
    double radius = scanner.nextDouble();

    double circumference = 2 * Math.PI * radius;
    double area = Math.PI * Math.pow(radius, 2);
    double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

//    System.out.println("The circumference is: " + circumference);
//    System.out.println("The area is: " + area);
//    System.out.println("The volume is: " + volume);

    System.out.printf("The circumference is: %.1f\n", circumference);
    System.out.printf("The area is: %.1f\n", area);
    System.out.printf("The volume is: %.1f\n", volume);

    scanner.close();
  }
}
