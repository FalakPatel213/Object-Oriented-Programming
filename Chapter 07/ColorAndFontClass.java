import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class ColorAndFontClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Circle c1 = new Circle();
        c1.setRadius(50);
        c1.setFill(Color.YELLOW);
        Circle c2 = new Circle();
        c2.setRadius(50);
        c2.setFill(Color.rgb(200, 150, 130));
        Label l = new Label();
        l.setTextFill(Color.hsb(270, 0.6, 0.9));
        StackPane root = new StackPane();
        root.getChildren().add(c1);
        StackPane root1 = new StackPane();
        root1.getChildren().addAll(c2, l);
        Text t = new Text (20, 20, "Falak Patel");
        t.setFill(Color.color(0.2, 0.6, 0.7));
        t.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));
        t.setUnderline(true);
        HBox root2 = new HBox();
        root2.getChildren().addAll(root, root1, t);

        Scene scene = new Scene(root2, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
