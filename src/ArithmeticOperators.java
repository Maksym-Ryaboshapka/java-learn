public class ArithmeticOperators {
  public static void main(String[] args) {
    int x = 10;
    int y = 2;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);
    System.out.println(x % y);

    int x1 = 10;
    int y1 = 3;

//    x1 += y1;
//    x1 -= y1;
//    x1 *= y1;
//    x1 /= y1;
    x1 %= y1;

    System.out.println(x1);

    int x2 = 1;

    x2++;

    System.out.println(x2);

    x2--;
    System.out.println(x2);
  }
}
