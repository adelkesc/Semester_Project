import java.util.ArrayList;

public class Order
{
   private OrderLine orderLine;
   private Product product;
   private ArrayList<Number> orderLines;
   
   
   public Order()
   {
      this.orderLine = null;
      this.product = null;
      this.orderLines = new ArrayList<>();
      //this might be wrong because i don't know if orderline should be null
   }
   
   public void addProduct(int amount, Product product)
   {
//      this.orderLine = orderLine.copy();
//      this.product = product;
//      this.orderLines.add(new OrderLine(amount, product));
   }
   public int getNumberOfOrderLines()
   {
      return this.orderLines.size();
   }
//   public OrderLine getOrderLine(int index)
//   {
//      
//   }
   
   
}
