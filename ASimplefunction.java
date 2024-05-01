public class ASimplefunction {
    public static void main(String[] args) {
        Display();

        System.out.println(myGreet("Tamal"));
    }

    static void Display() {
        System.out.println("Hello World");
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
/*
 * It is a simple function that will display 'Hello World' by using a function
 */