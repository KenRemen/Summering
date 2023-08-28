import javax.swing.JOptionPane;
public class Summering
{
    public static void main( String args[] )
        {
            String førsteSifferstreng;
            String andreSifferstreng;

            int førstetall;
            int andretall;
            int sum;

            førsteSifferstreng = JOptionPane.showInputDialog("Skriv inn et helt tall"
            );
            andreSifferstreng = JOptionPane.showInputDialog("Skriv inn enda et helt tall");

            førstetall = Integer.parseInt( førsteSifferstreng );
            andretall = Integer.parseInt( andreSifferstreng );

            sum = førstetall + andretall;

            JOptionPane.showMessageDialog( null,"Summen er " + sum,
                    "Resultater", JOptionPane.PLAIN_MESSAGE );
        }
}