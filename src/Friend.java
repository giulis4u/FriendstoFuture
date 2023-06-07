import java.util.ArrayList;
public class Friend
{
    private int age;

    private String name;

    private String phoneNumber;

    private String gender;

    private String birthday;
    private boolean thisYear;

    private ArrayList<String> likes;

    private ArrayList<String> dislikes;

    //My constructor
    public Friend (int age, String name, String phoneNumber, String gender, String birthday, boolean thisYear) //Friend constructor
    {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.gender = gender;
        this.thisYear = thisYear;
        this.likes = new ArrayList<String>();
        this.dislikes = new ArrayList<String>();
    }

    void addLikes(String s)
    {
        likes.add(s);//method from arraylist
    }

    public String getlikes()
    {
        String output = "";
        for(String s : likes)
            output += s + " ";
        return output;
    }

    void addDislikes(String p)
    {
        dislikes.add(p);
    }
    public String getDislikes()
    {
        String output = "";
        for(String p : dislikes) // for-each loop which traverses through the arraylist "dislikes"
            output += p + " ";
        return output;
    }


    //getters & setters
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public int getBirthday()
    {
        return getBirthday();
    }

    public boolean isThisYear()
    {
        return thisYear;
    }
    public int length()
    {
        return name.length();
    }

    void advice()
    {
        System.out.println("Be happy");
    }




    public String toString()  //outputs general information regards to friend
    {
      String output = "\nAge: " + age +
              "\nName: " + name +
              "\nGender: " + gender +
              "\nBirthday: " + birthday +
              "\nPhone Number: " + phoneNumber +
              "\nThis year: " + thisYear;

      return output;
    }


}
