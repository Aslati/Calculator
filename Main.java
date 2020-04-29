import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//This is class manning JavaFX GUI working on FXML, available in this folder, named as calcView.fxml, however due to sdk version fx:deploy module isn't available anymore, so JAR file building is impossible any easy way, there left just Maven option but it's complicated
public class Main extends javafx.application.Application{

   @Override
   public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("calcView.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
