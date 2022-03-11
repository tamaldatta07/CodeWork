import java.util.Scanner;

public class inverseOfANumber {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    int sum = 0;
    int pos = 1;
    while (num != 0) {
      int digit = num % 10;
      int val = pos * (int) Math.pow(10, digit - 1);
      sum += val;
      pos++;
      num = num / 10;
    }
    System.out.println(sum);
    scn.close();
  }
}
