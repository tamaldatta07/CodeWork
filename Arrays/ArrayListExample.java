import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        /*
         * list.add(10);
         * list.add(17);
         * list.add(15);
         * list.add(16);
         * list.add(107);
         * list.add(105);
         * list.add(101);
         * System.out.println(list);
         * list.set(0, 52); // set the 0th index to 52 from 10
         * System.out.println(list);
         */

        // for taking input
        for (int i = 0; i < 5; i++) {
            list.add(scn.nextInt());
        }

        // for printing output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // we have to pass the index.
        }

        // simple print
        // System.out.println(list);
    }
}
