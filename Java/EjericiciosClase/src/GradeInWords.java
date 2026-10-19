import java.util.Scanner;

public class GradeInWords {
  public static void main(String[] args) {
    final int MIN_GRADE = 0;
    final int MAX_FAIL = 4;
    final int PASS = 5;
    final int GOOD = 6;
    final int MAX_VERY_GOOD = 8;
    final int EXCELLENT = 9;
    final int MAX_GRADE = 10;

    int grade;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce una calificación (0-10): ");
    grade = scanner.nextInt();

    if (grade < MIN_GRADE || grade > MAX_GRADE) {
      System.out.println("Calificación inválida: debe estar entre " + MIN_GRADE + " y " + MAX_GRADE);
    } else if (grade <= MAX_FAIL) {
      System.out.println("INSUFICIENTE");
    } else if (grade == PASS) {
      System.out.println("SUFICIENTE");
    } else if (grade == GOOD) {
      System.out.println("BIEN");
    } else if (grade <= MAX_VERY_GOOD) {
      System.out.println("NOTABLE");
    } else if (grade == EXCELLENT) {
      System.out.println("SOBRESALIENTE");
    } else {
      System.out.println("MATRICULA DE HONOR");
    }
  }
}
