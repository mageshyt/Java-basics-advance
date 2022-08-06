import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
      
        double x, y, z;
        // ! program to find hypotenuse of a right angled triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first side: ");
        x = sc.nextDouble();
        System.out.println("Enter the length of second side: ");
        y = sc.nextDouble();
        z = Math.sqrt(x * x + y * y); // c=sqrt(a^2+b^2)
        System.out.println("Hypotenuse: " + z);
        sc.close();

        // ! random
        // ! program to generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100 + 1);

        System.out.println("Random number: " + randomNumber);
        int N = 2;
        for (int i = 1; i <= 10; i++) {
            int mul = i * N;
            System.out.println(i + " * " + N + " = " + mul);
        }
    }
}