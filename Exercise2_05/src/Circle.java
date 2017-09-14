public class Circle
{

   public static void main (String[] args)
   {  
   double radius = 22.5;
   double circumference;
   double area;
   
   circumference = 2 * Math.PI * radius;
   area = Math.PI * Math.pow(radius, 2);
   
   System.out.println("The circumference is " + circumference);
   System.out.println("The area is " + area);
   }
   
}
