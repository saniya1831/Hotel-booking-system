package com.firestore;

import com.firestore.controller.LoginController;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        LoginController loginController = new LoginController(primaryStage);
        loginController.showLoginScene();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
