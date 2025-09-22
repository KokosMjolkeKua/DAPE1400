package Live_Koding_Forelesning5_Loops;
import static javax.swing.JOptionPane.*;
public class main {
    public static void main(String[]args){
        String countFromInput = showInputDialog("Countdown from: ").toLowerCase();
        int countFrom = Integer.parseInt(countFromInput);
        int currentCount = countFrom;


        while(currentCount > 0)
        {
            System.out.println(currentCount);
            currentCount --;
        }
        System.out.println("Launching Rocket!");

    }
}
