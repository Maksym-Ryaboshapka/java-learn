public class StringMethods {
  public static void main(String[] args) {
    String name = "Maksym Ryaboshapka";

//    int length = name.length();
//    char letter = name.charAt(0);
//    int index = name.indexOf('R');
//    int lastIndex = name.lastIndexOf('a');
//
//    System.out.println(length);
//    System.out.println(letter);
//    System.out.println(index);
//    System.out.println(lastIndex);
//
//    String upperName = name.toUpperCase();
//    String lowerName = name.toLowerCase();
//
//    System.out.println(upperName);
//    System.out.println(lowerName);
//
//    String spaces = "   Hello!  ";
//    System.out.println(spaces);
//
//    spaces = spaces.trim();
//    System.out.println(spaces);
//
//    String replacedName = name.replace("M", "ABC");
//    System.out.println(replacedName);
//
//    String emptyString = "";
//
//    System.out.println(name.isEmpty());
//    System.out.println(emptyString.isEmpty());
//
//    if (name.isEmpty()) {
//      System.out.println("Your name is empty");
//    } else {
//      System.out.printf("Hello %s!%n", name);
//    }

//    if (name.contains(" ")) {
//      System.out.println("Your name contains a space");
//    } else {
//      System.out.println("Your name doesn't contains a space");
//    }

    if (name.equalsIgnoreCase("password")) {
      System.out.println("Your name can't be password");
    } else {
      System.out.printf("Hello %s!%n", name);
    }
  }
}
