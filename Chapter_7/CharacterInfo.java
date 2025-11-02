import java.util.Scanner;

public class CharacterInfo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = input.next().charAt(0);  only

        System.out.println("\nCharacter Information:");
        System.out.println("----------------------");

        
        if (Character.isUpperCase(ch))
            System.out.println(ch + " is an uppercase letter.");
        else if (Character.isLowerCase(ch))
            System.out.println(ch + " is a lowercase letter.");
        else
            System.out.println(ch + " is not a letter.");

       
        if (Character.isLetterOrDigit(ch))
            System.out.println(ch + " is a letter or digit.");
        else
            System.out.println(ch + " is not a letter or digit.");

      
        if (Character.isWhitespace(ch))
            System.out.println("The character is a whitespace.");

        
        System.out.println("\nCase Conversion:");
        System.out.println("To Uppercase: " + Character.toUpperCase(ch));
        System.out.println("To Lowercase: " + Character.toLowerCase(ch));

        input.close();
    }
}
