package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex14_6noinheritance extends Application {
    @Override
    public void start(Stage primaryStage) {
    Pane pane = new Pane();
    
    for (int row = 0; row < 8; row++) {
        for (int col = 0; col < 8; col++) {
        Rectangle r = new Rectangle(10, 10, 10, 10);
        
        r.xProperty().bind(pane.widthProperty().divide(8).multiply(col));
        r.yProperty().bind(pane.heightProperty().divide(8).multiply(row));
        
        r.widthProperty().bind(pane.widthProperty().divide(8));
        r.heightProperty().bind(pane.heightProperty().divide(8));
        
        r.setFill(Color.RED);
            if((row+col)%2 == 0) {
                r.setFill(Color.BLACK);
            }
            pane.getChildren().add(r);
            }
        }
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
