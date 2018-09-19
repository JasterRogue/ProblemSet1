import javax.swing.*;

public class MathMethods {
    public static void main(String[] args)
    {
        double a=1, b=6, c=-16, positive, negative;

        positive = (-1 * b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/2 * a;

        negative = (-1 * b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/2 * a;

        JOptionPane.showMessageDialog(null,"X = " + positive + " or X = " + negative);

    }
}
