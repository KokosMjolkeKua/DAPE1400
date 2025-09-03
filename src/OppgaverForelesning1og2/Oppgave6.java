package OppgaverForelesning1og2;

import static javax.swing.JOptionPane.*;

public class Oppgave6 {
    public static void main(String[] args) {
        showMessageDialog(null, "Hei på deg lol!");
        int alder = Integer.parseInt(showInputDialog("Hva er alderen din?"));

        showMessageDialog(null, "Din alder er: " + alder);
    }
}
