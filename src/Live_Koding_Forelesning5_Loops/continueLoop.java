package Live_Koding_Forelesning5_Loops;
import static javax.swing.JOptionPane.*;
public class continueLoop {
    public static void main(String[]args){

        String continueLoop;

        do{
            System.out.println("Du er i en Loop!");
            continueLoop = showInputDialog("Fortsett?(q for å avslutte)").toLowerCase();
        }while(!continueLoop.equals("q"));

        System.out.println("Loopen er ferdig!!");
    }
}
