class ReverseString
{
    public static void main(String[] args)
    {
       
             String s1="Reversing";
                String reverse="";
                for(int i=8;i>0;i--)
                {
                reverse=reverse+s1.charAt(i);
                
                }
                System.out.println("The answer is "+reverse);
        
    }
}