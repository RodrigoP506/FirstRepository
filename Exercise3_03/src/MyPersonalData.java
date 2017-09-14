import java.util.Scanner;

public class MyPersonalData
{
   public static void main (String[] args)
   {
      String name;
      int age;
      String adress;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("How old are you? ");
      age = keyboard.nextInt(); 
      
      keyboard.nextLine();
      
      System.out.print("What is your adress? ");
      adress = keyboard.nextLine(); 
      
      System.out.println("Your name is " + name + ", you have " + age +  " years old and you live at " + adress + ".");
      
   }
}
