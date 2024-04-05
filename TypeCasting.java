import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // type casting
        int num = (int) (56.63f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a); // 257 % 256 = 1
        System.out.println(b);

        scn.close();

    }
}
