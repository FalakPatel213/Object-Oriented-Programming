import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class EventDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Click Me");

        EventHandler<ActionEvent> ob = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Button Clicked!");
            }
        };

        btn.setOnAction(ob); // Registering the event handler
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Event Handling");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
