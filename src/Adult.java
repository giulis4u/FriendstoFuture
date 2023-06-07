public class Adult extends Friend
{
     private boolean collegeStudent;

     private int classes;

     public Adult (int age, String name, String phoneNumber, String gender, String birthday, boolean thisYear,
                   boolean collegeStudent, int classes)
     {
         super (age, name, phoneNumber, gender, birthday, thisYear);
         this.collegeStudent = collegeStudent;
         this.classes = classes;
     }

    // public Adult (int age, String name, String phoneNumber, String gender, String birthday, boolean thisYear,
    //                boolean collegeStudent, int classes)
    //  {
    //    super(age, name, phoneNumber, gender, birthday, thisYear);
    //    collegeStudent = collegeStudent;
    //    classes = classes;// }  // Overloaded Constructor


     public String MentalHealth() // Brain method
     {
         String output = "";
         if (collegeStudent && classes > 6)
         {
             output = "Make sure to rest up!";
         }
         else if (collegeStudent && classes == 3)
         {
             output = "Drink coffee";
         }
         else
         {
             output = "Sleep";
         }
         return output;
     }

     @Override void advice()//this method overrides advice() in Friend class
     {
         System.out.println("Believe in yourself");
     }



     public String toString()
     {
       String output = super.toString() + "\nCollege Student: " + collegeStudent
               +"\nClasses " + classes;
       return output;
     }

}