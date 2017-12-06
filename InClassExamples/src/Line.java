
public class Line
{
   private String color = "No color set";
   private Point pointA;
   private Point pointB;
   //point a and b will be processed in the Point class, x and y are specific
   //to the old class and don't matter here.
   
   //Overloading constructor
   public Line(Point pointA, Point pointB, String color)
   {
      this.color = color;
      //you need to .copy the point to create a composition between Line and Point
      this.pointA = pointA.copy();
      this.pointB = pointB.copy();
   }
}
