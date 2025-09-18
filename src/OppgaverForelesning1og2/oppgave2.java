package OppgaverForelesning1og2;

import static javax.swing.JOptionPane.*;

public class  oppgave2 {
    public static void main(String[] args) {
        showMessageDialog(null, "Hei, velkommen til mitt program!");
        String forNavn = showInputDialog("Skriv inn fornavnet dett:");
        String etterNavn = showInputDialog("Skriv inn etternavnet ditt:");
        String alder = showInputDialog("Have er din alder?");
        showMessageDialog(null, "Alderen til " + forNavn + " " + etterNavn + "er: " + alder);

    }

}
