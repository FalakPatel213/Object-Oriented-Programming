import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFxShapesPolygon extends Application {

    @Override
    public void start(Stage primaryStage) {
        Polygon hexagon = new Polygon();
        Polygon triangle = new Polygon();
        hexagon.getPoints().addAll(new Double[] { 200.0, 50.0,
                400.0, 50.0,
                450.0, 150.0,
                400.0, 250.0,
                200.0, 250.0,
                150.0, 150.0 });
        triangle.getPoints().setAll(200.0, 200.0, 300.0, 300.0, 200.0, 300.0);
        GridPane root = new GridPane();
        root.add(hexagon, 1, 0);
        root.add(triangle, 0, 0);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
