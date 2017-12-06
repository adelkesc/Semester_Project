
public class Point
{
   private double x;
   private double y;
   
   public Point(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
   
   public double getX()
   {
      return this.x;
   }
   public double getY()
   {
      return this.y;
   }
   
   public void moveTo(double x, double y)
   //Assigning the instance variables to the setter argument
   {
     this.x = x;
     this.y = y;
   }
   public void move(double xDistance, double yDistance)
   //This will add to the distance
   {
      this.x += xDistance;
      this.y += yDistance;
   }
   public Point copy()
   //in  a copy method you create a new object
   {
      return new Point(this.x, this.y);
   }
   
   public String toString()
   //this returns the coordinate of the points
   //this is another way to write a string
   {
       return ("(" + this.x + ", " + this.y + ")");
   }
   
   public boolean equals(Point theOtherPoint)
   //the parameter variable name doesn't matter
   //remember instanceof
   //instanceof checks if theOtherPoint is a part of Point
   {
      if (theOtherPoint instanceof Point && this.x == theOtherPoint.getX() 
            && this.y == theOtherPoint.getY())
         return true;
            //the end locates the
         return false;
   }
}
