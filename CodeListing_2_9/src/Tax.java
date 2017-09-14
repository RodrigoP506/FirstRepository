
public class Tax
{
   public static void main (String[] args)
   {
      double item1, item2, item3, total, tax, totalPrice;
      
      item1 = 80;
      item2 = 140;
      item3 = 230;
      total = item1 + item2 + item3;
      tax = 0.25;
      totalPrice = total * tax;
      
      System.out.println("The total price with the tax is " + totalPrice);
   }
}
