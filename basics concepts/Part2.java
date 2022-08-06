
import java.awt.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Part2 {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int age = 45;
        String name = "Magesh";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        Point p1 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.println("Point 1: " + p1.x + p1.y);

        // ! swap two variable
        int a = 10;
        int b = 20;

        System.out.println("Before swap: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: " + a + " " + b);

        // ! user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter your age: ");
        int age1 = sc.nextInt();
        System.out.println("Name 😒: " + name1);

        System.out.println("Age 🤕: " + age1);
        sc.close();
        // ! if else
        if (age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        // ! Expression
        // expression = operands & operators
        // operands = values
        // operators = + - * / %
        int year = 2022;
        year++;
        System.out.println("Year: " + year);

    }
}