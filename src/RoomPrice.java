import javax.swing.*;
import java.awt.Font;

public class RoomPrice {
    public static void main(String[] args)
    {

        String name;
        String lengthString, widthString, costPerSquareMetreString;
        float length, width, area, costPerSquareMetre, totalCost;

        JTextArea textArea = new JTextArea(12,20);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12 );
        textArea.setFont(textAreaFont);

        name = JOptionPane.showInputDialog("Enter name");
        lengthString = JOptionPane.showInputDialog("Enter length");
        widthString = JOptionPane.showInputDialog("Enter breadth");
        costPerSquareMetreString = JOptionPane.showInputDialog("Enter cost per sqaure metre");

        length = Float.parseFloat(lengthString);
        width = Float.parseFloat(widthString);
        costPerSquareMetre = Float.parseFloat(costPerSquareMetreString);

        area = length * width;
        totalCost = area * costPerSquareMetre;
        textArea.append("Quotation for " + name + "\n");
        textArea.append(String.format("%-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f m.\n %-20s%.2f euro\n %-20s%.2f euro\n",
                "Length of room:",length,"Breadth of room: ",width,"Total area of the room:",area,
                "Cost per square metre of carpet:",costPerSquareMetre,"Total cost of carpet:",totalCost));

        JOptionPane.showMessageDialog(null,textArea);



    }
}
