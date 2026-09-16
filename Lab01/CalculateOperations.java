import javax.swing.JOptionPane;

public class CalculateOperations {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog("Enter the first number:");
        String strNum2 = JOptionPane.showInputDialog("Enter the second number:");

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}