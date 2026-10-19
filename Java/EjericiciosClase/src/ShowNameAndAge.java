import java.util.Scanner;

public class ShowNameAndAge {
  public static void main(String[] args) {
      String name;
      int age;
      Scanner scanner = new Scanner(System.in);

      System.out.print("Introduce tu nombre: ");
      name = scanner.nextLine();
      System.out.print("Introduce tu edad: ");
      age = scanner.nextInt();

      System.out.println("El usuario se llama " + name + " y tiene " + age + " años");
  }
}
