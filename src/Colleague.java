public class Colleague extends Friend
{
    //Colleague's instance variables
    private String day;

    private int time;

    //Constructor

    public Colleague(int age, String name, String phoneNumber, String gender, String birthday, boolean thisYear, String day, int time)
    {
        super(age, name, phoneNumber, gender, birthday, thisYear);
        this.day = day;
        this.time = time;
    }// End Constructor

    public String availability()//Brain method
    {
        String output = "";
        if (day.equals("Saturday") || day.equals("Sunday"))
        {
            output = "Let's plan something";
        }
        else if (day.equals("Friday") && time > 6)
        {
            output = "Let's party!";
        }
        else
        {
            output = "Sorry, lets plan something else";
        }
        return output;
    } //end brain method

    @Override void advice()
    {
       System.out.println("Workholics are for the losers");
    }


    public String toString()
    {
        String output = "";
        output = "My work days are " + day +
                "\nAt " + time;
        return output;
    }





}
