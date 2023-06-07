import java.util.ArrayList;
public class Main
{
    public static void main(String[] args)
    {
      Friend Gio = new Friend (12,"Giovanni",  "(951)-123-3323", "Male", "02/22/94", true);
      Adult Marx = new Adult (21, "Marx", "(951)-923-2212", "Male", "12/13/92", true, false, 5);
      Online Dale = new Online(15, "Dale", "(281)-292-2212", "Male", "4/1/06", true, true);
      Colleague Jasmine = new Colleague(23, "Jasmine", "(910)-293-2920", "Female", "6/12/96", true, "Wednesday", 9);
      //Polymorphic people
        Friend Giuls = new Friend (16, "Giuliana", "(951)-923-6435", "Female", "10/27/06", true);
        Friend Jii = new Adult(12, "Dale", "(819)-192-2920", "Male", "01/21/24", true, false, 0);
        Friend Liam = new Online(16, "William", "(951)-202-2433", "Male", "5/25/06", true, true);
        Friend Sadie = new Colleague (26, "(920)-102-2213", "Female", "Female", "9/12/97", true, "Friday", 2);

        Friend[] myFriend = {Gio, Marx, Dale, Jasmine, Jii, Liam, Sadie, Giuls};//this is an example of polymorphism

        for(int i = 0; i < myFriend.length; i++)
        {
            System.out.println(myFriend[i].toString() + "\n");
        }


        makeContact list = new makeContact("List of phone numbers: ", 5);
        list.addContact(Gio);
        list.addContact(Marx);
        list.addContact(Dale);

        System.out.println(list.toString());
        System.out.println(Gio.length());
        System.out.println(Jasmine.availability());
        System.out.println(Marx.MentalHealth());


        //if a friend type refers to a
        //friend object then Friend's
        //advice will called.
        Giuls.advice();
        Jii.advice();
        Liam.advice();
        Sadie.advice();



       Gio.addLikes("Sleeping");
       Gio.addLikes("Eating");

       Jii.addLikes("Ramen");
       Jii.addLikes("Sweets");




       Gio.addDislikes("Studying");
       Gio.addDislikes("Bees");
       Jii.addDislikes("Snakes");
       Jii.addDislikes("Running");

       //System.out.println("\nJii likes the following: " + Jii.getlikes());
        System.out.println("\nGio's likes the following: " + Gio.getlikes());
        System.out.println("Gios dislikes are the following: " + Gio.getDislikes());
       //System.out.println("Jii dislikes are the following: " + Jii.getDislikes());


        








    }


}