import javax.swing.*;

public class cattleWeight {
    public static void main(String[] args)
    {
        float weights[] = {234.2f,125.8f,456.7f,90.1f,498.9f,499.9f,234.5f,219.1f,341.2f,390.9f};
        int under250=0, over400=0;
        float lightest=999, totalWeight=0, average, percent400;
        String weight="";

        for(int i=0;i< weights.length;i++)
        {
            if(weights[i]<250)
            {
                under250++;
            }
            if(weights[i]>=400)
            {
                over400++;
            }
            if(weights[i]<lightest)
            {
                lightest = weights[i];
            }

            totalWeight += weights[i];
            weight += weights[i] + " ";

        }

        percent400 = ((float)over400/10) * 100;
        average = totalWeight/10;

       // System.out.print(over400);

        JOptionPane.showMessageDialog(null,"Weights: " + weight + "\nNumber under 250kg: " + under250 +
                "\nPercentage over 400 kg: " + (int)percent400 + "%" +
                "\nLightest animal: " + lightest + "\nAverage weight: " + average);
    }
}
