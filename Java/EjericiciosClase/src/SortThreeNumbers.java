import java.util.Scanner;

public class SortThreeNumbers {
  public static void main(String[] args) {
    int number1;
    int number2;
    int number3;
    int greatest;
    int smallest;
    int middle;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el primer número: ");
    number1 = scanner.nextInt();
    System.out.print("Introduce el segundo número: ");
    number2 = scanner.nextInt();
    System.out.print("Introduce el tercer número: ");
    number3 = scanner.nextInt();

    greatest = number1;
    if (number2 > greatest) {
      greatest = number2;
    }
    if (number3 > greatest) {
      greatest = number3;
    }

    smallest = number1;
    if (number2 < smallest) {
      smallest = number2;
    }
    if (number3 < smallest) {
      smallest = number3;
    }

    middle = number1 + number2 + number3 - greatest - smallest;

    System.out.println("Mayor: " + greatest);
    System.out.println("Menor: " + smallest);
    System.out.println("Orden descendente: " + greatest + ", " + middle + ", " + smallest);
  }
}
