import java.util.Scanner;

public class SwitchStatement1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int day = scn.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monady");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter Day Between 1 to 7!!");
        }
        scn.close();
    }
}
