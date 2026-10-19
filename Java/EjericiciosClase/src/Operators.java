public class Operators {
  /*
  * +, -, *, /, % 
  * ++ edad++
  * +=  -=  *=  /=  %=
  * <   >   <=  >=  ==  !=
  * &&      ||      !
  */
  public static void main(String[] args) {
    int a = 4;
    int b = 2;
    
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));

    if (a > b) {
      System.out.println("A es mayor que B");
    } else if (a < b) {
      System.out.println("A es menor que B");
    } else {
      System.out.println("A es igual a B");
    }
  }
}
