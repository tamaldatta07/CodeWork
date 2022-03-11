import java.util.Scanner;

public class digitOfaNumber1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int temp, digit = 0;
    int count = 0;
    int num = scn.nextInt();
    temp = num;
    while (num > 0) { // This loop break the number into digits
      num = num / 10;
      count++;
    }
    while (temp > 0) {
      digit = temp % 10;
      System.out.println(digit);
      temp = temp / 10;
      // count--;
      scn.close();
    }

  }
}
