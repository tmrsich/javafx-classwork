package bca;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Ex14_2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                ImageView view = new ImageView();

                int r = (int)(Math.random()*3);
                if (r == 0) {
                    view.setImage(new Image("file:images/x.gif"));
                } else if (r == 1) {
                    view.setImage(new Image("file:images/o.gif"));
                }
                view.setFitWidth(100);
                view.setFitHeight(100);
                pane.add(view, col, row);
        }
    }
    Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Tic-Tac-Toe");
    primaryStage.show();
}
    public static void main(String[] args) {
        Application.launch(args);
        }
}

