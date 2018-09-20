import javax.swing.*;
import java.awt.Font;

public class Cubed {
    /*public static void main(String[] args)
    {
       cubeCalculator();
    }*/

    public static void cubeCalculator()
    {
        double cubedNumber, number;

        JTextArea textArea = new JTextArea(10,30);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.append("Number          Cube" + "\n------          ----\n");

        for(number=0;number<16;number++)
        {
            cubedNumber = Math.pow(number,3);
            textArea.append(number + "               " + cubedNumber + "\n");
        }

        JOptionPane.showMessageDialog(null,textArea);
    }
}
