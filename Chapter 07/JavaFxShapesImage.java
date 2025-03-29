import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class JavaFxShapesImage extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) throws FileNotFoundException {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        FileInputStream fin = new FileInputStream("IMAGE.png");
        Image image = new Image(fin);
        pane.add(new ImageView(image), 0, 0);
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(100);
        imageView2.setFitWidth(100);
        pane.add(imageView2, 0, 1);

        ImageView imageView3 = new ImageView(image);
        imageView3.setRotate(90);
        pane.add(imageView3, 0, 2);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}
