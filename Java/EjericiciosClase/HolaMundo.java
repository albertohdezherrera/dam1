public class HolaMundo {
  public static void main(String[] args) {
    System.out.println("Vamos a sumar dos numeros");
    int result = addNumbers(10, 5);
    System.out.print("El resultado es: ");
    System.out.println(result);
  }

  // No explicado por ahora
  public static int addNumbers(int a, int b) {
    return a + b;
  }
}
