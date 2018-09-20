import javax.swing.*;

public class DamnArrays {
    public static void main(String[] args)
    {
        int numbers[] = new int[10];

        for(int i=0;i<numbers.length;i++)
        {
            String numberString = JOptionPane.showInputDialog("Enter a number");
            numbers[i] = Integer.parseInt(numberString);
        }

        JOptionPane.showMessageDialog(null,"The first number is : " + numbers[0] +
                "\nThe fifth number is:  " + numbers[4]);


    }
}
