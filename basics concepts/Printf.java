public class Printf {
    public static void main(String[] args) {

        // ! printf() is a function that prints the formatted output to the console
        // ! %d -> decimal
        // ! %f -> float
        // ! %s -> string
        // ! %c -> character
        // ! %d -> decimal

        String name = "Magesh";
        int age = 18;
        boolean IsMarried = false;
        char charAt = 'A';
        float wealth = 1000000000.00f;

        System.out.printf("My Name is %s", name);
        System.out.printf("\nMy Age is %d", age);
        System.out.printf("\nMy Wealth is %f", wealth);
        System.out.printf("\nIs Married? %s", IsMarried ? "Yes" : "No");
        System.out.printf("\nMy Character is %c \n", charAt);

    }
}
