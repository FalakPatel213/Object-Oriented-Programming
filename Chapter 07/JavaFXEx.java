import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


// public class JavaFXEx extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         Button btn1 = new Button("Click me, daddy, ohhh yeah :P");
//         Button btn2 = new Button("Click me");
//         Button btn3 = new Button("Click me");
//         Button btn4 = new Button("Click me");
//         Button btn5 = new Button("Click me");
//         Button btn6 = new Button("Click me");
//         Button btn7 = new Button("Click me");
//         Button btn8 = new Button("Click me");
//         Button btn9 = new Button("Click me");
//         Button btn10 = new Button("Click me");

//         StackPane root = new StackPane();                     // Layout   HBox,VBox, FlowPane
//         root.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10);   // button connect with layout.
//         Scene scene = new Scene(root, 300, 250);     // Scene
//         primaryStage.setScene(scene);                       // Scene connect wit h stage.
//         primaryStage.setTitle("Hello World");
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }

// }


// public class JavaFXEx extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         Button btn1 = new Button("Click me");
//         Button btn2 = new Button("Click me");
//         Button btn3 = new Button("Click me");
//         Button btn4 = new Button("Click me");
//         Button btn5 = new Button("Click me");
//         Button btn6 = new Button("Click me");
//         Button btn7 = new Button("Click me");
//         Button btn8 = new Button("Click me");
//         Button btn9 = new Button("Click me");
//         Button btn10 = new Button("Click me");

//         GridPane root = new GridPane();                     // Layout
//         root.add(btn1, 0, 0);   // button connect with layout.
//         root.add(btn2, 1, 1);   
//         root.add(btn3, 2, 2);   
//         root.add(btn4, 3, 3);   
//         root.add(btn5, 4, 4);   
//         root.add(btn6, 5, 5);   
//         root.add(btn7, 6, 6);   
//         root.add(btn8, 7, 7);   
//         root.add(btn9, 8, 8);   
//         root.add(btn10, 9, 9);   

//         root.setHgap(10);
//         root.setVgap(10);
//         root.setGridLinesVisible(true);

//         Scene scene = new Scene(root, 300, 250);     // Scene
//         primaryStage.setScene(scene);                       // Scene connect wit h stage.
//         primaryStage.setTitle("Hello World");
//         primaryStage.show();

//     }

//     public static void main(String[] args) {
//         launch(args);
//     }

// }


// public class JavaFXEx extends Application {

//     @Override
//     public void start(Stage primaryStage) {
//         Button btn1 = new Button("Click me");
//         Button btn2 = new Button("Click me");
//         Button btn3 = new Button("Click me");
//         Button btn4 = new Button("Click me");
//         Button btn5 = new Button("Click me");
//         Button btn6 = new Button("Click me");
//         Button btn7 = new Button("Click me");
//         Button btn8 = new Button("Click me");
//         Button btn9 = new Button("Click me");
//         Button btn10 = new Button("Click me");

//         BorderPane root = new BorderPane();                     // Layout
//         root.setBottom(btn1);   // button connect with layout.
//         root.setCenter(btn2);
//         root.setLeft(btn3);
//         root.setRight(btn4);
//         root.setTop(btn5);

//         Scene scene = new Scene(root, 300, 250);     // Scene
//         primaryStage.setScene(scene);                       // Scene connect wit h stage.
//         primaryStage.setTitle("Hello World");
//         primaryStage.show();

//     }

//     public static void main(String[] args) {
//         launch(args);
//     }

// }

public class JavaFXEx extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        Circle c = new Circle();                     // Layout
        c.centerXProperty().bind(root.widthProperty().divide(2));
        c.centerYProperty().bind(root.heightProperty().divide(2));
        c.setRadius(250);
        c.setStroke(Color.RED);
        c.setFill(Color.RED);

        root.getChildren().add(c);


        Scene scene = new Scene(root, 300, 250);     // Scene
        primaryStage.setScene(scene);                       // Scene connect wit h stage.
        primaryStage.setTitle("Hello World");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
