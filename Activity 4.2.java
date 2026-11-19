import javax.swing.JOptionPane;

public class WhileInputDialog {
    public static void main(String[] args) {
        int sum = 0;

        String input = JOptionPane.showInputDialog("Enter a number (0 to stop):");
        // Stop if the user pressed Cancel (null) or typed 0
        while (input != null && Integer.parseInt(input.trim()) != 0) {
            sum += Integer.parseInt(input.trim());
            input = JOptionPane.showInputDialog("Enter a number (0 to stop):");
        }

        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
