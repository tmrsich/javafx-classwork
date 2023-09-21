package bca;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class _Ex14_3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();
            int randomNumber1 = (int)(Math.random()*52)+1;
            int randomNumber2 = (int)(Math.random()*52)+1;
            int randomNumber3 = (int)(Math.random()*52)+1;

            String[] cardPaths = {
                "file:images/card/1.png",
                "file:images/card/2.png",
                "file:images/card/3.png",
                "file:images/card/4.png",
                "file:images/card/5.png",
                "file:images/card/6.png",
                "file:images/card/7.png",
                "file:images/card/8.png",
                "file:images/card/9.png",
                "file:images/card/10.png",
                "file:images/card/11.png",
                "file:images/card/12.png",
                "file:images/card/13.png",
                "file:images/card/14.png",
                "file:images/card/15.png",
                "file:images/card/16.png",
                "file:images/card/17.png",
                "file:images/card/18.png",
                "file:images/card/19.png",
                "file:images/card/20.png",
                "file:images/card/21.png",
                "file:images/card/22.png",
                "file:images/card/23.png",
                "file:images/card/24.png",
                "file:images/card/25.png",
                "file:images/card/26.png",
                "file:images/card/27.png",
                "file:images/card/28.png",
                "file:images/card/29.png",
                "file:images/card/30.png",
                "file:images/card/31.png",
                "file:images/card/32.png",
                "file:images/card/33.png",
                "file:images/card/34.png",
                "file:images/card/35.png",
                "file:images/card/36.png",
                "file:images/card/37.png",
                "file:images/card/38.png",
                "file:images/card/39.png",
                "file:images/card/40.png",
                "file:images/card/41.png",
                "file:images/card/42.png",
                "file:images/card/43.png",
                "file:images/card/44.png",
                "file:images/card/45.png",
                "file:images/card/46.png",
                "file:images/card/47.png",
                "file:images/card/48.png",
                "file:images/card/49.png",
                "file:images/card/50.png",
                "file:images/card/51.png",
                "file:images/card/52.png"
            };

        ImageView view1 = new ImageView();
        view1.setImage(new Image(cardPaths[randomNumber1]));

        ImageView view2 = new ImageView();
        view2.setImage(new Image(cardPaths[randomNumber2]));

        ImageView view3 = new ImageView();
        view3.setImage(new Image(cardPaths[randomNumber3]));

        hbox.getChildren().add(view1);
        hbox.getChildren().add(view2);
        hbox.getChildren().add(view3);

        Scene scene = new Scene(hbox, 600, 600);
        primaryStage.setTitle("Exercise 14.3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
