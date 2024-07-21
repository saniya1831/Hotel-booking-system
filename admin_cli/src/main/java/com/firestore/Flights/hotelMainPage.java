package com.firestore.Flights;


import com.firestore.Home.homepage;
import com.firestore.Hotel.HotelInfo1;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
//import javafx.util.Duration;

public class hotelMainPage  {

    private Stage primaryStage;

    public hotelMainPage(Stage stage){
        this.primaryStage = stage;
    }

    public void start(){

        primaryStage.setTitle("hotel page");
        primaryStage.setWidth(2000);
        primaryStage.setHeight(1000);
        primaryStage.setResizable(true);
        
        //Milan International---------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------
        Image milanhotelImage = new Image("images\\milan international.jpg");
        ImageView milanhotalImageView = new ImageView(milanhotelImage);
        milanhotalImageView.setFitWidth(300);
        milanhotalImageView.setFitHeight(200);


        Label milanHotelLabel = new Label("Milan International");
        milanHotelLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        milanHotelLabel.setFont(new Font("Times New Roman",40));
        milanHotelLabel.setFont(new Font(40));

        Text decriptionmilanHotelText = new Text("The hotel offers a range of amenities to make the stay of its guests comfortable and enjoyable");
        decriptionmilanHotelText.setFont(new Font(20));

        TextFlow descriptionTextFlow = new TextFlow(decriptionmilanHotelText);
        descriptionTextFlow.setMaxWidth(600); 

        Image milanhotelLocationIcon = new Image("images\\loc.png");
        ImageView milanHotelLocationIconImageView = new ImageView(milanhotelLocationIcon);
        milanHotelLocationIconImageView.setFitWidth(30);
        milanHotelLocationIconImageView.setFitHeight(20);

        Text milanhotellocationText = new Text("Near Mumbai Airport");
        milanhotellocationText.setFont(new Font(20));
        milanhotellocationText.setFill(Color.BLUE);
        milanhotellocationText.setStyle("-fx-font-weight:bold;");
        
        HBox milanhotelLocationHBox = new HBox(10,milanHotelLocationIconImageView,milanhotellocationText);

        Label lb1 = new Label("#Free Cancellation till 24 hrs before check in");
        lb1.setFont(new Font("Times New Roman",25));
        lb1.setStyle(" -fx-text-fill:teal;");

        BorderPane milanHotelborderPane = new BorderPane();

        Button milanHotelViewMoreButton = new Button("view more");

        milanHotelViewMoreButton.setOnAction(e ->{
            HotelInfo1 ht1 = new HotelInfo1(primaryStage);
            ht1.start();
        });

        milanHotelViewMoreButton.setFont(new Font(20));
        milanHotelViewMoreButton.setLayoutX(600);
        milanHotelViewMoreButton.setLayoutY(400);

        milanHotelborderPane.setRight(milanHotelViewMoreButton);
    
        milanHotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox milanHotelImageVBox  = new VBox(milanhotalImageView);

        VBox milanHoteldescriptionVBox = new VBox(10,milanHotelLabel,milanhotelLocationHBox,descriptionTextFlow,lb1,milanHotelborderPane);

        HBox milanhotelHBox = new HBox(10,milanHotelImageVBox,milanHoteldescriptionVBox);
        milanhotelHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        milanhotelHBox.setPrefWidth(1200);
        milanhotelHBox.setPrefHeight(200);
        milanhotelHBox.setLayoutX(400);
        milanhotelHBox.setLayoutY(50);

        //End of Milan Internation----------------------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------
        
        //Shara star hotel-------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------
        Image saharaStarImage = new Image("images\\sahara.jpeg.jpg");
        ImageView saharaStarImageView = new ImageView(saharaStarImage);
        saharaStarImageView.setFitWidth(300);
        saharaStarImageView.setFitHeight(200);

        Label saharaStarHotelLabel = new Label("Sahara Star Hotel");
        saharaStarHotelLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        saharaStarHotelLabel.setFont(new Font("Times New Roman",40));
        saharaStarHotelLabel.setFont(new Font(40));

        Text saharaStarHoteldecriptionText = new Text("The hotel offers a range of luxurious amenities including a swimming pool,jacuzzi,spa,restaurant,and 24-hour room service.");
        saharaStarHoteldecriptionText.setFont(new Font("Times New Roman",20));

        TextFlow saharaStarTextFlow = new TextFlow(saharaStarHoteldecriptionText);
        saharaStarTextFlow.setMaxWidth(600); 

        Image saharastarlocationIcon = new Image("images\\loc.png");
        ImageView saharastarLocationIconImageView = new ImageView(saharastarlocationIcon);
        saharastarLocationIconImageView.setFitWidth(30);
        saharastarLocationIconImageView.setFitHeight(20);

        Text saharastarlocationText = new Text("Vile Parle, Mumbai-1.0 km to center");
        saharastarlocationText.setFont(new Font(20));
        saharastarlocationText.setFill(Color.BLUE);
        saharastarlocationText.setStyle("-fx-font-weight:bold;");

        HBox saharaLocationHBox = new HBox(10,saharastarLocationIconImageView,saharastarlocationText);

        Label lb2 = new Label("#Free Cancellation till 24 hrs before check in");
        lb2.setFont(new Font("Times New Roman",25));
        lb2.setStyle(" -fx-text-fill:teal;");

        
        BorderPane saharahotelBorderPane = new BorderPane();

        Button saharahotelViewMoreButton = new Button("view more");
        saharahotelViewMoreButton.setFont(new Font(20));
        saharahotelViewMoreButton.setLayoutX(600);
        saharahotelViewMoreButton.setLayoutY(400);

        saharahotelBorderPane.setRight(saharahotelViewMoreButton);
    
        saharahotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox saharahotelImageVBox  = new VBox(saharaStarImageView);

        VBox saharahoteldescriptionVBox = new VBox(10,saharaStarHotelLabel,saharaLocationHBox,saharaStarTextFlow,lb2,saharahotelBorderPane);

        HBox saharaStarhotelHBox = new HBox(10,saharahotelImageVBox,saharahoteldescriptionVBox);
        saharaStarhotelHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        saharaStarhotelHBox.setPrefWidth(1200);
        saharaStarhotelHBox.setPrefHeight(200);
        saharaStarhotelHBox.setLayoutX(400);
        saharaStarhotelHBox.setLayoutY(50);

        
        //end of saharahotel------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------------------



        //taj tower----------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------------------------------------

        Image tajmahalTowerImage = new Image("images\\tajtower.jpg");
        ImageView tajmahalTowerImageView = new ImageView(tajmahalTowerImage);
        tajmahalTowerImageView.setFitWidth(300);
        tajmahalTowerImageView.setFitHeight(200);

        Label tajmahalTowerLabel = new Label("Taj Mhal Tower");
        tajmahalTowerLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        tajmahalTowerLabel.setFont(new Font("Times New Roman",40));
        tajmahalTowerLabel.setFont(new Font(40));

        Text tajmahaldescriptionText = new Text("This luxurious hotel combines contemporary style,top-notch facilities, and traditional Rajasthani decor.");
        tajmahaldescriptionText.setFont(new Font(20));

        TextFlow tajmahaldescriptionTextFlow = new TextFlow(tajmahaldescriptionText);
        tajmahaldescriptionTextFlow.setMaxWidth(600); 

        Image tajamahalLocationImage = new Image("images\\loc.png");
        ImageView tajmahalLoactionImageView = new ImageView(tajamahalLocationImage);
        tajmahalLoactionImageView.setFitWidth(30);
        tajmahalLoactionImageView.setFitHeight(20);

        Text tajmahalLocText = new Text("Apollo Bunder, Near Gateway Of India");
        tajmahalLocText.setFont(new Font(20));
        tajmahalLocText.setFill(Color.BLUE);
        tajmahalLocText.setStyle("-fx-font-weight:bold;");
        
        HBox tajLocHBox = new HBox(10,tajmahalLoactionImageView,tajmahalLocText);

        Label lb3 = new Label("#Free Cancellation till 24 hrs before check in");
        lb3.setFont(new Font("Times New Roman",25));
        lb3.setStyle(" -fx-text-fill:teal;");
        
        BorderPane tajmahalBorderPane = new BorderPane();

        Button tajmahalViewMoreButton = new Button("view more");
        tajmahalViewMoreButton.setFont(new Font(20));
        tajmahalViewMoreButton.setLayoutX(600);
        tajmahalViewMoreButton.setLayoutY(400);

        tajmahalBorderPane.setRight(tajmahalViewMoreButton);
    
        milanHotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox tajmahalImageVBox  = new VBox(tajmahalTowerImageView);

        VBox tajmahalhoteldescriptionVBox = new VBox(10,tajmahalTowerLabel,tajLocHBox,tajmahaldescriptionTextFlow,lb3,tajmahalBorderPane);

        HBox tajmahalHBox = new HBox(10,tajmahalImageVBox,tajmahalhoteldescriptionVBox);
        tajmahalHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        tajmahalHBox.setPrefWidth(1200);
        tajmahalHBox.setPrefHeight(200);
        tajmahalHBox.setLayoutX(400);
        tajmahalHBox.setLayoutY(50);
        //end of taj tower-------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------

        //Hilton mumabai international-----------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------
        Image hiltonImage = new Image("images\\hilton mum.jpg");
        ImageView hiltonImageView = new ImageView(hiltonImage);
        hiltonImageView.setFitWidth(300);
        hiltonImageView.setFitHeight(200);

        Label hiltonLabel = new Label("Taj Mhal Tower");
        hiltonLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        hiltonLabel.setFont(new Font("Times New Roman",40));
        hiltonLabel.setFont(new Font(40));

        Text hiltondescriptionText = new Text("Hilton Mumbai offers decadent accommodations, multiple dining options, and lavish amenities.");
        hiltondescriptionText.setFont(new Font(20));

        TextFlow hiltondescriptionflow = new TextFlow(hiltondescriptionText);
        hiltondescriptionflow.setMaxWidth(600); 

        Image hilLocImage = new Image("images\\loc.png");
        ImageView hilLocImageView = new ImageView(hilLocImage);
        hilLocImageView.setFitWidth(30);
        hilLocImageView.setFitHeight(20);

        Text hiltonLocText = new Text("Sahara Airport road Andheri East");
        hiltonLocText.setFont(new Font(20));
        hiltonLocText.setFill(Color.BLUE);
        hiltonLocText.setStyle("-fx-font-weight:bold;");
        
        HBox hiltonLocHBox = new HBox(10,hilLocImageView,hiltonLocText);

        Label lb4 = new Label("#Free Cancellation till 24 hrs before check in");
        lb4.setFont(new Font("Times New Roman",25));
        lb4.setStyle(" -fx-text-fill:teal;");

        
        BorderPane hiltonBorderPane = new BorderPane();

        Button hiltonViewMoreButton = new Button("view more");
        hiltonViewMoreButton.setFont(new Font(20));
        hiltonViewMoreButton.setLayoutX(600);
        hiltonViewMoreButton.setLayoutY(400);

        hiltonBorderPane.setRight(hiltonViewMoreButton);
    
        milanHotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox hiltonImageVBox  = new VBox(hiltonImageView);

        VBox hiltondescriptionVBox = new VBox(10,hiltonLabel,hiltonLocHBox,hiltondescriptionflow,lb4,hiltonBorderPane);

        HBox hiltonHBox = new HBox(10,hiltonImageVBox,hiltondescriptionVBox);
        hiltonHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        hiltonHBox.setPrefWidth(1200);
        hiltonHBox.setPrefHeight(200);
        hiltonHBox.setLayoutX(400);
        hiltonHBox.setLayoutY(50);
        
        //end of halton mumbai--------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------------------------
        
        Button back = new Button("<<<");
        back.setStyle("-fx-text-fill:white; -fx-font-weight:bold; -fx-background-color:blue;");
        VBox mainVBox = new VBox(20,back,milanhotelHBox,saharaStarhotelHBox,tajmahalHBox,hiltonHBox);
        mainVBox.setLayoutX(300);
        mainVBox.setLayoutY(20);
        mainVBox.setPrefWidth(1200);
        mainVBox.setPrefHeight(200);
        mainVBox.setAlignment(Pos.CENTER);

        back.setOnAction(event -> {
            homepage hp = new homepage(primaryStage);
            hp.start();
        });
            
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(mainVBox);
        scrollPane.setFitToWidth(false);
        scrollPane.setLayoutX(400);
        scrollPane.setLayoutY(20);

        Scene hotelPageScene = new Scene(scrollPane);
        primaryStage.setScene(hotelPageScene);



        primaryStage.show();

    }

