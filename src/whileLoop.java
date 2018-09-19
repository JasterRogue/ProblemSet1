import javax.swing.*;

public class whileLoop {
    public static void main(String[] args)
    {
        float exchangeRate, poundInput, euro=0;

        exchangeRate = getExchangeRate();
        //exchange rate 1.12 euro = 1 pound

        poundInput = getPoundInput();

        while(poundInput>0)
        {

            euro = poundInput*1.12f;

            displayResult(euro, poundInput, exchangeRate);

            poundInput = getPoundInput();

        }


    }

    public static float getExchangeRate()
    {
        float exchangeRate;
        String poundInputString = JOptionPane.showInputDialog("Enter the exchange rate");
        exchangeRate = Float.parseFloat(poundInputString);
        return exchangeRate;
    }

    public static float getPoundInput()
    {
        float poundInput;
        String poundInputString = JOptionPane.showInputDialog("Enter the number of pounds");
        poundInput = Float.parseFloat(poundInputString);
        return poundInput;
    }

    public static void displayResult(float euro, float pounds, float exchangeRate)
    {
        JOptionPane.showMessageDialog(null,pounds + " pounds is " +
                String.format("%.2f",euro) + " euros","Exchange Rate: " + exchangeRate , JOptionPane.INFORMATION_MESSAGE);
    }
}
