
public class OrderLine
{
   private int amount;
   private Product product;
   
   public OrderLine(int amount, Product product)
   {
      this.amount = amount;
      this.product = product;
   }
   
   public int getAmount()
   {
      return amount;
   }
   public Product getProduct()
   {
      return product;
   }
   public double getPrice()
   {
      return getPrice();
   }
   //I think I have to write the code this way because it's being retrieved
   //from another class with the proper getter.
   
   public boolean equals(OrderLine other)
   {
      if(!(other instanceof OrderLine))
      {
         return false;
      }
      OrderLine object = (OrderLine) other;
      return other.amount == (amount) && other.product.equals(product);
   }
   //comparing the object with itself to ensure the right values are entered?
   
   public OrderLine copy()
   {
      return new OrderLine(this.amount, this.product);
   }
}
