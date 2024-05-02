public class Shadowing {
    static int x = 90; // This will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(x); // 90

        int x = 40;
        System.out.println(x); // 40
        fun(); // 90

    }

    private static void fun() {
        System.out.println(x);
        // throw new UnsupportedOperationException("Unimplemented method 'fun'");
    }
}
