public class Online extends Friend
{
    private boolean inUSA;

    public Online(int age, String name, String phoneNumber, String gender, String birthday, boolean thisYear, boolean inUSA)
    {
        super(age, name, phoneNumber, gender, birthday, thisYear);
        this.inUSA = inUSA; //Do they live in the nation?
    }

    //Brain Methods
    //method manipulates friends nickname
    public String nickOnline(Friend f) //Brain Method
    {
     String output = "";
        if(f.getName().length() == 5)
        {
            output = "UserPuppyCatlover";
        }
        else if (f.getName().length() > 5)
        {
            output = "UserCouplesSuck";
        }
        return output; //returns whichever name length has longer
    }

    @Override void advice()
    {
        System.out.println("Don't forget I am here");
    }



    public String toString()
    {
        String output = super.toString() + "\nThey live in the US? " + inUSA;
        return output;
    }


}
