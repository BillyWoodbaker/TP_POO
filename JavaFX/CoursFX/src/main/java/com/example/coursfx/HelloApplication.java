package com.example.coursfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class HelloApplication extends Application {



    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,Color.LIGHTGRAY);

        Image icon = new Image("Images/code-flat.png");
        stage.getIcons().add(icon);
        stage.setTitle("Fenêtre 1");
        stage.setHeight(800);
        stage.setWidth(1280);
        stage.setResizable(true);

        stage.setFullScreen(false);
        stage.setFullScreenExitHint("Press q to exit Fullscreen");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    }
}