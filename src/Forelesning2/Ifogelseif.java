package Forelesning2;

public class Ifogelseif {

    int age = 34;
    int votingAge = 18;
    boolean canVote = age >= votingAge; //sjekker om age er større eller lik votingAge
    System.out.println(canVote); //resulatet vil være true

    //sammenligning av to strring variabler
    String firstNamePerson1 = "Trym";
    String firstNamePerson2 = "Per";

    boolean samePerson = firstNamePerson1.equals(firstNamePerson2); //sjekker om de er like
    System.out.println(samePerson); //resulatet vil være false

    //valg
    //int age = 34;
    // boolean oldEnoughToVote = age>=18;
    //int norwegianCitizen = true;
    //boolean canVote = oldEnoughToVote && norwegianCitizen;

    //example 1
    //if(canVote == true){
    System.out.println("Du kan stemme!");

    if(!canVote){
        System.out.println("Du kan ikke stemme!");
    }

     //example 2
    if(canVote == true)    {
        System.out.println("Du kan stemme!");
    }else if(canVote == false)
    {
        System.out.println("Du kan ikke stemme!");
    }

    //example 3
    if(age<18)
    {
        System.out.println("Du kan ikke handle på polet!");
    }
    else if(age<20)
    {
        System.out.println("du kan handle på polet under 20%");
    }
    else
    {
            System.out.println("du kan handle hva du vil!");
    }


    }
}
