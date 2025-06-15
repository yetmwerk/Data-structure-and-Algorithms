import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label();
        Button button = new Button("Click Me");

        button.setOnAction(e -> label.setText("Hello, JavaFX!"));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(button, label);

        Scene scene = new Scene(layout, 250, 150);
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
