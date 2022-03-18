import java.util.Scanner;

public class printEvenOdd {
    public static void main(String[] args) {
        // for(int i = 1; i<=100; i++){
        // if(i % 2 == 0){
        // System.out.println("Even for 1");
        // }else{
        // System.out.println("Odd for 0");
        // }
        // }
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even for 1");
        } else {
            System.out.println("Odd for 0");
        }
        scn.close();
    }
}
// to accept a number and check the number is even or not. Prints 1 if the
// number is even or 0 if the number is odd