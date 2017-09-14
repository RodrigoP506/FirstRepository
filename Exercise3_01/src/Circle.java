import java.util.Scanner;

public class Circle
{
   public static void main(String[] args)
   {
      double radius, circumference, area;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("What is the radius? ");
      radius = keyboard.nextDouble();

      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius, 2);

      System.out.println("The circumference is " + circumference);
      System.out.println("The area is " + area);
   }
}
