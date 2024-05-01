public class SwapTwoNumber {
    public static void main(String[] args) {

        SwapNum(10, 20);

    }

    public static void SwapNum(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        // return(int a, int b);
        System.out.println("Value of a is " + a + " Value of b is " + b);
    }

}
