
// import java.util.*;
import java.util.Scanner;

public class patterntable {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();

    for (int i = 1; i <= 10; i++) {

      int ans = x * i;
      System.out.println(x + " * " + i + " = " + ans);
      scn.close();
    }
  }
}
