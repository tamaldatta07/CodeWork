import java.util.Scanner;

public class digitcount {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int count = 0;
    while (num != 0) {
      num = num / 10;
      ++count;

      scn.close();
    }
    System.out.println(count);
  }
}
