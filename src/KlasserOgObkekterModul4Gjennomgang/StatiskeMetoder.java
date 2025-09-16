package KlasserOgObkekterModul4Gjennomgang;

import java.text.DecimalFormat;

public class StatiskeMetoder {

    private static double beregnAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }

    public static void main(String[]args){
        double radius = 23.23;
        double areal = beregnAreal(radius);

        DecimalFormat df2 = new DecimalFormat(".##");
        System.out.println("Arealet til en sirkel med radius " + radius + " er " + df2.format(areal));
    }
}
