/**
 * Rectangle class, Phase 6
 */

public class Rectangle
{
   private double length; //l0
   private double width; //20

   /**
    * Constructor
    */

   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }
   
   public double getLength()
   {
     return length;
   }
   public double getWidth()
   {
      return width;
   }
   public double getArea()
   {
      return length * width;
   }
}
