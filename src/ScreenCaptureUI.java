import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ScreenCaptureUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a transparent stage
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // Create a transparent panel with a hole
        Pane root = new Pane();
        root.setStyle("-fx-background-color: transparent;");

        // Create a rectangle to act as the hole
        Rectangle hole = new Rectangle(200, 200, 200, 100);
        hole.setFill(Color.TRANSPARENT);
        hole.setStroke(Color.WHITE); // For visualization purposes
        root.getChildren().add(hole);

        Scene scene = new Scene(root, 600, 400, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
