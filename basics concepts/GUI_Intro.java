import java.util.Random;

import javax.swing.JOptionPane;

public class GUI_Intro {
    public static void main(String[] args) {

        // GUI
        String name2 = JOptionPane.showInputDialog("Enter your name: ");
        // ! get age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));

        // ! get height
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        // ! show the message with icon

        // ! show the message
        JOptionPane.showMessageDialog(null,
                "Hello " + name2 + "! You are " + age + " years old and " + height + " meters tall.");
    }

}
