package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Ex14_9 extends Application {

    public Pane getEllipsePane() {
        Pane pane = new Pane();
        Ellipse ellipse = new Ellipse();
        ellipse.radiusXProperty().bind(pane.widthProperty().divide(2).subtract(10));
        ellipse.radiusYProperty().bind(pane.heightProperty().divide(2).subtract(10));
        ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
        ellipse.centerYProperty().bind(pane.heightProperty().divide(2));

        ellipse.setStrokeWidth(5);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.WHITE);

        pane.getChildren().add(ellipse);
        return pane;
    }

    public void start(Stage primaryStage) {
        GridPane gridpane = new GridPane();
        gridpane.add(getEllipsePane(), 0, 0);
        gridpane.add(getEllipsePane(), 0, 1);
        gridpane.add(getEllipsePane(), 1, 0);
        gridpane.add(getEllipsePane(), 1, 1);

        ColumnConstraints c1 = new ColumnConstraints();
        c1.setPercentWidth(50);
        gridpane.getColumnConstraints().add(c1);
        gridpane.getColumnConstraints().add(c1);

        RowConstraints r1 = new RowConstraints();
        r1.setPercentHeight(50);
        gridpane.getRowConstraints().add(r1);
        gridpane.getRowConstraints().add(r1);

        Scene scene = new Scene(gridpane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
