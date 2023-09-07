package LogicalPrograms;

public class Palindrome 
{
    public static void main(String args[])
    {
        String Name="MOM";
        String Reverse="";
        for (int i=2;i>=0;i--)
        {
            Reverse=Reverse+Name.charAt(i);
        }
        System.out.println(Reverse);
        

        if (Reverse.equals(Name))
        {
            System.out.println("The given word is  Palindrome");
        }
        else
        {
            System.out.println("The given word is not a Palindrome");
        }
    }
}
