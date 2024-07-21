package com.firestore.Hotel;


import java.util.ArrayList;
import java.util.List;

import com.firestore.Flights.hotelMainPage;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HotelInfo1  {

    private Stage primaryStage;

    public HotelInfo1(Stage stage){
        this.primaryStage = stage;
    }

    private List<Image> images = new ArrayList<>();
    private int currentIndex = 0;
    private ImageView imageView = new ImageView();

    private int numAdults = 1; 
    private int numRooms = 1;

    public void start() {
        loadImages();
        if (images.isEmpty()) {
            System.err.println("No images found.");
            return;
        }
        imageView.setImage(images.get(currentIndex));
        imageView.setFitWidth(700);
        imageView.setFitHeight(550);
        imageView.setLayoutX(200);
        imageView.setLayoutY(400);
        imageView.setPreserveRatio(true);

        Button backbtn = new Button("<<");
        backbtn.setStyle("-fx-font-size:20;-fx-background-color : #B2D3C2;-fx-text-fill:#4C0121;-fx-font-weight: bold;");

        backbtn.setOnAction(e -> {
            hotelMainPage hmp = new hotelMainPage(primaryStage);
            hmp.start();
        });

        Label adultsLabel = new Label("Adults: " + numAdults);
        adultsLabel.setStyle("-fx-text-fill:Blue; -fx-font-weight:bold; -fx-font-size:25");

        Button incAdultsButton = new Button("+");
        incAdultsButton.setStyle("-fx-font-size:20");

        Button decAdultsButton = new Button("-");
        decAdultsButton.setStyle("-fx-font-size:20");

        incAdultsButton.setOnAction(event -> {
            try {
                if (numAdults >= 8) {
                    throw new LimitExceededException("Adults count cannot exceed than 8");
                }
                numAdults++;
                adultsLabel.setText("Adults: " + numAdults);
            } catch (LimitExceededException e) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Limit Exceeded");
                alert.setHeaderText(null);
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
        });

        decAdultsButton.setOnAction(event -> {
            if (numAdults > 1) {
                numAdults--;
                adultsLabel.setText("Adults: " + numAdults);
            }
        });

        HBox adultsBox = new HBox(10, decAdultsButton, adultsLabel, incAdultsButton);

        Label roomsLabel = new Label("Rooms: " + numRooms);
        roomsLabel.setStyle("-fx-text-fill:Blue; -fx-font-weight:bold; -fx-font-size:25");
        
        Button incRoomsButton = new Button("+");
        incRoomsButton.setStyle("-fx-font-size:20");
        
        Button decRoomsButton = new Button("-");
        decRoomsButton.setStyle("-fx-font-size:20");

        incRoomsButton.setOnAction(event -> {
            try {
                if (numRooms >= 4) {
                    throw new LimitExceededException("You can't book rooms greater than 4");
                }
                numRooms++;
                roomsLabel.setText("Rooms: " + numRooms);
            } catch (LimitExceededException e) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Limit Exceeded");
                alert.setHeaderText(null);
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
        });

        decRoomsButton.setOnAction(event -> {
            if (numRooms > 1) {
                numRooms--;
                roomsLabel.setText("Rooms: " + numRooms);
            }
        });

        HBox roomsBox = new HBox(10, decRoomsButton, roomsLabel, incRoomsButton);

        Button pricebtn = new Button("Total Price");
        pricebtn.setFont(new Font(20));
        pricebtn.setAlignment(Pos.CENTER);
        pricebtn.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:30");


        Label priceLabel = new Label();
        priceLabel.setFont(new Font(25));
        priceLabel.setStyle("-fx-text-fill:Red; -fx-font-weight:bold; -fx-font-size:25");

        pricebtn.setOnAction(event -> {
            double price = calculatePrice(numAdults, numRooms);
            priceLabel.setText("Total Price: $" + price);
        });

        Button bookbtn = new Button("Book Now & Pay");
        bookbtn.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:30");
        bookbtn.setOnAction(e -> showBookingDialog());
        bookbtn.setMaxWidth(500);
        bookbtn.setMaxHeight(250);

        Label lb1 = new Label("Interior of Intercontinental");
        lb1.setFont(new Font(30));
        lb1.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:30");

        Label speciallb = new Label("Special Attraction");
        speciallb.setStyle("-fx-text-fill:Red; -fx-font-weight:bold; -fx-font-size:30");

        Label aboutHotel = new Label("About the Hotel");
        aboutHotel.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:30");

        Label amenititieslb = new Label("Amenities at Hotel Intercontinental");
        amenititieslb.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:30");


        /*Image locationImage = new Image("");
        ImageView locationView = new ImageView(locationImage);
        locationView.setFitWidth(950);
        locationView.setFitHeight(450);
        locationView.setPreserveRatio(true);*/

        Label wifi = new Label("WiFi in lobby");
        wifi.setFont(new Font(30));
        Image wifiicon = new Image("Icons/wifi2.jpg");
        ImageView wifiiconView = new ImageView(wifiicon);
        wifiiconView.setFitWidth(60);
        wifiiconView.setFitHeight(100);
        wifiiconView.setPreserveRatio(true);
        HBox wificonnectionBox = new HBox(15,wifiiconView,wifi);

        
        Label pool = new Label("Swimming Pool");
        pool.setFont(new Font(30));
        Image poolicon = new Image("Icons/pool.jpg");
        ImageView pooliconView = new ImageView(poolicon);
        pooliconView.setFitWidth(60);
        pooliconView.setFitHeight(100);
        pooliconView.setPreserveRatio(true);
        HBox poolBox = new HBox(15,pooliconView,pool);

        Label parking = new Label("Parking");
        parking.setFont(new Font(30));
        Image parkingicon = new Image("Icons/parking.jpg");
        ImageView parkingiconView = new ImageView(parkingicon);
        parkingiconView.setFitWidth(60);
        parkingiconView.setFitHeight(100);
        parkingiconView.setPreserveRatio(true);
        HBox parkingBox = new HBox(15,parkingiconView,parking);
        
        
        Label barlb = new Label("Welcome drink");
        barlb.setFont(new Font(30));
        Image barImage = new Image("Icons/welcome.jpg");
        ImageView barImageView = new ImageView(barImage);
        barImageView.setFitWidth(60);
        barImageView.setFitHeight(100);
        barImageView.setPreserveRatio(true);
        HBox BarBox = new HBox(15,barImageView,barlb);
        
        VBox vbicon = new VBox(10,wificonnectionBox,poolBox,parkingBox,BarBox);

        Label spa = new Label("Spa");
        spa.setFont(new Font(30));
        Image spaicon = new Image("Icons/Spa.jpg");
        ImageView spaiconView = new ImageView(spaicon);
        spaiconView.setFitWidth(60);
        spaiconView.setFitHeight(100);
        spaiconView.setPreserveRatio(true);
        HBox spaBox = new HBox(5,spaiconView,spa);

        Label bar = new Label("Gym");
        bar.setFont(new Font(30));
        Image baricon = new Image("Icons/gym.jpg");
        ImageView bariconView = new ImageView(baricon);
        bariconView.setFitWidth(60);
        bariconView.setFitHeight(100);
        bariconView.setPreserveRatio(true);
        HBox barBox = new HBox(15,bariconView,bar);

        Label kidsplayarea = new Label("Kids Play Area");
        kidsplayarea.setFont(new Font(30));
        Image kidsplayareaicon = new Image("Icons/Playarea.jpg");
        ImageView kidsplayareaiconView = new ImageView(kidsplayareaicon);
        kidsplayareaiconView.setFitWidth(60);
        kidsplayareaiconView.setFitHeight(100);
        kidsplayareaiconView.setPreserveRatio(true);
        HBox kidsBox = new HBox(15,kidsplayareaiconView,kidsplayarea);
       
        Label restolb = new Label("Restaurant");
        restolb.setFont(new Font(30));
        Image restoImage = new Image("Icons/Restaurant.png");
        ImageView restoImageView = new ImageView(restoImage);
        restoImageView.setFitWidth(60);
        restoImageView.setFitHeight(100);
        restoImageView.setPreserveRatio(true);
        HBox restoBox = new HBox(15,restoImageView,restolb);
         
        
        VBox vb3 = new VBox(10,spaBox,barBox,kidsBox,restoBox);

       
        HBox hb = new HBox(40,vbicon,vb3);
        hb.setLayoutX(10);
        hb.setLayoutY(550);

        HBox hb2 = new HBox(30,adultsBox,roomsBox,pricebtn,priceLabel);
        //hb2.setStyle("-fx-background-color : rgba(0, 0, 0, 0.5)");
        hb2.setStyle("-fx-background-color : #FA8128");

        VBox vb1 = new VBox(30,adultsBox,roomsBox,pricebtn,priceLabel,bookbtn);
        vb1.setPadding(new Insets(40, 20, 20, 100));
        //vb1.setStyle("-fx-background-color :E5E8E8");//#99EDC3

        VBox vb2 = new VBox(20,speciallb,hb);
        vb2.setAlignment(Pos.CENTER);
        //vb2.setStyle("-fx-background-color :#E5E8E8");

        HBox hb1 = new HBox(20,backbtn,imageView,vb2,vb1);
        hb1.setLayoutX(100);
        hb1.setLayoutY(500);

        VBox slideshowVBox = new VBox(35, hb2, hb1);

        // Create Tabs
        TabPane tabPane = new TabPane();

        VBox vboxTab1 = new VBox();
        Label labelTab1 = new Label("1. Location:\n"+" Conveniently located in the heart of the city, providing easy access to major attractions.\n\n"
                + "2. Architecture:\n"+" An architectural marvel blending modern design with classic elegance.\n\n"
                + "3. Accommodation:\n"+"Spacious rooms and suites with stunning city views, modern amenities, and plush furnishings.\n\n"
                + "4. Dining:\n"+" Award-winning cuisines at our multiple on-site restaurants, offering a variety of international and local dishes.\n\n"
                + "5. Wellness:\n"+ "A wellness retreat featuring a spa, fitness center, and yoga sessions to rejuvenate your body and mind.\n\n"
                + "6. Events:\n"+ "State-of-the-art conference rooms and banquet halls for business meetings, weddings, and other events.\n\n"
                + "7. Service:\n"+ "Exceptional customer service with a dedicated concierge team ready to assist with any request.\n\n"
                + "8. Special Attractions:\n"+ "Unique experiences and exclusive offers for our guests, making every stay memorable.\n\n"
        );
        labelTab1.setStyle("-fx-text-fill:PURPLE; -fx-font-weight:bold; -fx-font-size:20");
        vboxTab1.getChildren().add(labelTab1);

        VBox vboxTb2 = new VBox();
        Label labelTb2 = new Label("Sahara is an architectural marvel, suitcase property with wellness retreat,award-winning cuisines and much more.\n"+"Welcome to the Sahara Hotel, where luxury meets comfort. Our hotel offers the following features:");
        labelTb2.setStyle("-fx-text-fill:BLUE; -fx-font-weight:bold; -fx-font-size:30");
        vboxTb2.getChildren().add(labelTb2);

        VBox vb4 = new VBox(15,vboxTb2,vboxTab1);

        Tab tab1 = new Tab("About the Hotel", vb4);
        tab1.setStyle("-fx-text-fill:#FA8128;-fx-pref-width:170;-fx-min-height: 45;-fx-background-radius:55; -fx-font-weight:bold;-fx-background-color : #99EDC3; -fx-font-size:20;");
        //tab1.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:20");
        tab1.setClosable(false);


        HBox hboxTab2 = new HBox();
        Label popularTab2 = new Label("Popular Amenities");
        popularTab2.setStyle("-fx-text-fill:GREEN; -fx-font-weight:bold; -fx-font-size:30");
        hboxTab2.getChildren().add(popularTab2);

        Label pool1 = new Label("Swimming Pool");
        pool1.setFont(new Font(20));
        Image poolicon1 = new Image("Icons/Spool.png");
        ImageView pooliconView1 = new ImageView(poolicon1);
        pooliconView1.setFitWidth(60);
        pooliconView1.setFitHeight(100);
        pooliconView1.setPreserveRatio(true);
        //HBox poolBox1 = new HBox(15,pooliconView,pool);

        Label restolb1 = new Label("Restaurant");
        restolb1.setFont(new Font(20));
        Image restoImage1 = new Image("Icons/Restaurant.png");
        ImageView restoImageView1 = new ImageView(restoImage1);
        restoImageView1.setFitWidth(60);
        restoImageView1.setFitHeight(100);
        restoImageView1.setPreserveRatio(true);

        Label servicelb = new Label("24-hour Room Service");
        servicelb.setFont(new Font(20));
        Image serviceImage = new Image("Icons/service.png");
        ImageView serviceImageView = new ImageView(serviceImage);
        serviceImageView.setFitWidth(60);
        serviceImageView.setFitHeight(100);
        serviceImageView.setPreserveRatio(true);

        Label barlb1 = new Label("Bar");
        barlb1.setFont(new Font(20));
        Image barImage1 = new Image("Icons/bar1.png");
        ImageView barImageView1 = new ImageView(barImage1);
        barImageView1.setFitWidth(60);
        barImageView1.setFitHeight(100);
        barImageView1.setPreserveRatio(true);

        VBox hboxTab3 = new VBox();
        Label popularTab3 = new Label("Basic Facilities :-");
        popularTab3.setStyle("-fx-text-fill:BLUE; -fx-font-weight:bold; -fx-font-size:30");
        hboxTab3.getChildren().add(popularTab3);

        HBox amenitieshb = new HBox(10,pooliconView1,pool1,restoImageView1,restolb1,serviceImageView,servicelb,barImageView1,barlb1);

        VBox hboxTab4 = new VBox();
        Label facilitieslb = new Label("Housekeeping \n"+"Attached Bathroom\n"+"Private Entrance\n"+"Telephone\n"+"Free Wi-Fi \n"+"Dry Cleaning Service\n"+"Refrigerator\n"+"Public Restrooms\n"+"Free Parking");
        facilitieslb.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:20");
        hboxTab4.getChildren().add(facilitieslb);

        VBox hboxTab5 = new VBox();
        Label safetyTab5 = new Label("Safety and Security :-");
        safetyTab5.setStyle("-fx-text-fill:BLUE; -fx-font-weight:bold; -fx-font-size:30");
        hboxTab5.getChildren().add(safetyTab5);

        VBox vbTab5 = new VBox();
        Label safetyTab6 = new Label("24-hour Security \n"+"Emergency Exit\n"+"Map\n"+"Fire Extinguishers\n"+"Security Alarams\n"+"CCTV");
        safetyTab6.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:25");
        vbTab5.getChildren().add(safetyTab6);

        VBox vbTab6 = new VBox();
        Label healthTab = new Label("General Services:-");
        healthTab.setStyle("-fx-text-fill:BLUE; -fx-font-weight:bold; -fx-font-size:30");
        vbTab6.getChildren().add(healthTab);

        VBox vbTab7 = new VBox();
        Label healthTab6 = new Label("Ticket/Tour Assistance \n"+"Medical Centre\n"+"Multilingual Staff\n" +"Doctor on Call\n"+"Pool/ Beach towels \n"+"Facilities for Guests with Disabilities \n"+"Outdoor Sports \n");
        healthTab6.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:25");
        vbTab7.getChildren().add(healthTab6);


        HBox newhb = new HBox(10,hboxTab2,amenitieshb);
        HBox hb6 = new HBox(20,hboxTab3,hboxTab4,hboxTab5,vbTab5,vbTab6,vbTab7);
        VBox vb7 = new VBox(newhb,hb6);
        //VBox vbTab2 = new VBox(10,hboxTab2,amenitieshb,hboxTab3,hboxTab4,hboxTab5);

        //VBox vbTab3 = new VBox(10,hboxTab5);

        Tab tab2 = new Tab("Amenities", vb7);
        tab2.setStyle("-fx-text-fill:#FA8128;-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15; -fx-font-weight:bold;-fx-background-color :#99EDC3; -fx-font-size:20;");
        //tab2.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:20");
        tab2.setClosable(false);

        Label privacylb = new Label("Aadhar Card,Passport and Driving License are accepted as ID proofs \n");
        privacylb.setStyle("-fx-text-fill:#67032F; -fx-font-weight:bold; -fx-font-size:30");
        privacylb.setFont(new Font(20));
        Image privacyImage = new Image("Icons/CorrectIcon.jpg");
        ImageView privacyImageView = new ImageView(privacyImage);
        privacyImageView.setFitWidth(40);
        privacyImageView.setFitHeight(60);
        privacyImageView.setPreserveRatio(true);

        Label privacylb1 = new Label("Pets are not Allowed");
        privacylb1.setStyle("-fx-text-fill:#67032F; -fx-font-weight:bold; -fx-font-size:30");
        privacylb1.setFont(new Font(20));
        Image privacyImage1 = new Image("Icons/CorrectIcon.jpg");
        ImageView privacyImageView1 = new ImageView(privacyImage1);
        privacyImageView1.setFitWidth(40);
        privacyImageView1.setFitHeight(60);
        privacyImageView1.setPreserveRatio(true);

        Label privacylb2 = new Label("Outside food is Not Allowed");
        privacylb2.setStyle("-fx-text-fill:#67032F; -fx-font-weight:bold; -fx-font-size:30");
        privacylb2.setFont(new Font(20));
        Image privacyImage2 = new Image("Icons/CorrectIcon.jpg");
        ImageView privacyImageView2 = new ImageView(privacyImage2);
        privacyImageView2.setFitWidth(40);
        privacyImageView2.setFitHeight(60);
        privacyImageView2.setPreserveRatio(true);

        Label privacylb3 = new Label("Guest below 18 years of age are not allowed at the property");
        privacylb3.setStyle("-fx-text-fill:#67032F; -fx-font-weight:bold; -fx-font-size:30");
        privacylb3.setFont(new Font(20));
        Image privacyImage3 = new Image("Icons/CorrectIcon.jpg");
        ImageView privacyImageView3 = new ImageView(privacyImage3);
        privacyImageView3.setFitWidth(40);
        privacyImageView3.setFitHeight(60);
        privacyImageView3.setPreserveRatio(true);

        HBox hb8 = new HBox(15,privacyImageView,privacylb);
        HBox hb9 = new HBox(15,privacyImageView1,privacylb1);
        HBox hb10 = new HBox(15,privacyImageView2,privacylb2);
        HBox hb11 = new HBox(15,privacyImageView3,privacylb3);

        HBox hB1 = new HBox();
        Label privlb1 = new Label("Check-In Time:- 2PM");
        privlb1.setStyle("-fx-text-fill:Green; -fx-font-weight:bold; -fx-font-size:30");

        hB1.getChildren().add(privlb1);

        HBox hB2 = new HBox();
        Label privlb2 = new Label("Check-out Time:- 12PM");
        privlb2.setStyle("-fx-text-fill:Green; -fx-font-weight:bold; -fx-font-size:30");

        hB2.getChildren().add(privlb2);

        VBox HB1 = new VBox(15,hB1,hB2,hb8,hb9,hb10,hb11);
        HB1.setLayoutX(100);
        HB1.setLayoutY(200);

        Tab tab3 = new Tab("Property Policies",HB1);
        tab3.setStyle("-fx-text-fill:#D7FF87;-fx-pref-width:180;-fx-min-height: 40;-fx-background-radius: 45; -fx-font-weight:bold;-fx-background-color :#99EDC3; -fx-font-size:20;");
        //tab3.setStyle("-fx-text-fill:WHITE; -fx-font-weight:bold; -fx-font-size:20");
        tab3.setClosable(false);

        VBox vboxTab4 = new VBox();
        Label labelTab4 = new Label();
        labelTab4.setStyle("-fx-text-fill:PURPLE; -fx-font-weight:bold; -fx-font-size:20");
        vboxTab4.getChildren().add(labelTab4);

        Tab tab4 = new Tab("Reviews and Rating", vboxTab4);
        tab4.setStyle("-fx-text-fill:WHITE;-fx-pref-width:200;-fx-min-height:60;-fx-background-radius:85; -fx-font-weight:bold;-fx-background-color :#99EDC3; -fx-font-size:20;");//#D7FF87
        
        //tab4.setStyle("-fx-text-fill:BLACK; -fx-font-weight:bold; -fx-font-size:20");
        tab4.setClosable(false);

        VBox vboxTab5 = new VBox();
        Label labelTab5 = new Label();
        labelTab5.setStyle("-fx-text-fill:PURPLE; -fx-font-weight:bold; -fx-font-size:20");
        vboxTab5.getChildren().add(labelTab5);

        Tab tab5 = new Tab("Location", vboxTab5);
        tab5.setStyle("-fx-text-fill:WHITE;-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15; -fx-font-weight:bold;-fx-background-color :#99EDC3; -fx-font-size:20;");//#D7FF87
        tab5.setClosable(false);

        tabPane.getTabs().addAll(tab1, tab2,tab3,tab4,tab5);
        tabPane.setStyle("-fx-pref-width:120;-fx-min-height: 30;-fx-background-radius: 15; -fx-text-fill:#FFFFFF");

        //tabPane.setStyle("-fx-background-color:#D3D3D3;");
        VBox mainVBox = new VBox(50, slideshowVBox, tabPane);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(mainVBox);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane, 2000, 1000);
        //scene.setFill(Color.BURLYWOOD);
       
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();

        startSlideshow();
    }

    private void loadImages() {
        images.add(new Image("images/Intercontinental3.jpg"));
        images.add(new Image("images/Intercontinental8.jpg"));
        images.add(new Image("images/Intercontinental4.jpg"));
        images.add(new Image("images/Intercontinental5.jpg"));
    }

    private void startSlideshow() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), event -> {
            currentIndex = (currentIndex + 1) % images.size();
            imageView.setImage(images.get(currentIndex));
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private double calculatePrice(int adults, int rooms) {
        double pricePerRoomPerNight = 10000.0; // Example price per room per night
        double pricePerAdult = 500.0; // Example price per adult
        return (rooms * pricePerRoomPerNight) + (adults * pricePerAdult);
    }

    class LimitExceededException extends Exception {
        public LimitExceededException(String message) {
            super(message);
        }
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