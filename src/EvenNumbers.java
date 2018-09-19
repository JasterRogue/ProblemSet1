import javax.swing.*;

public class EvenNumbers {
    public static void main(String[] args)
    {
         boolean isItEven;
         int number;
         String numberString;

         numberString = JOptionPane.showInputDialog("Enter a number");
         number = Integer.parseInt(numberString);

         while(number!=-1)
         {
             isItEven = isEven(number);

             if(isItEven==true)
             {
                 JOptionPane.showMessageDialog(null,number + " is even");
             }

             else
             {
                 JOptionPane.showMessageDialog(null,number + " is odd");
             }

             numberString = JOptionPane.showInputDialog("Enter a number");
             number = Integer.parseInt(numberString);
         }
    }

    public static boolean isEven(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
