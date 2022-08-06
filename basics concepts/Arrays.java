import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        // ! Array= used to store multiple values of same type

        String[] food = {
                "Grapes", "Apples", "Oranges", "Bananas", "Pears"
        };

        for (String string : food) {
            System.out.println("My Favorite Food: " + string);
        }

        // ! lets get the input form user and store in array

        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter your name: ");
            names[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("Names are !: ");
        for (String string : names) {
            System.out.println(string);
        }
    }
}
