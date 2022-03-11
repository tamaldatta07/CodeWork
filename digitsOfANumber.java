
import java.util.Scanner;

public class digitsOfANumber {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int copyOfN = n;
    int tmp = 1;
    while (copyOfN > 9) {
      copyOfN = copyOfN / 10;
      tmp = tmp * 10;
    }
    while (tmp != 0) {
      int digit = n / tmp;
      System.out.println(digit);
      n = n % tmp;
      tmp = tmp / 10;
      scn.close();
    }
  }
}
