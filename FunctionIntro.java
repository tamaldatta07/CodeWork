import java.util.*;

public class FunctionIntro {
    public static void Add1(int n1, int n2){
        int ans = n1 + n2;
        System.out.println(ans); //This line will print the result
    }
    public static int Add2(int n1, int n2){
        int ans = n1 + n2;
        return ans;  // This line will return the result
        //But The result will not be printed because there is no print Statement.
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        Add2(num1, num2);
        //Add1(num1, num2);

        scn.close();
    }
}
