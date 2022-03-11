import java.util.Scanner;

public class oddEvenProgram {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int rem = num % 2;
    System.out.println(rem);
    scn.close();
  }
}
