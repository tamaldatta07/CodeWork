import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6);
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

/*
 * Variable argumentsis used to take a variable number of arguments.
 * A method that takes a variable number of arguments is a varargs method.
 */