public class OverLoading {
    public static void main(String[] args) {
        // ! function overloading -> function or method that share the same name but
        // have different parameters
        // method name + parameter type = method signature

        System.out.println(" OverLoading - sum of two numbers " + sum(10, 20));
        System.out.println(" OverLoading - sum of three numbers " + sum(10, 20, 30));
        System.out.println(" OverLoading - sum of four numbers " + sum(10, 20, 30, 40));

    }

    static int sum(int a, int b) {
        return a + b;
    }

    // ! sum function with 3 parameters
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // sum function with 4 parameters
    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
