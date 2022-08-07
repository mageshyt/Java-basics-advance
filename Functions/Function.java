public class Function {
    public static void main(String[] args) {
        // function is a block of code that performs a specific task
        sayHello("Magesh & Lara");
        sayHello("Hemanth & Ranjith");
        sayHello("Sathivika");
        sayHello("Nabe &devi");
        sayHello("Amen & sindhu");

        int a = 10;
        int b = 20;

        // ! the variable pass to a function is called Arguments
        System.out.println("the sum of the numbers is " + add(a, b));

    }

    static void sayHello(String name) {
        // ! Function parameters are the names listed in the function's definition
        System.out.println("Hello " + name + " !");
    }

    static int add(int a, int b) {
        return a + b;
    }

}
