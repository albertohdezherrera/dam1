import java.util.Scanner;

public class CompareTwoNumbers {
  public static void main(String[] args) {
    int number1;
    int number2;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    number1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    number2 = scanner.nextInt();

    if (number1 > number2) {
      System.out.println("Mayor: " + number1);
      System.out.println("Menor: " + number2);
    } else if (number1 < number2) {
      System.out.println("Mayor: " + number2);
      System.out.println("Menor: " + number1);
    } else {
      System.out.println("Los números son iguales");
    }
  }
}
