import javax.swing.JFrame;

public class ASimpleWindow
{
   private JFrame win;
   
   public ASimpleWindow()
   {
      win = new JFrame("A Simple Window");
      
      win.setSize(400, 300);
      win.setVisible(true);
      
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
}
