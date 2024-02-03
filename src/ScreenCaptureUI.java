import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.awt.*;

public class ScreenCaptureUI extends Application {

    protected Robot robot;
    protected PointerInfo pointerInfo;

    @Override
    public void start(Stage primaryStage) {
        try {
            this.robot = new Robot();
        }
        catch (AWTException e) {
            e.printStackTrace();
        }
        // Create a transparent stage
        primaryStage.initStyle(StageStyle.DECORATED);

        // Create a transparent panel with a hole
        Pane root = new Pane();
        root.setStyle("-fx-background-color: transparent;");

        // Create a rectangle to act as the hole
        Rectangle hole = new Rectangle(400,200,400,400);
        hole.setFill(Color.TRANSPARENT);
        hole.setStroke(Color.RED); // For visualization purposes
        root.getChildren().add(hole);

        //Create a label with mouse coordinates
        Label mouseCoordinates = new Label("mouseX: fjadkfsdjl\tmouseY: fjdaklfdjs");
        root.getChildren().add(mouseCoordinates);

        Scene scene = new Scene(root, 600, 400, Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
