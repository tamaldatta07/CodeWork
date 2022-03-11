import java.util.Scanner;

public class fibonaccoSeries {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int first = 0;
    int second = 1;
    int i = 1;
    while (i <= n) {
      int third = first + second;
      first = second;
      second = third;
      i++;
      scn.close();
      System.out.println(third);
    }

  }
}
