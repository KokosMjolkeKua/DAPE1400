package packagemakingtest;

import static javax.swing.JOptionPane.*;

public class Heipådeg {
     public static void main(String[] args) {
            String navn;
            navn = showInputDialog("Hei, hva heter du?");

            String Utskrift;
            Utskrift = showInputDialog("Hei på deg " + navn + "!");


            showMessageDialog(null, "Hyggelig å møte deg!");

            //String svar;
            // svar = showInputDialog("Hyggelig å møte deg!");

            System.out.println(Utskrift);
            showMessageDialog(null, "Ha en fin dag " + navn + ", hadet bra!");
        }
    }

}
