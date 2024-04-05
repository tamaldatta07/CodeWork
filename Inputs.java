import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your roll no: ");
        int rollNo = scn.nextInt();
        System.out.println("Your Roll No is: " + rollNo);
        scn.close();
    }
}
