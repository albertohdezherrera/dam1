import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String[] args) {
    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println(number + " es par");
    } else {
      System.out.println(number + " es impar");
    }
  }
}
