package OppgaverTilDatatyperogBrukerInput;
import static javax.swing.JOptionPane.*;
public class  Oppgave3 {
    public static void main(String[] args){
        showMessageDialog(null, "Halla, hvor mange dager har du i live tro?");
        double alder;
        alder = Double.parseDouble(showInputDialog("Hva er din alder?"));
        double dager = alder * 365;
        showMessageDialog(null, "Du har vært i live i " + dager + " dager.");
    }

}
