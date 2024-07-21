package com.firestore.initialize;

import com.firestore.controller.LoginController;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class InitializeApp extends Application {

    @Override
    public void start(Stage primaryStage)throws Exception{
        LoginController loginController = new LoginController(primaryStage);
        primaryStage.setScene(loginController.getLoginScene());

        primaryStage.setTitle("Hotel Reservation System");
        primaryStage.getIcons().add(new Image("images/hotelimage.jpg"));
        primaryStage.show();
    }
    
}
