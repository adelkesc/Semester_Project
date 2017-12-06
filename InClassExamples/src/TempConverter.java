import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TempConverter extends Application
{
   @Override
   public void start(Stage stage) throws Exception
   {
      //invoke/instantiate the fxml loader
      FXMLLoader loader = new FXMLLoader();
      
      //set controller
      loader.setController(new TempConverterController());
      
      //set location of the fxml doc
      loader.setLocation(getClass().getResource("TempConverter.fxml"));
      Parent root = loader.load();
      
      //build the scene graph
      Scene scene = new Scene(root);
      
      //show the window using the previously constructed scene graph
      stage.setTitle("JavaFx Temperature Converter");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      launch(args);

   }
}
