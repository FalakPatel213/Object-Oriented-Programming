import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFxShapesLine extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Line line1 = new Line();
        line1.setStartX(10);
        line1.setStartY(10);
        line1.setEndX(160);
        line1.setEndY(160);
        line1.setStrokeWidth(5);
        line1.setStroke(Color.RED);
        line1.setOpacity(0.7);
        line1.setRotate(90);
        Line line2 = new Line(10, 10, 160, 160);
        pane.getChildren().addAll(line1, line2);
        Scene scene = new Scene(pane);

        primaryStage.setTitle("Show Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
