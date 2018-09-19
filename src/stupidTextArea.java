import javax.swing.*;
import java.awt.Font;

public class stupidTextArea {
    public static void main(String[] args)
    {


        JTextArea textArea = new JTextArea();
        Font textAreafont = new Font("monospaced",Font.PLAIN,12);
        textArea.setSize(30,30);
        textArea.setFont(textAreafont);
        textArea.setText("Yards          Inches" + "\n-------        -------" + "\n");

        String yardString;
        float yard, inch;

        for(int i=0;i<10;i++)
        {
           yardString = JOptionPane.showInputDialog("Enter yard");
           yard = Float.parseFloat(yardString);
           inch = yard * 36;
           textArea.append(yard + "      " + inch + "\n");
        }

        JOptionPane.showMessageDialog(null,textArea);

    }
}