        /*primaryStage.setTitle("hotel page");
        primaryStage.setWidth(1800);
        primaryStage.setHeight(1000);
        primaryStage.setResizable(true);
        
        //Milan International---------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------
        //Image milanhotelImage = new Image("images\\milan internation.jpg");

        Image milanImage = new Image("images/milan international.jpg");
        ImageView milanhotalImageView = new ImageView(milanImage);
        milanhotalImageView.setFitWidth(300);
        milanhotalImageView.setFitHeight(200);

        Label milanHotelLabel = new Label("Milan International");
        milanHotelLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        milanHotelLabel.setFont(new Font("Times New Roman",40));
        milanHotelLabel.setFont(new Font(40));

        Text decriptionmilanHotelText = new Text("The hotel offers a range of amenities to make the stay of its guests comfortable and enjoyable.");
        decriptionmilanHotelText.setFont(new Font("Times New Roman",20));

        TextFlow descriptionTextFlow = new TextFlow(decriptionmilanHotelText);
        descriptionTextFlow.setMaxWidth(600); 

        Image milanhotelLocationIcon = new Image("images/loc.png");
        ImageView milanHotelLocationIconImageView = new ImageView(milanhotelLocationIcon);
        milanHotelLocationIconImageView.setFitWidth(30);
        milanHotelLocationIconImageView.setFitHeight(20);

        Text milanhotellocationText = new Text("Near Mumbai Airport");
        milanhotellocationText.setFont(new Font(20));
        milanhotellocationText.setFill(Color.BLUE);
        milanhotellocationText.setStyle("-fx-font-weight:bold;");
        
        HBox milanhotelLocationHBox = new HBox(10,milanHotelLocationIconImageView,milanhotellocationText);

        Label lb1 = new Label("#Free Cancellation till 24 hrs before check in");
        lb1.setFont(new Font("Times New Roman",25));
        lb1.setStyle(" -fx-text-fill:teal;");
        
        BorderPane milanHotelborderPane = new BorderPane();

        Button milanHotelViewMoreButton = new Button("view more");
        milanHotelViewMoreButton.setFont(new Font(20));
        milanHotelViewMoreButton.setLayoutX(600);
        milanHotelViewMoreButton.setLayoutY(400);

        milanHotelborderPane.setRight(milanHotelViewMoreButton);
    
        milanHotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox milanHotelImageVBox  = new VBox(milanhotalImageView);

        VBox milanHoteldescriptionVBox = new VBox(10,milanHotelLabel,milanhotelLocationHBox,descriptionTextFlow,lb1,milanHotelborderPane);

        HBox milanhotelHBox = new HBox(10,milanHotelImageVBox,milanHoteldescriptionVBox);
        milanhotelHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        milanhotelHBox.setPrefWidth(1200);
        milanhotelHBox.setPrefHeight(200);
        milanhotelHBox.setLayoutX(400);
        milanhotelHBox.setLayoutY(50);

        //End of Milan Internation----------------------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------------------------
        
        //Shara star hotel-------------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------------
        Image saharaStarImage = new Image("images/sahara.jpeg.jpg");
        ImageView saharaStarImageView = new ImageView(saharaStarImage);
        saharaStarImageView.setFitWidth(300);
        saharaStarImageView.setFitHeight(200);

        Label saharaStarHotelLabel = new Label("Sahara Star Hotel");
        saharaStarHotelLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        saharaStarHotelLabel.setFont(new Font("Times New Roman",40));
        saharaStarHotelLabel.setFont(new Font(40));

        Text saharaStarHoteldecriptionText = new Text("The hotel offers a range of luxurious amenities including a swimming pool,jacuzzi,spa,restaurant,and 24-hour room service.");
        saharaStarHoteldecriptionText.setFont(new Font("Times New Roman",20));

        TextFlow saharaStarTextFlow = new TextFlow(saharaStarHoteldecriptionText);
        saharaStarTextFlow.setMaxWidth(600); 

        Image saharastarlocationIcon = new Image("images/loc.png");
        ImageView saharastarLocationIconImageView = new ImageView(saharastarlocationIcon);
        saharastarLocationIconImageView.setFitWidth(30);
        saharastarLocationIconImageView.setFitHeight(20);

        Text saharastarlocationText = new Text("Vile Parle, Mumbai-1.0 km to center");
        saharastarlocationText.setFont(new Font(20));
        saharastarlocationText.setFill(Color.BLUE);
        saharastarlocationText.setStyle("-fx-font-weight:bold;");

        HBox saharaLocationHBox = new HBox(10,saharastarLocationIconImageView,saharastarlocationText);

        Label lb2 = new Label("#Free Cancellation till 24 hrs before check in");
        lb2.setFont(new Font("Times New Roman",25));
        lb2.setStyle(" -fx-text-fill:teal;");
        
        BorderPane saharahotelBorderPane = new BorderPane();

        Button saharahotelViewMoreButton = new Button("view more");
        saharahotelViewMoreButton.setFont(new Font(20));
        saharahotelViewMoreButton.setLayoutX(600);
        saharahotelViewMoreButton.setLayoutY(400);

        saharahotelBorderPane.setRight(saharahotelViewMoreButton);
    
        saharahotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox saharahotelImageVBox  = new VBox(saharaStarImageView);

        VBox saharahoteldescriptionVBox = new VBox(10,saharaStarHotelLabel,saharaLocationHBox,saharaStarTextFlow,lb2,saharahotelBorderPane);

        HBox saharaStarhotelHBox = new HBox(10,saharahotelImageVBox,saharahoteldescriptionVBox);
        saharaStarhotelHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        saharaStarhotelHBox.setPrefWidth(1200);
        saharaStarhotelHBox.setPrefHeight(200);
        saharaStarhotelHBox.setLayoutX(400);
        saharaStarhotelHBox.setLayoutY(50);

        
        //end of saharahotel------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------------------



        //taj tower----------------------------------------------------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------------------------------------------------------------------

        Image tajmahalTowerImage = new Image("images/tajtower.jpg");
        ImageView tajmahalTowerImageView = new ImageView(tajmahalTowerImage);
        tajmahalTowerImageView.setFitWidth(300);
        tajmahalTowerImageView.setFitHeight(200);

        Label tajmahalTowerLabel = new Label("Taj Mhal Tower");
        tajmahalTowerLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        tajmahalTowerLabel.setFont(new Font("Times New Roman",40));
        tajmahalTowerLabel.setFont(new Font(40));

        Text tajmahaldescriptionText = new Text("Its taj mahal tower mumbai and its our javafx project super-x applictaion");
        tajmahaldescriptionText.setFont(new Font(20));

        TextFlow tajmahaldescriptionTextFlow = new TextFlow(tajmahaldescriptionText);
        tajmahaldescriptionTextFlow.setMaxWidth(600); 

        Image tajamahalLocationImage = new Image("images/loc.png");
        ImageView tajmahalLoactionImageView = new ImageView(tajamahalLocationImage);
        tajmahalLoactionImageView.setFitWidth(30);
        tajmahalLoactionImageView.setFitHeight(20);

        Text tajmahalLocText = new Text("Vile Parle, Mumbai-1.0 km to center");
        tajmahalLocText.setFont(new Font(20));
        tajmahalLocText.setFill(Color.BLUE);
        tajmahalLocText.setStyle("-fx-font-weight:bold;");
        
        HBox tajLocHBox = new HBox(10,tajmahalLoactionImageView,tajmahalLocText);

        Label lb3 = new Label("Free Cancellation till 24 hrs before check in");
        lb3.setFont(new Font("Times New Roman",25));
        lb3.setStyle(" -fx-text-fill:teal;");
        
        BorderPane tajmahalBorderPane = new BorderPane();

        Button tajmahalViewMoreButton = new Button("view more");
        tajmahalViewMoreButton.setFont(new Font(20));
        tajmahalViewMoreButton.setLayoutX(600);
        tajmahalViewMoreButton.setLayoutY(400);

        tajmahalBorderPane.setRight(tajmahalViewMoreButton);
    
        milanHotelViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox tajmahalImageVBox  = new VBox(tajmahalTowerImageView);

        VBox tajmahalhoteldescriptionVBox = new VBox(10,tajmahalTowerLabel,tajLocHBox,tajmahaldescriptionTextFlow,lb3,tajmahalBorderPane);

        HBox tajmahalHBox = new HBox(10,tajmahalImageVBox,tajmahalhoteldescriptionVBox);
        tajmahalHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        tajmahalHBox.setPrefWidth(1200);
        tajmahalHBox.setPrefHeight(200);
        tajmahalHBox.setLayoutX(400);
        tajmahalHBox.setLayoutY(50);
        //end of taj tower-------------------------------------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------------------

        //Hilton mumabai international-----------------------------------------------------------------------------------------
        //-----------------------------------------------------------------------------------------------------------------------
        Image hiltonImage = new Image("images/hilton mum.jpg");
        ImageView hiltonImageView = new ImageView(hiltonImage);
        hiltonImageView.setFitWidth(300);
        hiltonImageView.setFitHeight(200);

        Label hiltonLabel = new Label("Hilton Mumbai");
        hiltonLabel.setStyle("-fx-font-weight:bold; -fx-text-fill-black");
        hiltonLabel.setFont(new Font("Times New Roman",40));
        hiltonLabel.setFont(new Font(40));

        Text hiltondescriptionText = new Text("Hilton Mumbai offers decadent accommodations, multiple dining options, and lavish amenities.");
        hiltondescriptionText.setFont(new Font(20));

        TextFlow hiltondescriptionflow = new TextFlow(hiltondescriptionText);
        hiltondescriptionflow.setMaxWidth(600); 

        Image hilLocImage = new Image("images/loc.png");
        ImageView hilLocImageView = new ImageView(hilLocImage);
        hilLocImageView.setFitWidth(30);
        hilLocImageView.setFitHeight(20);

        Text hiltonLocText = new Text("Sahara Airport road Andheri East");
        hiltonLocText.setFont(new Font(20));
        hiltonLocText.setFill(Color.BLUE);
        hiltonLocText.setStyle("-fx-font-weight:bold;");
        
        HBox hiltonLocHBox = new HBox(10,hilLocImageView,hiltonLocText);

        Label lb4 = new Label("#Free Cancellation till 24 hrs before check in");
        lb4.setFont(new Font("Times New Roman",25));
        lb4.setStyle(" -fx-text-fill:teal;");
        
        BorderPane hiltonBorderPane = new BorderPane();

        Button hiltonViewMoreButton = new Button("view more");
        hiltonViewMoreButton.setFont(new Font(20));
        hiltonViewMoreButton.setLayoutX(600);
        hiltonViewMoreButton.setLayoutY(400);

        hiltonBorderPane.setRight(hiltonViewMoreButton);
    
        hiltonViewMoreButton.setAlignment(Pos.BOTTOM_RIGHT);
        
        VBox hiltonImageVBox  = new VBox(hiltonImageView);

        VBox hiltondescriptionVBox = new VBox(10,hiltonLabel,hiltonLocHBox,hiltondescriptionflow,lb4,hiltonBorderPane);

        HBox hiltonHBox = new HBox(10,hiltonImageVBox,hiltondescriptionVBox);
        hiltonHBox.setStyle("-fx-border-color: skyblue; -fx-border-width: 2; -fx-padding: 10;");
        hiltonHBox.setPrefWidth(1200);
        hiltonHBox.setPrefHeight(200);
        hiltonHBox.setLayoutX(400);
        hiltonHBox.setLayoutY(50);
        
        //end of halton mumbai--------------------------------------------------------------------------------------------------
        //----------------------------------------------------------------------------------------------------------------------
        Button back = new Button("Back");
        back.setOnAction(event -> {
            homepage hp = new homepage(primaryStage);
            hp.start();
        });


        VBox mainVBox = new VBox(50,back,milanhotelHBox,saharaStarhotelHBox,tajmahalHBox,hiltonHBox);
        mainVBox.setLayoutX(300);
        mainVBox.setLayoutY(20);
        mainVBox.setPrefWidth(1200);
        mainVBox.setPrefHeight(200);
        mainVBox.setAlignment(Pos.CENTER);
            
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(mainVBox);
        scrollPane.setFitToWidth(false);
        scrollPane.setLayoutX(400);
        scrollPane.setLayoutY(20);

        Scene hotelPageScene = new Scene(scrollPane);
        primaryStage.setScene(hotelPageScene);

        Button backButton1 = new Button("Back from milan");
        backButton1.setOnAction(e -> primaryStage.setScene(hotelPageScene));


        Scene milanhotelScene = new Scene(backButton1);
        milanHotelViewMoreButton.setOnAction(e ->{
            HotelInfo1 ht1 = new HotelInfo1(primaryStage);
            ht1.start();
        });

        Button backButton2 = new Button("Back");
        //backButton2.setOnAction(e -> primaryStage.setScene(hotelPageScene));

        Scene saharaScene = new Scene(backButton2);
        //saharahotelViewMoreButton.setOnAction(e ->primaryStage.setScene(saharaScene));

        //Button backButton3 = new Button("Back");
        //backButton3.setOnAction(e -> primaryStage.setScene(hotelPageScene));
        
        //Scene tajScene = new Scene(backButton3);
        //tajmahalViewMoreButton.setOnAction(e -> primaryStage.setScene(tajScene));

        //Button backButton4 = new Button("Back");
        //backButton4.setOnAction(e -> primaryStage.setScene(hotelPageScene));
        
        //Scene hiltonScene = new Scene(backButton4);
        //hiltonViewMoreButton.setOnAction(e -> primaryStage.setScene(hiltonScene));

        primaryStage.show();

    }*/
    }


