package OppgaverAritmetikk;
import static javax.swing.JOptionPane.*;
public class oppg10 {
    public static void main(String[]args){
        showMessageDialog(null, "Velkommen");
        int alder = Integer.parseInt(showInputDialog("Hva er din alder?"));

        if (18 > alder) {
            showMessageDialog(null, "Du er ikke gammel nok til å ta førerkortet");
        } else {
            showMessageDialog(null, "Du er gammel nok til å ta førerkortet!");
        }
    }
}
