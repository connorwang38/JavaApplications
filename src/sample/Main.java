package sample;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button = new Button("Go to scene 2");
        button.setOnAction(e -> window.setScene(scene2));
        Vbox layout1 = new Vbox(20);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
