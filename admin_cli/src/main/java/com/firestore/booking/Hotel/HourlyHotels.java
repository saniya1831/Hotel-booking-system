package com.firestore.booking.Hotel;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class HourlyHotels {
    private Stage primaryStage;

    public HourlyHotels(Stage stage){
        this.primaryStage = stage;
    }
   
    public void start() {
        /*Image hotelimg = new Image("hr_images/hyattcentric.jpeg.jpg");
        ImageView hotelimgView = new ImageView(hotelimg);
        hotelimgView.setFitWidth(500);
        hotelimgView.setFitHeight(300);
        hotelimgView.setPreserveRatio(true);

        Image roomimg = new Image("hr_images/Hayyt_img1.jpg");
        ImageView roomView = new ImageView(roomimg);
        roomView.setFitWidth(500);
        roomView.setFitHeight(300);

        Label namelb = new Label("Hyatt Concentric-MG Road");
        namelb.setStyle("-fx-font-weight:bold;-fx-font-size:30;");
        
        Label lb1 = new Label("Couple friendly");
        lb1.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon = new Image("hr_images/correct_icon.png");
        ImageView labeliconView = new ImageView(labelicon);
        labeliconView.setFitWidth(45);
        labeliconView.setFitHeight(60);
        labeliconView.setPreserveRatio(true);
        
        Label lb2 = new Label("Local ID Accepted");
        lb2.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon2 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView2 = new ImageView(labelicon2);
        labeliconView2.setFitWidth(45);
        labeliconView2.setFitHeight(60);
        labeliconView2.setPreserveRatio(true);
        
        HBox labelBox = new HBox(20, labeliconView, lb1, labeliconView2, lb2);
        
        HBox hb1 = new HBox(10, hotelimgView, roomView);
        
        Button btn3hrs = new Button("3 Hr $5000");
        btn3hrs.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs.setOnAction(e -> showBookingDialog());
        
        Button btn6hrs = new Button("6 Hr $9000");
        //btn6hrs.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn6hrs.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        Button btn12hrs = new Button("12 Hr Not available");
        //btn12hrs.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn12hrs.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        
        HBox buttonBox = new HBox(20, btn3hrs, btn6hrs, btn12hrs);

        Image hotelimg2 = new Image("hr_images/leelapalace.jpg");
        ImageView hotelimgView2 = new ImageView(hotelimg2);
        hotelimgView2.setFitWidth(500);
        hotelimgView2.setFitHeight(300);
        hotelimgView2.setPreserveRatio(true);

        Image roomimg2 = new Image("hr_images/leelaroom2.jpg");
        ImageView roomView2 = new ImageView(roomimg2);
        roomView2.setFitWidth(500);
        roomView2.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb2 = new Label("The Leela Palace Bangluru");
        namelb2.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb3 = new Label("Couple friendly");
        lb3.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon3 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView3 = new ImageView(labelicon3);
        labeliconView3.setFitWidth(45);
        labeliconView3.setFitHeight(60);
        labeliconView3.setPreserveRatio(true);

        Label lb4 = new Label("Local ID Accepted");
        lb4.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon4 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView4 = new ImageView(labelicon4);
        labeliconView4.setFitWidth(45);
        labeliconView4.setFitHeight(60);
        labeliconView4.setPreserveRatio(true);

        HBox labelBox2 = new HBox(20, labeliconView3, lb3, labeliconView4, lb4);
        HBox hb2 = new HBox(10, hotelimgView2, roomView2);

        Button btn3hrs2 = new Button("3 Hr $4990");
        btn3hrs2.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs2.setOnAction(e -> showBookingDialog());

        Button btn6hrs2 = new Button("6 Hr $6750");
        btn6hrs2.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        Button btn12hrs2 = new Button("12 Hr $10999");
        btn12hrs2.setStyle("-fx-font-size: 20;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

        HBox buttonBox2 = new HBox(20, btn3hrs2, btn6hrs2, btn12hrs2);

        Image hotelimg3 = new Image("hr_images/westend.jpg");
        ImageView hotelimgView3 = new ImageView(hotelimg3);
        hotelimgView3.setFitWidth(500);
        hotelimgView3.setFitHeight(300);
        hotelimgView3.setPreserveRatio(true);

        Image roomimg3 = new Image("hr_images/wetend_room.jpg");
        ImageView roomView3 = new ImageView(roomimg3);
        roomView3.setFitWidth(500);
        roomView3.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb3 = new Label("Taj West End Hotel Bengluru");
        namelb3.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb5 = new Label("Couple friendly");
        lb5.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon5 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView5 = new ImageView(labelicon5);
        labeliconView5.setFitWidth(45);
        labeliconView5.setFitHeight(60);
        labeliconView5.setPreserveRatio(true);

        Label lb6 = new Label("Local ID Accepted");
        lb6.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon6 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView6 = new ImageView(labelicon6);
        labeliconView6.setFitWidth(45);
        labeliconView6.setFitHeight(60);
        labeliconView6.setPreserveRatio(true);

        HBox labelBox3 = new HBox(20, labeliconView5, lb5, labeliconView6, lb6);
        HBox hb3 = new HBox(10, hotelimgView3, roomView3);

        Button btn3hrs3 = new Button("3 Hr not Available");
        //btn3hrs3.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn3hrs3.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        Button btn6hrs3 = new Button("6 Hr $7689");
        btn3hrs3.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        //btn6hrs3.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        Button btn12hrs3 = new Button("12 Hr Not Available");
        btn12hrs3.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

        HBox buttonBox3 = new HBox(20, btn3hrs3, btn6hrs3, btn12hrs3);

        Image hotelimg4 = new Image("hr_images/JW.jpg");
        ImageView hotelimgView4 = new ImageView(hotelimg4);
        hotelimgView4.setFitWidth(500);
        hotelimgView4.setFitHeight(300);
        hotelimgView4.setPreserveRatio(true);

        Image roomimg4 = new Image("hr_images/JWroom.jpg");
        ImageView roomView4 = new ImageView(roomimg4);
        roomView4.setFitWidth(500);
        roomView4.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb4 = new Label("JW Marrriot Hotel Bengluru Prestige Golfshire Resort");
        namelb4.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb7 = new Label("Couple friendly");
        lb7.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon7 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView7 = new ImageView(labelicon7);
        labeliconView7.setFitWidth(45);
        labeliconView7.setFitHeight(60);
        labeliconView7.setPreserveRatio(true);

        Label lb8 = new Label("Local ID Accepted");
        lb8.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon8 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView8 = new ImageView(labelicon8);
        labeliconView8.setFitWidth(45);
        labeliconView8.setFitHeight(60);
        labeliconView8.setPreserveRatio(true);

        HBox labelBox4 = new HBox(20, labeliconView7, lb7, labeliconView8, lb8);
        HBox hb4 = new HBox(10, hotelimgView4, roomView4);

        Button btn3hrs4 = new Button("3 Hr $2999");
        btn3hrs4.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs4.setOnAction(e -> showBookingDialog());

        Button btn6hrs4 = new Button("6 Hr Not Available");
        btn6hrs4.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        Button btn12hrs4 = new Button("12 Hr 12678");
        btn12hrs4.setStyle("-fx-font-size: 20;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

        HBox buttonBox4 = new HBox(20, btn3hrs4, btn6hrs4, btn12hrs4);

        
        GridPane gridPane = new GridPane();
        gridPane.add(hb1, 0, 0);
        gridPane.add(namelb, 0, 1);
        gridPane.add(labelBox, 0, 2);
        gridPane.add(buttonBox, 0, 3);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-border-color:BLACK; -fx-border-width:8; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");
        
        GridPane gridPane2 = new GridPane();
        gridPane2.add(hb2, 0, 0);
        gridPane2.add(namelb2, 0, 1);
        gridPane2.add(labelBox2, 0, 2);
        gridPane2.add(buttonBox2, 0, 3);
        gridPane2.setAlignment(Pos.CENTER);
        gridPane2.setStyle("-fx-border-color:BLACK; -fx-border-width:8; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        GridPane gridPane3 = new GridPane();
        gridPane3.add(hb3, 0, 0);
        gridPane3.add(namelb3, 0, 1);
        gridPane3.add(labelBox3, 0, 2);
        gridPane3.add(buttonBox3, 0, 3);
        gridPane3.setAlignment(Pos.CENTER);
        gridPane3.setStyle("-fx-border-color:BLACK; -fx-border-width:8; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        GridPane gridPane4 = new GridPane();
        gridPane4.add(hb4, 0, 0);
        gridPane4.add(namelb4, 0, 1);
        gridPane4.add(labelBox4, 0, 2);
        gridPane4.add(buttonBox4, 0, 3);
        gridPane4.setAlignment(Pos.CENTER);
        gridPane4.setStyle("-fx-border-color:BLACK; -fx-border-width:8; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        
        // Add more hotels in the similar way

        Button backButton = new Button("Back");
        backButton.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        backButton.setOnAction(e -> {
            hourlyStay1 hourlyStay = new hourlyStay1(primaryStage);
            try {
                hourlyStay.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        
        HBox backhb = new HBox(10, backButton);
        backhb.setAlignment(Pos.TOP_LEFT);
        
        VBox vb = new VBox(10, backhb, gridPane,gridPane2,gridPane3,gridPane4);
        vb.setAlignment(Pos.TOP_CENTER);
        
        ScrollPane scrollPane = new ScrollPane(vb);
        scrollPane.setFitToWidth(true);
        
        Scene scene = new Scene(scrollPane, 1100, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showBookingDialog() {
        Alert bookingDialog = new Alert(AlertType.CONFIRMATION);
        bookingDialog.setTitle("Booking Confirmation");
        bookingDialog.setHeaderText("Confirm your booking");
        bookingDialog.setContentText("Do you want to book this hotel for 3 hours?");

        Button bookButton = new Button("Book");
        bookButton.setStyle("-fx-text-fill:BLACK;-fx-font-weight:bold; -fx-font-size:30");
        bookButton.setOnAction(e -> {
        bookingDialog.close();
        showSuccessMessage();
    });

    HBox dialogContent = new HBox(10, bookButton);
    dialogContent.setAlignment(Pos.CENTER);
    bookingDialog.getDialogPane().setContent(dialogContent);
    bookingDialog.showAndWait();
    }

    private void showSuccessMessage() {
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Booking Success");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Hotel is booked successfully!");
        successAlert.showAndWait();
    }*/
        Image hotelimg = new Image("hr_images/hyattcentric.jpeg.jpg");
        ImageView hotelimgView = new ImageView(hotelimg);
        hotelimgView.setFitWidth(500);
        hotelimgView.setFitHeight(300);
        hotelimgView.setPreserveRatio(true);

        Image roomimg = new Image("hr_images/Hayyt_img1.jpg");
        ImageView roomView = new ImageView(roomimg);
        roomView.setFitWidth(500);
        roomView.setFitHeight(300);

        Label namelb = new Label("Hyatt Concentric-MG Road");
        namelb.setStyle("-fx-font-weight:bold;-fx-font-size:30;");
        
        Label lb1 = new Label("Couple friendly");
        lb1.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon = new Image("hr_images/correct_icon.png");
        ImageView labeliconView = new ImageView(labelicon);
        labeliconView.setFitWidth(45);
        labeliconView.setFitHeight(60);
        labeliconView.setPreserveRatio(true);
        
        Label lb2 = new Label("Local ID Accepted");
        lb2.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon2 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView2 = new ImageView(labelicon2);
        labeliconView2.setFitWidth(45);
        labeliconView2.setFitHeight(60);
        labeliconView2.setPreserveRatio(true);
        
        HBox labelBox = new HBox(20, labeliconView, lb1, labeliconView2, lb2);
        
        HBox hb1 = new HBox(10, hotelimgView, roomView);
        
        Button btn3hrs = new Button("3 Hr Rs350");
        btn3hrs.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs.setOnAction(e -> showBookingDialog());
        
        Button btn6hrs = new Button("6 Hr Rs500");
        //btn6hrs.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn6hrs.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn6hrs.setOnAction(e -> showBookingDialog());
        Button btn12hrs = new Button("12 Hr Not available");
        //btn12hrs.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn12hrs.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        
        HBox buttonBox = new HBox(20, btn3hrs, btn6hrs, btn12hrs);

        Image hotelimg2 = new Image("hr_images/leelapalace.jpg");
        ImageView hotelimgView2 = new ImageView(hotelimg2);
        hotelimgView2.setFitWidth(500);
        hotelimgView2.setFitHeight(300);
        hotelimgView2.setPreserveRatio(true);

        Image roomimg2 = new Image("hr_images/leelaroom2.jpg");
        ImageView roomView2 = new ImageView(roomimg2);
        roomView2.setFitWidth(500);
        roomView2.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb2 = new Label("The Leela Palace Bangluru");
        namelb2.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb3 = new Label("Couple friendly");
        lb3.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon3 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView3 = new ImageView(labelicon3);
        labeliconView3.setFitWidth(45);
        labeliconView3.setFitHeight(60);
        labeliconView3.setPreserveRatio(true);

        Label lb4 = new Label("Local ID Accepted");
        lb4.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon4 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView4 = new ImageView(labelicon4);
        labeliconView4.setFitWidth(45);
        labeliconView4.setFitHeight(60);
        labeliconView4.setPreserveRatio(true);

        HBox labelBox2 = new HBox(20, labeliconView3, lb3, labeliconView4, lb4);
        HBox hb2 = new HBox(10, hotelimgView2, roomView2);

        Button btn3hrs2 = new Button("3 Hr Rs499");
        btn3hrs2.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs2.setOnAction(e -> showBookingDialog());

        Button btn6hrs2 = new Button("6 Hr Rs675");
        btn6hrs2.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn6hrs2.setOnAction(e -> showBookingDialog());
        Button btn12hrs2 = new Button("12 Hr Rs1099");
        btn12hrs2.setStyle("-fx-font-size: 20;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");

        btn12hrs2.setOnAction(e -> showBookingDialog());
        HBox buttonBox2 = new HBox(20, btn3hrs2, btn6hrs2, btn12hrs2);

        Image hotelimg3 = new Image("hr_images/westend.jpg");
        ImageView hotelimgView3 = new ImageView(hotelimg3);
        hotelimgView3.setFitWidth(500);
        hotelimgView3.setFitHeight(300);
        hotelimgView3.setPreserveRatio(true);

        Image roomimg3 = new Image("hr_images/wetend_room.jpg");
        ImageView roomView3 = new ImageView(roomimg3);
        roomView3.setFitWidth(500);
        roomView3.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb3 = new Label("Taj West End Hotel Bengluru");
        namelb3.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb5 = new Label("Couple friendly");
        lb5.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon5 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView5 = new ImageView(labelicon5);
        labeliconView5.setFitWidth(45);
        labeliconView5.setFitHeight(60);
        labeliconView5.setPreserveRatio(true);

        Label lb6 = new Label("Local ID Accepted");
        lb6.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon6 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView6 = new ImageView(labelicon6);
        labeliconView6.setFitWidth(45);
        labeliconView6.setFitHeight(60);
        labeliconView6.setPreserveRatio(true);

        HBox labelBox3 = new HBox(20, labeliconView5, lb5, labeliconView6, lb6);
        HBox hb3 = new HBox(10, hotelimgView3, roomView3);

        Button btn3hrs3 = new Button("3 Hr not Available");
        //btn3hrs3.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        btn3hrs3.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        Button btn6hrs3 = new Button("6 Hr Rs700");
        btn6hrs3.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn6hrs3.setOnAction(e -> showBookingDialog());
        //btn6hrs3.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        Button btn12hrs3 = new Button("12Hr Rs1233");
        btn12hrs3.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn12hrs3.setOnAction(e -> showBookingDialog());
        HBox buttonBox3 = new HBox(20, btn3hrs3, btn6hrs3, btn12hrs3);

        Image hotelimg4 = new Image("hr_images/JW.jpg");
        ImageView hotelimgView4 = new ImageView(hotelimg4);
        hotelimgView4.setFitWidth(500);
        hotelimgView4.setFitHeight(300);
        hotelimgView4.setPreserveRatio(true);

        Image roomimg4 = new Image("hr_images/JWroom.jpg");
        ImageView roomView4 = new ImageView(roomimg4);
        roomView4.setFitWidth(500);
        roomView4.setFitHeight(300);
        // roomView.setPreserveRatio(true);

        Label namelb4 = new Label("JW Marrriot Hotel Bengluru Prestige Golfshire Resort");
        namelb4.setStyle("-fx-font-weight:bold;-fx-font-size:30;");

        Label lb7 = new Label("Couple friendly");
        lb7.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon7 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView7 = new ImageView(labelicon7);
        labeliconView7.setFitWidth(45);
        labeliconView7.setFitHeight(60);
        labeliconView7.setPreserveRatio(true);

        Label lb8 = new Label("Local ID Accepted");
        lb8.setStyle("-fx-text-fill:GREEN;-fx-font-weight:bold; -fx-font-size:25");
        Image labelicon8 = new Image("hr_images/correct_icon.png");
        ImageView labeliconView8 = new ImageView(labelicon8);
        labeliconView8.setFitWidth(45);
        labeliconView8.setFitHeight(60);
        labeliconView8.setPreserveRatio(true);

        HBox labelBox4 = new HBox(20, labeliconView7, lb7, labeliconView8, lb8);
        HBox hb4 = new HBox(10, hotelimgView4, roomView4);

        Button btn3hrs4 = new Button("3 Hr Rs300");
        btn3hrs4.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn3hrs4.setOnAction(e -> showBookingDialog());

        Button btn6hrs4 = new Button("6 Hr Not Available");
        btn6hrs4.setStyle("-fx-font-size: 20;-fx-pref-width:200;-fx-min-height: 60;-fx-background-radius: 70;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn6hrs4.setOnAction(e -> showBookingDialog());
        Button btn12hrs4 = new Button("12 Hr Rs1000");
        btn12hrs4.setStyle("-fx-font-size: 20;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #2196F3; -fx-text-fill:#FFFFFF");
        btn12hrs4.setOnAction(e -> showBookingDialog());
        HBox buttonBox4 = new HBox(20, btn3hrs4, btn6hrs4, btn12hrs4);

        
        GridPane gridPane = new GridPane();
        gridPane.add(hb1, 0, 0);
        gridPane.add(namelb, 0, 1);
        gridPane.add(labelBox, 0, 2);
        gridPane.add(buttonBox, 0, 3);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setStyle("-fx-border-color:BLACK; -fx-border-width:6; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");
        
        GridPane gridPane2 = new GridPane();
        gridPane2.add(hb2, 0, 0);
        gridPane2.add(namelb2, 0, 1);
        gridPane2.add(labelBox2, 0, 2);
        gridPane2.add(buttonBox2, 0, 3);
        gridPane2.setAlignment(Pos.CENTER);
        gridPane2.setStyle("-fx-border-color:BLACK; -fx-border-width:6; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        GridPane gridPane3 = new GridPane();
        gridPane3.add(hb3, 0, 0);
        gridPane3.add(namelb3, 0, 1);
        gridPane3.add(labelBox3, 0, 2);
        gridPane3.add(buttonBox3, 0, 3);
        gridPane3.setAlignment(Pos.CENTER);
        gridPane3.setStyle("-fx-border-color:BLACK; -fx-border-width:6; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        GridPane gridPane4 = new GridPane();
        gridPane4.add(hb4, 0, 0);
        gridPane4.add(namelb4, 0, 1);
        gridPane4.add(labelBox4, 0, 2);
        gridPane4.add(buttonBox4, 0, 3);
        gridPane4.setAlignment(Pos.CENTER);
        gridPane4.setStyle("-fx-border-color:BLACK; -fx-border-width:6; -fx-border-radius: 20; -fx-background-radius: 20; -fx-padding: 20;");

        
        // Add more hotels in the similar way

        Button backButton = new Button("Back");
        backButton.setStyle("-fx-font-size: 20; -fx-padding: 10;");
        backButton.setOnAction(e -> {
            hourlyStay1 hourlyStay = new hourlyStay1(primaryStage);
            hourlyStay.start();
        });
        
        HBox backhb = new HBox(10, backButton);
        backhb.setAlignment(Pos.TOP_LEFT);
        
        VBox vb = new VBox(10, backhb, gridPane,gridPane2,gridPane3,gridPane4);
        vb.setAlignment(Pos.TOP_CENTER);
        
        ScrollPane scrollPane = new ScrollPane(vb);
        scrollPane.setFitToWidth(true);
        
        Scene scene = new Scene(scrollPane, 1100, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void showBookingDialog() {
        Alert bookingDialog = new Alert(AlertType.CONFIRMATION);
        bookingDialog.setTitle("Booking Confirmation");
        bookingDialog.setHeaderText("Confirm your booking");
        bookingDialog.setContentText("Do you want to book this hotel for 3 hours?");

        Button bookButton = new Button("Book");
        bookButton.setStyle("-fx-text-fill:BLACK;-fx-font-weight:bold; -fx-font-size:30");
        bookButton.setOnAction(e -> {
        bookingDialog.close();
        showSuccessMessage();
    });

    HBox dialogContent = new HBox(10, bookButton);
    dialogContent.setAlignment(Pos.CENTER);
    bookingDialog.getDialogPane().setContent(dialogContent);
    bookingDialog.showAndWait();
    }

    private void showSuccessMessage() {
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Booking Success");
        successAlert.setHeaderText(null);
        successAlert.setContentText("Hotel is booked successfully!");
        successAlert.showAndWait();
    }
}