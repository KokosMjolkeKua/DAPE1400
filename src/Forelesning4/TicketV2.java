package Forelesning4;

public class TicketV2 {
    private String name;
    private String personNr;
    private String destination;

    public TicketV2(String name, String personNr, String destination) {
        this.name = name;
        this.personNr = personNr;
        this.destination = destination;
        //snakker this. om den internet atributten i denne koden.
    }


    public void printTicketInfo(){
        System.out.println("\nBillet Informasjon");
        System.out.println("Name: " + this.name);
        System.out.println("Person Nr: " + this.personNr);
        System.out.println("Destination: " + this.destination);
        //husk å skrive System.out.println (fordi ln avgjør om det er neste linje eller ikke)

    }

    public void setPassengerInfo(String name, String personNr){
        this.name = name;
        this.personNr = personNr;
    }

    public String getDestination(){
        return this.destination;
    }
}
