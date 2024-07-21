package com.firestore.Home;

import java.time.LocalDate;

import com.firestore.AboutPage.About_us;
import com.firestore.Flights.hotelMainPage;
import com.firestore.booking.Hotel.hourlyStay1;

import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class homepage {

    private Stage primaryStage;

    public homepage(Stage stage){
        this.primaryStage = stage;
    }

    public void start() {

        Label welcomeLabel = new Label("" );
        welcomeLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        ImageView userIcon = new ImageView(new Image("https://img.icons8.com/?size=24&id=83190&format=png"));
        userIcon.setFitHeight(40);
        userIcon.setFitWidth(40);
       
        HBox userBox = new HBox(10, userIcon, welcomeLabel);
        userBox.setAlignment(Pos.TOP_RIGHT);
        userBox.setStyle("-fx-padding: 10px;");



        /*// Main HBox with the label
        Label label = new Label("Get the Best Price on booking your hotel at BookItNow");
        label.setStyle("-fx-font-weight:bold; -fx-font-size:25; -fx-text-fill:white");
        

        // Small HBox
        HBox smallHBox1 = new HBox(label);
        smallHBox1.setStyle("-fx-background-color:blue");
        smallHBox1.setAlignment(Pos.CENTER);
        smallHBox1.setPrefSize(800, 50);

        Label label2 = new Label("BookItNow");
        label2.setStyle("-fx-font-weight:bold; -fx-font-size:40");

        //icons for buttons
        Image homeIcon = new Image("https://img.icons8.com/?size=30&id=63324&format=png");
        Image boookingIcon = new Image("https://img.icons8.com/?size=30&id=59736&format=png");
        Image contactIcon = new Image("https://img.icons8.com/?size=24&id=88290&format=png");
        Image aboutusIcon = new Image("https://img.icons8.com/?size=24&id=84060&format=png");
        Image flightIcon = new Image("https://img.icons8.com/?size=30&id=60631&format=png");



        ImageView homeIconView = new ImageView(homeIcon);
        ImageView bookingIconView = new ImageView(boookingIcon);
        ImageView aboutusIconView = new ImageView(aboutusIcon);
        ImageView contactIconView = new ImageView(contactIcon);
        ImageView flightIconView = new ImageView(flightIcon);

        Button home = new Button("Home",homeIconView);
        Button booking = new Button("Booking",bookingIconView);
        Button aboutus = new Button("About Us",aboutusIconView);
        Button contact = new Button("Contact",contactIconView);
        Button flight = new Button("Flight",flightIconView); 

        //set style for buttons
        String buttonStyle = "-fx-background-color:lightblue; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size-25;";
        String buttonHoverStyle = "-fx-background-color:orange; -fx-text-fill: white; -fx-font-weight:bold; -fx-font-size:30; -fx-background-radius:30; -fx-padding:10 20 10 20;";

        home.setStyle(buttonStyle);
        booking.setStyle(buttonStyle);
        aboutus.setStyle(buttonStyle);
        contact.setStyle(buttonStyle);
        flight.setStyle(buttonStyle);

        // Set preferred size for buttons
        double buttonWidth = 200;
        double buttonHeight = 50;

        home.setPrefWidth(buttonWidth);
        home.setPrefHeight(buttonHeight);
        booking.setPrefWidth(buttonWidth);
        booking.setPrefHeight(buttonHeight);
        aboutus.setPrefWidth(buttonWidth);
        aboutus.setPrefHeight(buttonHeight);
        contact.setPrefWidth(buttonWidth);
        contact.setPrefHeight(buttonHeight);
        flight.setPrefWidth(buttonWidth);
        flight.setPrefHeight(buttonHeight);

        //add hover effect for buttons
        home.setOnMouseEntered(e -> home.setStyle(buttonHoverStyle));
        home.setOnMouseExited(e -> home.setStyle(buttonStyle));

        booking.setOnMouseEntered(e -> booking.setStyle(buttonHoverStyle));
        booking.setOnMouseExited(e -> booking.setStyle(buttonStyle));

        aboutus.setOnMouseEntered(e -> aboutus.setStyle(buttonHoverStyle));
        aboutus.setOnMouseExited(e -> aboutus.setStyle(buttonStyle));

        contact.setOnMouseEntered(e -> contact.setStyle(buttonHoverStyle));
        contact.setOnMouseExited(e -> contact.setStyle(buttonStyle));

        flight.setOnMouseEntered(e -> flight.setStyle(buttonHoverStyle));
        flight.setOnMouseExited(e -> flight.setStyle(buttonStyle));

        //hbox contains all buttons
        HBox smallHBox2 = new HBox(label2,home,booking,flight,aboutus,contact,userBox);
        smallHBox2.setAlignment(Pos.CENTER_LEFT);
        smallHBox2.setStyle("-fx-background-color:lightgray");
        smallHBox2.setSpacing(50);
        smallHBox2.setPrefSize(800, 75);

        Label destlabel = new Label("Trending destinations");
        destlabel.setStyle("-fx-font-weight:bold; -fx-font-size:35; -fx-text-fill:black");

        Label destLabel2 = new Label("Most popular choices for travellers from India");
        destLabel2.setStyle("-fx-font-size:20; -fx-text-fill:black");

        VBox vb1 = new VBox(destlabel);
        VBox vb2 = new VBox(destLabel2);

        VBox smallHBox3 = new VBox(vb1,vb2);

        VBox vb3 = new VBox(30,smallHBox1,smallHBox3);

        

        Label delhiLabel = new Label("Delhi");
        ImageView delhImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtlAn3XuITd-3TuByHQuRxe3S6xFjLRC84PA&s"));

        VBox vbox1 = new VBox(delhImageView,delhiLabel);

        HBox hBox = new HBox(vbox1);

        // VBox to contain both HBoxes
        VBox vBox = new VBox(smallHBox2,vb3,hBox);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setPrefSize(800, 800);


        Scene homescene = new Scene(vBox, 800, 800);

        // Booking Page
        VBox bookingVBox = new VBox(20);
        bookingVBox.setAlignment(Pos.CENTER);
        Label bookingLabel = new Label("Welcome to the BookItNow");
        bookingLabel.setStyle("-fx-font-weight:bold; -fx-font-size:30; -fx-text-fill:black");
        Button backButton = new Button("Back to Home");

        backButton.setStyle(buttonStyle);
        //backButton.setOnMouseEntered(e -> backButton.setStyle(buttonHoverStyle));
        //backButton.setOnMouseExited(e -> backButton.setStyle(buttonStyle));

        backButton.setOnAction(e -> primaryStage.setScene(homescene));

        HBox hb1 = new HBox(backButton);
        HBox hb2 = new HBox(bookingLabel);
        hb2.setAlignment(Pos.CENTER);


        bookingVBox.getChildren().addAll(hb1,hb2);
        bookingVBox.setAlignment(Pos.TOP_LEFT);

        Scene bookingScene = new Scene(bookingVBox, 800, 800);

        booking.setOnAction(e -> primaryStage.setScene(bookingScene));

        
        primaryStage.setScene(homescene);
        primaryStage.setTitle("Hotel Reservation System");
        primaryStage.getIcons().add(new Image("images/home page icon.jpeg"));
        primaryStage.setX(500);
        primaryStage.setY(300);
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }*/

    // Main HBox with the label
        Label label = new Label("Get the Best Price on booking your hotel at BookItNow");
        label.setStyle("-fx-font-weight:bold; -fx-font-size:25; -fx-text-fill:white");
        
        

        // Small HBox
        HBox smallHBox1 = new HBox(label);
        smallHBox1.setStyle("-fx-background-color:blue");
        smallHBox1.setAlignment(Pos.CENTER);
        smallHBox1.setPrefSize(800, 50);

        Label label2 = new Label("BookItNow");
        label2.setStyle("-fx-font-weight:bold; -fx-font-size:40");

        //icons for buttons
        Image homeIcon = new Image("https://img.icons8.com/?size=30&id=63324&format=png");
        Image boookingIcon = new Image("https://img.icons8.com/?size=30&id=59736&format=png");
        Image contactIcon = new Image("https://img.icons8.com/?size=24&id=88290&format=png");
        Image aboutusIcon = new Image("https://img.icons8.com/?size=24&id=84060&format=png");
        Image flightIcon = new Image("https://img.icons8.com/?size=30&id=60631&format=png");



        ImageView homeIconView = new ImageView(homeIcon);
        ImageView bookingIconView = new ImageView(boookingIcon);
        ImageView aboutusIconView = new ImageView(aboutusIcon);
        ImageView contactIconView = new ImageView(contactIcon);
        ImageView flightIconView = new ImageView(flightIcon);

        Button home = new Button("Home",homeIconView);
        Button booking = new Button("Hourlystay",bookingIconView);
        Button aboutus = new Button("About Us",aboutusIconView);
        Button contact = new Button("Contact",contactIconView);
        Button flight = new Button("Flight",flightIconView); 


        //set style for buttons
        String buttonStyle = "-fx-background-color:lightblue; -fx-text-fill:black; -fx-font-weight:bold; -fx-font-size-25;";
        String buttonHoverStyle = "-fx-background-color:orange; -fx-text-fill: white; -fx-font-weight:bold; -fx-font-size:30; -fx-background-radius:30; -fx-padding:10 20 10 20;";

        home.setStyle(buttonStyle);
        booking.setStyle(buttonStyle);
        aboutus.setStyle(buttonStyle);
        contact.setStyle(buttonStyle);
        flight.setStyle(buttonStyle);

        // Set preferred size for buttons
        double buttonWidth = 200;
        double buttonHeight = 50;

        home.setPrefWidth(buttonWidth);
        home.setPrefHeight(buttonHeight);
        booking.setPrefWidth(buttonWidth);
        booking.setPrefHeight(buttonHeight);
        aboutus.setPrefWidth(buttonWidth);
        aboutus.setPrefHeight(buttonHeight);
        contact.setPrefWidth(buttonWidth);
        contact.setPrefHeight(buttonHeight);
        flight.setPrefWidth(buttonWidth);
        flight.setPrefHeight(buttonHeight);

        //add hover effect for buttons
        home.setOnMouseEntered(e -> home.setStyle(buttonHoverStyle));
        home.setOnMouseExited(e -> home.setStyle(buttonStyle));

        booking.setOnMouseEntered(e -> booking.setStyle(buttonHoverStyle));
        booking.setOnMouseExited(e -> booking.setStyle(buttonStyle));

        aboutus.setOnMouseEntered(e -> aboutus.setStyle(buttonHoverStyle));
        aboutus.setOnMouseExited(e -> aboutus.setStyle(buttonStyle));

        contact.setOnMouseEntered(e -> contact.setStyle(buttonHoverStyle));
        contact.setOnMouseExited(e -> contact.setStyle(buttonStyle));

        flight.setOnMouseEntered(e -> flight.setStyle(buttonHoverStyle));
        flight.setOnMouseExited(e -> flight.setStyle(buttonStyle));

        aboutus.setOnAction(event -> {
            About_us ab = new About_us(primaryStage);
            ab.start();
        });


        //hbox contains all buttons
        HBox smallHBox2 = new HBox(label2,home,booking,flight,aboutus,contact,userBox);
        smallHBox2.setAlignment(Pos.CENTER_LEFT);
        smallHBox2.setStyle("-fx-background-color:lightgray");
        smallHBox2.setSpacing(50);
        smallHBox2.setPrefSize(800, 100);

        Label destlabel = new Label("Trending destinations");
        destlabel.setStyle("-fx-font-weight:bold; -fx-font-size:35; -fx-text-fill:black");

        Label destLabel2 = new Label("Most popular choices for travellers from India");
        destLabel2.setStyle("-fx-font-size:20; -fx-text-fill:black");

        VBox vb1 = new VBox(destlabel);
        VBox vb2 = new VBox(destLabel2);

        VBox smallHBox3 = new VBox(vb1,vb2);

        //VBox vb3 = new VBox(30,smallHBox1,smallHBox3);

        //String buttonStyle1 = " -fx-padding:10 20 10 20;";
        String buttonHoverStyle1 = "-fx-background-radius:20; -fx-padding:10 20 10 20;";

        //delhi 
        Label delhiLabel = new Label("Delhi");
        Label dellbl = new Label("capital of India");
        dellbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        delhiLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView delhImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQtlAn3XuITd-3TuByHQuRxe3S6xFjLRC84PA&s"));
        VBox vbox1 = new VBox(delhImageView,delhiLabel,dellbl);
        vbox1.setAlignment(Pos.CENTER);

        Button delhiButton = new Button("",vbox1);
        delhiButton.setPrefWidth(300);
        delhiButton.setPrefHeight(150);
        delhiButton.setStyle(buttonHoverStyle1);

        //delhiButton.setOnMouseEntered(e -> delhiButton.setStyle(buttonHoverStyle1));
        //delhiButton.setOnMouseExited(e -> delhiButton.setStyle(buttonStyle1));

        //mumbai
        Label mumbaiLabel = new Label("Goa");
        Label mumlbl = new Label(" City of beaches");
        mumbaiLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        mumlbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        ImageView mumbaiImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4HKpSqrY8bH2D-aGDt1D8_3-hpXM7IweB0Q&s"));
        VBox vbox2 = new VBox(mumbaiImageView,mumbaiLabel,mumlbl);
        vbox2.setAlignment(Pos.CENTER);

        Button mumbaiButton = new Button("",vbox2);
        mumbaiButton.setPrefWidth(300);
        mumbaiButton.setPrefHeight(150);
        mumbaiButton.setStyle(buttonHoverStyle1);



        //mumbaiButton.setOnMouseEntered(e -> mumbaiButton.setStyle(buttonHoverStyle1));
        //mumbaiButton.setOnMouseExited(e -> mumbaiButton.setStyle(buttonStyle1));

        //chennai
        Label chennaiLabel = new Label("Chennai");
        Label chennailbl = new Label("southernmost state of India");
        chennailbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        chennaiLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView chennaiImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1EyJz7AGiZHvG2yy_jBDYufpgGYY7vLIpuA&s"));
        VBox vbox3 = new VBox(chennaiImageView,chennaiLabel,chennailbl);
        vbox3.setAlignment(Pos.CENTER);

        Button chennaiButton = new Button("",vbox3);
        chennaiButton.setPrefWidth(300);
        chennaiButton.setPrefHeight(150);

        chennaiButton.setStyle(buttonHoverStyle1);

        //chennaiButton.setOnMouseEntered(e -> chennaiButton.setStyle(buttonHoverStyle1));
        //chennaiButton.setOnMouseExited(e -> chennaiButton.setStyle(buttonStyle1));

        //hydrebad
        Label hydLabel = new Label("Hyderabad");
        Label hydlbl = new Label("glorious city of Nizams");
        hydlbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        hydLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView hydImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIj6CnYq8aK8f4Bh-HjIuwM_w_ObVLNJ8Urw&s"));
        VBox vbox4 = new VBox(hydImageView,hydLabel,hydlbl);
        vbox4.setAlignment(Pos.CENTER);

        Button hydButton = new Button("",vbox4);
        hydButton.setPrefWidth(300);
        hydButton.setPrefHeight(150);

        hydButton.setStyle(buttonHoverStyle1);

        //banglore
        Label bangLabel = new Label("Banglore");
        Label banglbl = new Label("Technology hub of India");
        banglbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        bangLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView bangImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUekZF9GyjhM174zYVTQ9lbh5F1pv8FIrJGQ&s"));
        VBox vbox5 = new VBox(bangImageView,bangLabel,banglbl);
        vbox5.setAlignment(Pos.CENTER);

        Button bangButton = new Button("",vbox5);
        bangButton.setPrefWidth(300);
        bangButton.setPrefHeight(150);

        bangButton.setStyle(buttonHoverStyle1);

        //manali
        Label manaliLabel = new Label("Manali");
        Label manalilbl = new Label("Technology hub of India");
        manalilbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        manaliLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView manaliImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWaIN67CSuO4llhooFR__jKlDIXnQONh9TnQ&s"));
        VBox vbox6 = new VBox(manaliImageView,manaliLabel,manalilbl);
        vbox6.setAlignment(Pos.CENTER);

        Button manaliButton = new Button("",vbox6);
        manaliButton.setPrefWidth(300);
        manaliButton.setPrefHeight(150);

        manaliButton.setStyle(buttonHoverStyle1);

        //GOA
        Label goaLabel = new Label("Dubai");
        Label goalbl = new Label("Treasured gem of the Emirates");
        goalbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        goaLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView goaImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQoGfZqJyNmUiIDrHOSmnVXuhME5y3CtX9hlg&s"));
        VBox vbox7 = new VBox(goaImageView,goaLabel,goalbl);
        vbox7.setAlignment(Pos.CENTER);

        Button goaButton = new Button("",vbox7);
        goaButton.setPrefWidth(300);
        goaButton.setPrefHeight(150);

        goaButton.setStyle(buttonHoverStyle1);
        
        //KERALA
        Label keralaLabel = new Label("Amritsar");
        Label keralalbl = new Label("The Pool of Nectar");
        keralalbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        keralaLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView keralaImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTnsn352l8TnWL9Q0I0FOjm3KK5j5a5B8Uu_w&s"));
        VBox vbox8 = new VBox(keralaImageView,keralaLabel,keralalbl);
        vbox8.setAlignment(Pos.CENTER);

        Button keralaButton = new Button("",vbox8);
        keralaButton.setPrefWidth(300);
        keralaButton.setPrefHeight(150);

        keralaButton.setStyle(buttonHoverStyle1);

        //SHIMLA
        Label shimlaLabel = new Label("Shimla");
        Label shimlalbl = new Label("Endearing combination of blue sky");
        shimlalbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        shimlaLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView shimlaImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfAyjwZy8a60x-Y1pvgymIq0g8Vh9xNgcbJw&s"));
        VBox vbox9 = new VBox(shimlaImageView,shimlaLabel,shimlalbl);
        vbox9.setAlignment(Pos.CENTER);

        Button shimlaButton = new Button("",vbox9);
        shimlaButton.setPrefWidth(300);
        shimlaButton.setPrefHeight(150);

        shimlaButton.setStyle(buttonHoverStyle1);

        //OOTY
        Label otyLabel = new Label("OOTY");
        Label otylbl = new Label("Endless natural beauty of the Nilgiris");
        otylbl.setStyle("fx-font weight:bold; -fx-font-size:20; -fx-text-fill:blue;");
        otyLabel.setStyle("fx-font weight:bold; -fx-font-size:30; -fx-text-fill:black;");
        ImageView otyImageView = new ImageView(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmYgNL0hYfb2fLh3rkqcfnMS3Ico4XGhS0Ww&s"));
        VBox vbox10 = new VBox(otyImageView,otyLabel,otylbl);
        vbox10.setAlignment(Pos.CENTER);

        Button otyButton = new Button("",vbox10);
        otyButton.setPrefWidth(300);
        otyButton.setPrefHeight(150);

        otyButton.setStyle(buttonHoverStyle1);


        HBox hBox = new HBox(30,delhiButton,mumbaiButton,chennaiButton,hydButton,bangButton);
        hBox.setAlignment(Pos.CENTER);

        HBox hBox1 = new HBox(30,manaliButton,goaButton,keralaButton,shimlaButton,otyButton);
        hBox1.setAlignment(Pos.CENTER);

        // ComboBox for cities
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("Jaipur", "Kolkata", "Mumbai","Surat");
        cityComboBox.setPromptText("Select City");

        // ComboBox for number of adults
        ComboBox<Integer> adultsComboBox = new ComboBox<>();
        adultsComboBox.getItems().addAll(1, 2, 3, 4, 5,6,7,8);
        adultsComboBox.setPromptText("Select Adults");

        // ComboBox for number of rooms
        ComboBox<Integer> roomsComboBox = new ComboBox<>();
        roomsComboBox.getItems().addAll(1, 2, 3, 4, 5);
        roomsComboBox.setPromptText("Select Rooms");

        DatePicker checkinDatePicker = new DatePicker();
        checkinDatePicker.setPromptText("check in");
        
        DatePicker checkoutDatePicker = new DatePicker();
        checkoutDatePicker.setPromptText("check out");


        Button search = new Button("Search");
        search.setStyle("-fx-background-color:orange; -fx-font-weight-bold; -fx-font-size:20; -fx-background-radius:30; -fx-padding:10 20 10 20;");

        search.setOnAction(e ->{
            String selectedCity = cityComboBox.getValue();
            LocalDate checkin = checkinDatePicker.getValue();
            LocalDate checkout = checkoutDatePicker.getValue();
            //Integer selectedAdults = adultsComboBox.getValue();
            //Integer selectedRooms = roomsComboBox.getValue();
            if(selectedCity != null && checkin != null && checkout!= null){
                //openNewScene (primaryStage,selectedCity,selectedAdults,selectedRooms);
                hotelMainPage hm = new hotelMainPage(primaryStage);
                hm.start(); 
                
            }
        });

        HBox checkInOutHBox = new HBox(25, cityComboBox,/*adultsComboBox,roomsComboBox,*/checkinDatePicker,checkoutDatePicker);
        checkInOutHBox.setAlignment(Pos.CENTER);
        checkInOutHBox.setPadding(new Insets(10));
        checkInOutHBox.setSpacing(60);
        checkInOutHBox.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #d0d0d0; -fx-border-radius: 5; -fx-background-radius: 5;");

        HBox checkbox = new HBox(35,checkInOutHBox,search);
        //checkbox.setStyle("-fx-border-color:orange; -fx-border-width:3; -fx-padding:10;");
        checkbox.setAlignment(Pos.CENTER);

        VBox vb3 = new VBox(30,smallHBox1,checkbox,smallHBox3);

        VBox v1 = new VBox(smallHBox2);
        VBox v2 = new VBox(20,vb3,hBox,hBox1);

        HBox contactPage = createContactPage();

        contact.setOnAction(e -> openContactPage(contactPage,primaryStage));

        home.setOnAction(e -> closeContactPage(contactPage));

        

        // VBox to contain both HBoxes
        VBox vBox = new VBox(v1,v2,contactPage);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setPrefSize(800, 800);

        Scene homescene = new Scene(vBox, 800, 800);

        // Booking Page
        VBox bookingVBox = new VBox(20);
        bookingVBox.setAlignment(Pos.CENTER);
        Label bookingLabel = new Label("Welcome to the BookItNow");
        bookingLabel.setStyle("-fx-font-weight:bold; -fx-font-size:30; -fx-text-fill:black");
        Button backButton = new Button("Back to Home");

        backButton.setStyle(buttonStyle);
        //backButton.setOnMouseEntered(e -> backButton.setStyle(buttonHoverStyle));
        //backButton.setOnMouseExited(e -> backButton.setStyle(buttonStyle));

        backButton.setOnAction(e -> primaryStage.setScene(homescene));
        home.setOnAction(e -> primaryStage.setScene(homescene));


        HBox hb1 = new HBox(backButton);
        HBox hb2 = new HBox(bookingLabel);
        hb2.setAlignment(Pos.CENTER);


        bookingVBox.getChildren().addAll(hb1,hb2);
        bookingVBox.setAlignment(Pos.TOP_LEFT);

        Scene bookingScene = new Scene(bookingVBox, 800, 800);

        booking.setOnAction(e -> primaryStage.setScene(bookingScene));

        booking.setOnAction(event -> {
            hourlyStay1 hr1 = new hourlyStay1(primaryStage);
            hr1.start(); 
           
        });

        
        primaryStage.setScene(homescene);
        primaryStage.setTitle("HotelReservation System");
        primaryStage.getIcons().add(new Image("images/home page icon.jpeg"));
        primaryStage.setX(500);
        primaryStage.setY(300);
        primaryStage.setWidth(2000);
        primaryStage.setHeight(1000);
        primaryStage.setResizable(true);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    private HBox createContactPage() {
        HBox contactPage = new HBox();
        contactPage.setAlignment(Pos.CENTER);
        contactPage.setSpacing(20);
        contactPage.setStyle("-fx-background-color: white;");
        contactPage.setPrefSize(800, 300);

        Label contactLabel = new Label("Contact Us");
        contactLabel.setStyle("-fx-font-weight:bold; -fx-font-size:30; -fx-text-fill:black");

        Label phoneLabel = new Label("Phone: +1 234 567 890");
        phoneLabel.setStyle("-fx-font-size:20; -fx-text-fill:black");

        Label emailLabel = new Label("Email: contact@bookitnow.com");
        emailLabel.setStyle("-fx-font-size:20; -fx-text-fill:black");

        ImageView whatsapp = new ImageView(new Image("https://img.icons8.com/?size=40&id=3mLnNEbkzNrC&format=gif"));
        ImageView instagram = new ImageView(new Image("https://img.icons8.com/?size=48&id=ZRiAFreol5mE&format=gif"));
        ImageView facebook = new ImageView(new Image("https://img.icons8.com/?size=48&id=118497&format=png"));
        ImageView linkedin = new ImageView(new Image("https://img.icons8.com/?size=48&id=13930&format=png"));

        contactPage.getChildren().addAll(contactLabel, phoneLabel, emailLabel,whatsapp,instagram,facebook,linkedin);
        contactPage.setTranslateY(600);  // Start below the screen

        return contactPage;
    }

    // Method to animate and open the contact page
    private void openContactPage(HBox contactPage, Stage stage) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), contactPage);
        translateTransition.setToY(0);  // Move to the top of the screen
        translateTransition.play();
    }

     // Method to close the contact page (hide or move it out of view)
     private void closeContactPage(HBox contactPage) {
        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1), contactPage);
        translateTransition.setToY(600);  // Move out of view
        translateTransition.play();
    }


    

}


