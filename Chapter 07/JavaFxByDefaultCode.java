import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxByDefaultCode extends Application{
    public void start(Stage primaryStage) {
        // Code
        Scene scene = new Scene(root, 250, 250);
        primaryStage.setTitle("JavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
