package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class _Ex14_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();



        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Exercise 14.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
