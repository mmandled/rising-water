package com.risingwaters;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        Label message = new Label(
                "CEBU RISING WATERS"
        );

        message.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 26px;" +
                        "-fx-font-weight: bold;"
        );

        StackPane root = new StackPane(message);

        root.setStyle("-fx-background-color: #071b35;");

        Scene scene = new Scene(root, 1280, 720);

        stage.setTitle("Cebu: Rising Waters");
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
