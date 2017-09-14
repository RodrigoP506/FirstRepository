import java.util.Scanner;

public class MyNameAndAge
{
   public static void main (String[] args)
   {
      String name;
      int age;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("How old are you? ");
      age = keyboard.nextInt();
      
      System.out.println("Your name is " + name + " and you have " + age +" years old.");
   }
}
