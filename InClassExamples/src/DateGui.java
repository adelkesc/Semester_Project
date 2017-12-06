
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DateGui extends Application
{

   Label dateField;

   Label day;
   Label month;
   Label year;

   TextField dayField;
   TextField monthField;
   TextField yearField;

   Button showButton;

   @Override
   public void start(Stage primaryStage)
   {

      primaryStage.setTitle("Date Gui");

      dateField = new Label("Date:");

      day = new Label("Day:");
      month = new Label("Month:");
      year = new Label("Year:");

      dayField = new TextField();
      monthField = new TextField();
      yearField = new TextField();

      showButton = new Button("Show");

      buildPane(primaryStage);
   }

   private void buildPane(Stage primaryStage)
   {
      BorderPane root = new BorderPane();

      root.setTop(dateField);

      HBox hbox = new HBox();
      hbox.getChildren().add(day);
      hbox.getChildren().add(dayField);

      HBox hbox2 = new HBox();
      hbox2.getChildren().add(month);
      hbox2.getChildren().add(monthField);
      
      HBox hbox3 = new HBox();
      hbox3.getChildren().add(year);
      hbox3.getChildren().add(yearField);
      
      VBox vbox = new VBox();
      vbox.getChildren().add(hbox);
      vbox.getChildren().add(hbox2);
      vbox.getChildren().add(hbox3);
      root.setCenter(vbox);

      Scene dateScene = new Scene(root, 400, 400);
      primaryStage.setScene(dateScene);
      primaryStage.show();
      
     

   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
