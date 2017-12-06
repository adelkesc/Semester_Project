import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame
{
   private JTextField number;
   
   private JButton zero;
   private JButton one;
   private JButton two;
   private JButton three;
   private JButton four;
   
   private JButton five;
   private JButton six;
   private JButton seven;
   private JButton eight;
   private JButton nine;
   
   private JButton forwardSlash;
   private JButton multiply;  
   private JButton subtract;
   private JButton add;
   private JButton decimal;
   private JButton equals;
   
   public Calculator()
   {
      super("Calculator");
      
      buildComponents();
      windowComponents();
      buildPanel();
   }
   
   public void buildComponents()
   {
      number = new JTextField(14);
      
      zero = new JButton("0");
      one = new JButton("1");
      two = new JButton("2");
      three = new JButton("3");
      four = new JButton("4");
      
      five = new JButton("5");
      six = new JButton("6");
      seven = new JButton("7");
      eight = new JButton("8");
      nine = new JButton("9");
      
      forwardSlash = new JButton("/");
      multiply = new JButton("*");
      subtract = new JButton("-");
      add = new JButton("+");
      decimal = new JButton(".");
      equals = new JButton("=");
   }
   public void windowComponents()
   {
      setSize(250, 250);
      setVisible(true);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void buildPanel()
   {
      JPanel textField = new JPanel(new FlowLayout(FlowLayout.LEFT));
      textField.add(number);
      
      JPanel numPad = new JPanel(new GridLayout(4, 4));
      numPad.add(seven);
      numPad.add(eight);
      numPad.add(nine);
      numPad.add(forwardSlash);
      
      numPad.add(four);  
      numPad.add(five);
      numPad.add(six);
      numPad.add(multiply);
      
      numPad.add(one);
      numPad.add(two);
      numPad.add(three);
      numPad.add(subtract);
      
      numPad.add(zero);
      numPad.add(decimal);
      numPad.add(equals);
      numPad.add(add);

      JPanel contentPane = new JPanel();
      contentPane.add(textField);
      contentPane.add(numPad);
      
      setContentPane(contentPane);
   }

   public static void main(String[] args)
   {
      new Calculator();

   }

}
