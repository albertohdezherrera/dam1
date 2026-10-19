import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    final int ADD = 1;
    final int SUBTRACT = 2;
    final int MULTIPLY = 3;
    final int DIVIDE = 4;
    final int REMAINDER = 5;
    final int ZERO = 0;

    int option;
    double number1;
    double number2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("===== CALCULATOR =====");
    System.out.println(ADD + ". Suma");
    System.out.println(SUBTRACT + ". Resta");
    System.out.println(MULTIPLY + ". Multiplicar");
    System.out.println(DIVIDE + ". Dividir");
    System.out.println(REMAINDER + ". Resto");
    System.out.print("Elige una opción: ");
    option = scanner.nextInt();

    if (option < ADD || option > REMAINDER) {
      System.out.println("Opción inválida");
    } else {
      System.out.print("Introduce el primer número: ");
      number1 = scanner.nextDouble();
      System.out.print("Introduce el segundo número: ");
      number2 = scanner.nextDouble();

      if (option == ADD) {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
      } else if (option == SUBTRACT) {
        if (number1 >= number2) {
          System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        } else {
          System.out.println(number2 + " - " + number1 + " = " + (number2 - number1));
        }
      } else if (option == MULTIPLY) {
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
      } else if (option == DIVIDE) {
        if (number2 == ZERO) {
          System.out.println("No se puede realizar la división: el divisor es cero");
        } else {
          System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        }
      } else {
        if (number2 == ZERO) {
          System.out.println("No se puede calcular el resto: el divisor es cero");
        } else {
          System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
        }
      }
    }
  }
}
