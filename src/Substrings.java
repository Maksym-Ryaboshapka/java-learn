import java.util.Arrays;
import java.util.Scanner;

public class Substrings {
  public static void main(String[] args) {

//    String email = "example@gmail.com";
//    String username = email.substring(0, 7);
//    String username = email.substring(0, email.indexOf("@"));
//    String domain = email.substring(7, 17);
//    String domain = email.substring(email.indexOf("@") + 1);
//
//    System.out.println(username);
//    System.out.println(domain);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your email: ");
    String email = scanner.nextLine();

    if (email.contains("@")) {
      String username = email.substring(0, email.indexOf("@"));
      String domain = email.substring(email.indexOf("@") + 1);

      System.out.println(username);
      System.out.println(domain);
    } else {
      System.out.println("Email must contains @");
    }

    scanner.close();
  }
}
