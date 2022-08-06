import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); // Output: 0 to 9
        while (true) {
            String input = JOptionPane.showInputDialog("Guess a number between 0 and 9");
            int inputNumber = Integer.parseInt(input);
            if (inputNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "You guessed the number!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "You guessed wrong!");
            }
        }
    }
}
