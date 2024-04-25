import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String fruit = scn.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("Healthy Fruits");
                break;

            case "Orange":
                System.out.println("Round Fruit");
                break;

            default:
                System.out.println("Please enter a valid fruit");
        }
        scn.close();
    }
}
