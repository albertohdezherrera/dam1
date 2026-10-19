import java.util.Scanner;

public class AverageGrade {
  public static void main(String[] args) {
    String name;
    double grade1;
    double grade2;
    double grade3;
    double average;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Tu nombre: ");
    name = scanner.nextLine();
    System.out.print("Nota 1: ");
    grade1 = scanner.nextDouble();
    System.out.print("Nota 2: ");
    grade2 = scanner.nextDouble();
    System.out.print("Nota 3: ");
    grade3 = scanner.nextDouble();

    average = (grade1 + grade2 + grade3) / 3;

    System.out.println("Bienvenido " + name + ": tu nota es " + average);
  }
}
