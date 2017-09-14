import java.util.Scanner;

public class Quadratic
{
   public static void main(String[] args)
   {
      double a, b, c, D, x1, x2, x3;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input the values for the quadratic Equations");
      System.out.print("What is the value for a? ");
      a = keyboard.nextDouble();
      System.out.print("What is the value for b? ");
      b = keyboard.nextDouble();
      System.out.print("What is the value for c? ");
      c = keyboard.nextDouble();

      D = Math.pow(b, 2) - 4 * a * c;
      x1 = -b / 2 * a;
      x2 = (-b + Math.sqrt(D)) / 2 * a;
      x3 = (-b - Math.sqrt(D)) / 2 * a;

      if (D < 0)
         System.out.println(
               "The quadratic equation dont have any soluctions because D<0"
                     + D);
      else if (D == 0)
         System.out.println(
               "The quadratic equation have 1 soluction because D=0 -> " + x1);
      else if (D > 0)
         System.out.println(
               "The quadratic equation have 2 soluctions because D>0 -> " + x2
                     + " and -> " + x3);

   }
}
