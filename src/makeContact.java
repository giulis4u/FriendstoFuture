public class makeContact
{
    private String name;
    private Friend[] contacts;
    private int count = 0;

    public makeContact(String name, int numContacts)
    {
        contacts = new Friend[numContacts];
        this.name = name;
    }

    public void addContact(Friend f)
    {
        contacts[count] = f;
        count++;
    }

    public String toString()
    {
        String output = name;
        for (int i = 0; i < count; i++)
        {
            output += "\n" + contacts[i].getPhoneNumber();
        }
        return output;
    }
}