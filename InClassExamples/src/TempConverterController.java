import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TempConverterController
{
   @FXML
   private Label fcTemp;
   
   @FXML
   private TextField txtFieldTemp;
   
   @FXML
   private Button celButton;
   
   @FXML
   private Button farButton;
   
   private Temperature temperature = new Temperature();
   
   public void initialize()
   {
      //performs an necessary initializes
   }
   
   //event listeners to the buttons
   public void convertToCelcius()
   {
//      System.out.println("To Celsius button clicked...");
      //use this to test date gui later...
      
      String fcString = txtFieldTemp.getText(); //getting text without scanner
      System.out.println("Temperature: " + fcString + " " + Double.parseDouble(fcString));
//      double celVal = 5.0 / 12.0 * (Double.parseDouble(fcString) -32);
      double celVal = temperature.fahrenheitToCelcius(Double.parseDouble(fcString));
      fcString = String.format("%s Fahrenheit = %.2f Celcius", fcString, celVal); //this is only string formatting
      //display result in an option pane
      JOptionPane.showMessageDialog(null, fcString);
      
   }
   public void convertToFahr()
   {
      String fcString = txtFieldTemp.getText();
//      double fahVal = Double.parseDouble(fcString) * 9.0 / 5.0 + 32;
      double fahVal = temperature.celciusToFahrenheit(Double.parseDouble(fcString));
      fcString = String.format("%s Celcius = %.2f Fahrenheit", fcString, fahVal); //this is only string formatting
      //display result in an option pane
      JOptionPane.showMessageDialog(null, fcString);
   }
}
