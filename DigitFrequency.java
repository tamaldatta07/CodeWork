import java.util.*;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //Input for the number
        int d = scn.nextInt();  //Input for the frequent digit
        int f = getDigitFrequency(n, d); 
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0; //For counting the remainder

        while (n != 0) {
            int rem = n % 10; // Get the remainder
            if (rem == d) {
                count++; //Increase the count
            }
            n = n / 10; // Small the number
        }
        return count; //Return the result

    }
}
// 994543234 //Number
// 4 //Frequent Digit
// 3 //Presnet 3 times in Number