package Live_Koding_Forelesning5_Loops;
import static javax.swing.JOptionPane.*;

public class main {
    public static void main(String[]args){
        String countFromInput = showInputDialog("Countdown from: ").toLowerCase();
        int countFrom = Integer.parseInt(countFromInput);

        for (int currentCount = countFrom; currentCount > 0; currentCount --){
            System.out.println(currentCount);
        }

        System.out.println("Launching Rocket!");

    }
}
