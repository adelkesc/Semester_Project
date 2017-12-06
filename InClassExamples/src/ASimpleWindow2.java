import javax.swing.JFrame;

public class ASimpleWindow2 extends JFrame
{
   public ASimpleWindow2()
   {
      super("A Simple Window 2");
      
      setSize(300, 200);
      setVisible(true);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
   }
}
