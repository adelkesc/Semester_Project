import java.awt.*;
import javax.swing.*;

public class DateGui extends JFrame
{
   private JLabel dayLabel;
   private JLabel monthLabel;
   private JLabel yearLabel;
   
   private JTextField dayTextField;
   private JTextField monthTextField;
   private JTextField yearTextField;
   
   private JButton showButton;
   private JLabel dateLabel;
   
   public DateGui()
   {
      super("Date Gui");

       buildComponents();
       initializeComponents();
       buildPanel();
   }
   
   public void buildComponents()
   {
      dayLabel = new JLabel("Day:");
      monthLabel = new JLabel("Month:");
      yearLabel = new JLabel("Year:");
      
      dayTextField = new JTextField(5);
      monthTextField = new JTextField(5);
      yearTextField = new JTextField(5);
      
      showButton = new JButton("Show");
      dateLabel = new JLabel("Date:");
   }
   
   public void initializeComponents()
   {
      setSize(300, 150); 
      setVisible(true);
      setLocationRelativeTo(null); 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   }
   
   public void buildPanel()
   {
      JPanel date = new JPanel(new FlowLayout(FlowLayout.LEFT));
      date.add(dateLabel);
      
      JPanel panelLabel = new JPanel(new BorderLayout());
      panelLabel.add(dayLabel, BorderLayout.NORTH);
      panelLabel.add(monthLabel, BorderLayout.CENTER);
      panelLabel.add(yearLabel, BorderLayout.SOUTH);
      
      JPanel panelTextBox = new JPanel(new BorderLayout());
      panelTextBox.add(dayTextField, BorderLayout.NORTH);
      panelTextBox.add(monthTextField, BorderLayout.CENTER);
      panelTextBox.add(yearTextField, BorderLayout.SOUTH);
      
      JPanel buttonBox = new JPanel(new BorderLayout());
      buttonBox.add(showButton, BorderLayout.CENTER);
      
      JPanel contentPane = new JPanel(new FlowLayout());
      
      contentPane.add(panelLabel);
      contentPane.add(panelTextBox);
      contentPane.add(buttonBox);
      
      JPanel contentBox = new JPanel(new BorderLayout());
      contentBox.add(date, BorderLayout.NORTH);
      contentBox.add(contentPane, BorderLayout.CENTER);

      setContentPane(contentBox);

   }
   
   public static void main(String[] args)
   {
      new DateGui();
      
//      or
//      DateGui view = new DateGui();
//      view.setVisible(true);
   }
}
