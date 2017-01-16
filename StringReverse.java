import java.util.Scanner;



public class StringReverse 
{
    public static String orig;
    public static String output;

    public String reverse(String str) 
    {     
        if ((str==null)||(str.length() <= 1) )
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) 
    {
        StringReverse obj=new StringReverse();
        String str = "Quora";
        System.out.println("Reverse of \'"+str+"\' is \'"+obj.reverse(str)+"\'"); 

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter string:");
        orig = input.nextLine();

        output = obj.reverse(orig);

        System.out.println("Output is \'"+output+"\'");

    }    
}