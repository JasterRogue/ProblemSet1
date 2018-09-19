import javax.swing.*;

public class StringMethods {
    public static void main(String[] args)
    {
        String name, upperName, surname;
        int length, lastSpace;
        char initial;

        name = JOptionPane.showInputDialog("Enter full name");
        length = name.length();
        initial = name.charAt(0);
        upperName = name.toUpperCase();
        lastSpace = name.lastIndexOf(" ");
        surname = name.substring(lastSpace, length);

        JOptionPane.showMessageDialog(null,"Number of characters; " + length +
                "\nInitial of first name: " + initial + "\nAll caps: " + upperName +
                "\nSurname: " + surname);


    }
}
