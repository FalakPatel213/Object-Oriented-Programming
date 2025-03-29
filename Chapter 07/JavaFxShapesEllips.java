import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class JavaFxShapesEllips extends Application {
 
 @Override
 public void start(Stage primaryStage) {
 
 Ellipse ellipse=new Ellipse(150.0f,70.0f,100.0f,30.0f);
 ellipse.setStrokeWidth(5);
 ellipse.setStroke(Color.RED);
 ellipse.setFill(Color.WHITE);
 StackPane root=new StackPane(ellipse);
 Scene scene = new Scene(root, 300, 250);
 
 primaryStage.setTitle("Elllipse");
 primaryStage.setScene(scene);
 primaryStage.show();
 }
 public static void main(String[] args) {
 launch(args);
 } 
}
