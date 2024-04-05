import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }

        scn.close();
    }
}
