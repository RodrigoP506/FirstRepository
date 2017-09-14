import java.util.Scanner;

public class Lenght6Strings
{
   public static void main (String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int totalCharacters = 0;
      String recentLenghtString;
      
      for (int a = 0; a < 6; a++ )
      {
         
         System.out.println("Write Something: ");
         recentLenghtString = keyboard.nextLine();
         int characters = recentLenghtString.length();
         totalCharacters = totalCharacters + characters;
      }
      
      System.out.println("The total number of characters is: " + totalCharacters);
   }
}
