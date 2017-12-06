
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyFirstJavaFX extends Application
{

   @Override
   public void start(Stage primaryStage)
   {
      // create a scene and place a button
      Button btnHello = new Button("Hello");
      btnHello.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent event)
         {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("My First JavaFX Info Box");
            alert.setHeaderText(null);
            alert.setContentText("Hello everyone. Don't give up. Life is good!");
            alert.showAndWait();
         }
      });
      Scene scene = new Scene(btnHello, 400, 400);
      primaryStage.setTitle("My First JavaFX App"); // just the Title
      // place the scene on the stage
      primaryStage.setScene(scene);
      // let the show begin!
      primaryStage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
