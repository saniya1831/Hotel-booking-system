package com.firestore.AboutPage;


import com.firestore.Home.homepage;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class About_us {
    private Stage primaryStage;

    public About_us(Stage stage){
        this.primaryStage = stage;
    }

    public void start() {
        
        Button backButton = new Button("<<");
        backButton.setStyle("-fx-font-size:20;-fx-background-color : #B2D3C2;-fx-text-fill:#4C0121;-fx-font-weight: bold;");
        Label title = new Label("Discription");
        title.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");

        backButton.setOnAction(event -> {
            homepage hp = new homepage(primaryStage);
            hp.start();
        });

        Label grMem = new Label("Group Members");
        grMem.setStyle("-fx-font-size: 30px; -fx-font-weight: bold;");

        Label Mem1 = new Label("@Saniya Pathan");
        Mem1.setStyle("-fx-text-fill:#4C0121;-fx-font-size:27px; -fx-font-weight:bold;");

        Label Mem2 = new Label("@Sakshi Bansode");
        Mem2.setStyle("-fx-text-fill:#4C0121;-fx-font-size:27px; -fx-font-weight:bold;");
        Label Mem3 = new Label("@Varsha Bombe");
        Mem3.setStyle("-fx-text-fill:#4C0121;-fx-font-size:27px; -fx-font-weight:bold;");

        Label conLabel = new Label("Concept Used:");
        conLabel.setStyle("-fx-font-size:30px; -fx-font-weight:bold;");

        Label conLabel2 = new Label("OOP Concepts");
        conLabel2.setStyle("-fx-text-fill:#630436;-fx-font-size:30px; -fx-font-weight:bold;");
        Label conLabel3 = new Label("Exception Handling");
        conLabel3.setStyle("-fx-text-fill:#630436;-fx-font-size:30px; -fx-font-weight:bold;");
        Label conLabel4 = new Label("Firestore Database");
        conLabel4.setStyle("-fx-text-fill:#630436;-fx-font-size:30px; -fx-font-weight:bold;");


        Label description = new Label("Welcome to BookItNow! We offer the best services to make your stay memorable.\n"
                + "Our hotel provides top-notch amenities, including a swimming pool, gym, and spa.\n "
                + "We are located in the heart of the city, making it easy for you to explore and enjoy the\n" +"surroundings.\n"
                + "Our dedicated staff is here to ensure you have a pleasant experience from check-in\n" + "check-out.\n");
        description.setStyle("-fx-text-fill: #B90E0A;-fx-font-weight:bold;-fx-font-size:28");

        //HBox hb = new HBox(20,Mem1,Mem2,Mem3);
        VBox vb = new VBox(10,backButton);
        vb.setAlignment(Pos.TOP_LEFT);
        VBox layout = new VBox(10); // 10 is the spacing between elements
        layout.setStyle("-fx-padding: 20px;");
        layout.getChildren().addAll(vb,title, description,grMem,Mem1,Mem2,Mem3,conLabel,conLabel2,conLabel3,conLabel4);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-image: url('hr_images/about.jpg'); -fx-background-size: cover;");

        
        Scene scene = new Scene(layout, 1000, 900); 
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
