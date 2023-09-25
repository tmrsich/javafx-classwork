package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class cssPractice extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        newCircle nc = new newCircle();
        Scene scene = new Scene(nc, 500, 500);
        primaryStage.setTitle("Practice with CSS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

class newCircle extends Pane {
    public newCircle() {
        Ellipse e = new Ellipse();
        e.setCenterX(250);
        e.setCenterY(250);
        e.setRadiusX(200);
        e.setRadiusY(200);
        e.setFill(Color.TRANSPARENT);
        e.setStroke(Color.BLACK);
        e.setStrokeWidth(10);
        getChildren().add(e);
    }
}
