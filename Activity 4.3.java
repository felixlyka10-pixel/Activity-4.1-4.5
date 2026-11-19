import javax.swing.JOptionPane;

public class DoWhileDemo {
    public static void main(String[] args) {
        int sum = 0, data;

        do {
            String input = JOptionPane.showInputDialog("Enter a number (0 to stop):");
            if (input == null) {   // Cancel pressed
                break;
            }
            data = Integer.parseInt(input.trim());
            sum += data;
        } while (data != 0);       

        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
