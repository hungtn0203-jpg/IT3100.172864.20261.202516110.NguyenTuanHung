import javax.swing.JOptionPane;

public class EquationSolver {

    public static void main(String[] args) {

        // 1. First-degree equation: ax + b = 0
        double a = Double.parseDouble(
                JOptionPane.showInputDialog("Linear equation: Enter a:"));
        double b = Double.parseDouble(
                JOptionPane.showInputDialog("Linear equation: Enter b:"));

        if (a == 0) {
            if (b == 0) {
                System.out.println("Linear equation: Infinite solutions");
            } else {
                System.out.println("Linear equation: No solution");
            }
        } else {
            double x = -b / a;
            System.out.println("Linear equation: x = " + x);
        }


        // 2. System of two first-degree equations
        double a11 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter a11:"));
        double a12 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter a12:"));
        double b1 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter b1:"));

        double a21 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter a21:"));
        double a22 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter a22:"));
        double b2 = Double.parseDouble(
                JOptionPane.showInputDialog("System: Enter b2:"));

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;

            System.out.println("System: x1 = " + x1);
            System.out.println("System: x2 = " + x2);
        } else if (D1 == 0 && D2 == 0) {
            System.out.println("System: Infinite solutions");
        } else {
            System.out.println("System: No solution");
        }


        // 3. Second-degree equation: ax^2 + bx + c = 0
        double qa = Double.parseDouble(
                JOptionPane.showInputDialog("Quadratic equation: Enter a:"));
        double qb = Double.parseDouble(
                JOptionPane.showInputDialog("Quadratic equation: Enter b:"));
        double qc = Double.parseDouble(
                JOptionPane.showInputDialog("Quadratic equation: Enter c:"));

        if (qa == 0) {
            if (qb == 0) {
                if (qc == 0) {
                    System.out.println("Quadratic equation: Infinite solutions");
                } else {
                    System.out.println("Quadratic equation: No solution");
                }
            } else {
                double x = -qc / qb;
                System.out.println("Quadratic equation becomes linear: x = " + x);
            }
        } else {
            double delta = qb * qb - 4 * qa * qc;

            if (delta > 0) {
                double x1 = (-qb + Math.sqrt(delta)) / (2 * qa);
                double x2 = (-qb - Math.sqrt(delta)) / (2 * qa);

                System.out.println("Quadratic equation: x1 = " + x1);
                System.out.println("Quadratic equation: x2 = " + x2);
            } else if (delta == 0) {
                double x = -qb / (2 * qa);
                System.out.println("Quadratic equation: Double root x = " + x);
            } else {
                System.out.println("Quadratic equation: No real roots");
            }
        }
    }
}
