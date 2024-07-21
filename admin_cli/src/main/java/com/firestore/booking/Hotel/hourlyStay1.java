package com.firestore.booking.Hotel;

import com.firestore.Home.homepage;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class hourlyStay1 {

    private Stage primaryStage;

    public hourlyStay1(Stage stage){
        this.primaryStage = stage;
    }

    
    public void start() {
        /*Label hrlb = new Label("Introducing Hourly Stays");
        hrlb.setStyle("-fx-font-weight:bold;-fx-text-fill:WHITE; -fx-font-size:60;");
        
        Label hrlb1 = new Label("Lets Find Out Your Next Stay!!!");
        hrlb1.setStyle("-fx-font-weight:bold;-fx-text-fill:WHITE; -fx-font-size:30;");
        
        VBox hrhb = new VBox(10, hrlb, hrlb1);
        hrhb.setAlignment(Pos.CENTER);

        Button searchbtn = new Button("Search");
        searchbtn.setStyle("-fx-text-fill:WHITE; -fx-background-color:BLUE;-fx-font-weight:bold; -fx-font-size:30");
        
        searchbtn.setOnAction(event -> {
            HourlyHotels hr2 = new HourlyHotels(primaryStage);
            hr2.start();
        });

        Button cityButton = new Button("Select City");
        cityButton.setStyle(" -fx-text-fill: BLACK;-fx-font-weight:bold;-fx-font-size:30;");
        
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("Pune", "Mumbai", "Banglore", "Manali");
        cityComboBox.setVisible(false);
        
        cityButton.setOnAction(event -> cityComboBox.setVisible(true));
        VBox cityBox = new VBox(5, cityButton, cityComboBox);
        cityBox.setAlignment(Pos.CENTER);

        Button dateButton = new Button("Select Date");
        dateButton.setStyle(" -fx-text-fill: BLACK;-fx-font-weight:bold;-fx-font-size:30;");
        DatePicker datePicker = new DatePicker();
        datePicker.setVisible(false);
        
        dateButton.setOnAction(event -> datePicker.setVisible(true));
        VBox dateBox = new VBox(5, dateButton, datePicker);
        dateBox.setAlignment(Pos.CENTER);

        Button timeButton = new Button("Select Time");
        timeButton.setStyle(" -fx-text-fill: BLACK;-fx-font-weight:bold;-fx-font-size:30;");
        ComboBox<String> timeComboBox = new ComboBox<>();
        timeComboBox.getItems().addAll("3hr", "6hr", "12hr");
        timeComboBox.setVisible(false);
        
        timeButton.setOnAction(event -> timeComboBox.setVisible(true));
        VBox timeBox = new VBox(5, timeButton, timeComboBox);
        timeBox.setAlignment(Pos.CENTER);

        Button roomsAndAdultsButton = new Button("Select Rooms and Adults");
        roomsAndAdultsButton.setStyle("-fx-text-fill: BLACK;-fx-font-weight:bold;-fx-font-size:20");
        Spinner<Integer> roomsSpinner = new Spinner<>(1, 10, 1);
        Spinner<Integer> adultsSpinner = new Spinner<>(1, 10, 1);
        roomsSpinner.setVisible(false);
        adultsSpinner.setVisible(false);
        
        roomsAndAdultsButton.setOnAction(event -> {
            roomsSpinner.setVisible(true);
            adultsSpinner.setVisible(true);
        });
        VBox roomsAndAdultsBox = new VBox(5, roomsAndAdultsButton, new Label("Rooms:"), roomsSpinner, new Label("Adults:"), adultsSpinner);
        roomsAndAdultsBox.setStyle("-fx-text-fill: BLUE;-fx-font-weight:bold;-fx-font-size:30");
        roomsAndAdultsBox.setAlignment(Pos.CENTER);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(20);  
        grid.setHgap(20);  
        grid.setAlignment(Pos.CENTER);
        
        grid.add(cityBox, 0, 0);
        grid.add(dateBox, 0, 1);
        grid.add(timeBox, 0, 2);
        grid.add(roomsAndAdultsBox, 0, 3);
        
        VBox vb = new VBox(20, hrhb, grid, searchbtn);
        vb.setAlignment(Pos.TOP_CENTER);
        
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vb);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setStyle("-fx-background-image: url('images/blur.jpg'); -fx-background-size: cover;");
        
        Scene scene = new Scene(stackPane, 1100, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/
        Label hrlb = new Label("Introducing Hourly Stays");
        hrlb.setStyle("-fx-font-weight:bold;-fx-text-fill:WHITE; -fx-font-size:60;");

        Label hrlb1 = new Label("Lets Find Out Your Next Stay!!!");
        hrlb1.setStyle("-fx-font-weight:bold;-fx-text-fill:WHITE; -fx-font-size:30;");

        VBox hrhb = new VBox(10, hrlb, hrlb1);
        hrhb.setAlignment(Pos.CENTER);

        Button searchbtn = new Button("Search");
        searchbtn.setStyle("-fx-text-fill:WHITE; -fx-background-color:BLUE;-fx-font-weight:bold; -fx-font-size:30");

        Button backbtn = new Button("<<");
        backbtn.setStyle("-fx-text-fill:WHITE; -fx-background-color:#63C5DA;-fx-font-weight:bold; -fx-font-size:25");

        backbtn.setOnAction(event -> {
                homepage hp = new homepage(primaryStage);
                hp.start();
        });


        Button cityButton = new Button("Select City");
        cityButton.setStyle(" -fx-text-fill: BLACK;-fx-background-color : #B2D3C2;-fx-font-weight:bold;-fx-font-size:32;");  //B2D3C2
        //cityButton.setStyle("-fx-font-size: 25;-fx-pref-width:160;-fx-min-height: 50;-fx-background-radius: 30;-fx-background-color : #FDA172; -fx-text-fill:#FFFFFF");

        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("Pune", "Mumbai", "Bangalore", "Manali");
        cityComboBox.setVisible(false);

        cityButton.setOnAction(event -> cityComboBox.setVisible(true));
        VBox cityBox = new VBox(5, cityButton, cityComboBox);
        cityBox.setAlignment(Pos.CENTER);

        Button dateButton = new Button("Select Date");
        dateButton.setStyle(" -fx-text-fill: BLACK;-fx-background-color : #B2D3C2;-fx-font-weight:bold;-fx-font-size:32;");
        DatePicker datePicker = new DatePicker();
        datePicker.setVisible(false);

        dateButton.setOnAction(event -> datePicker.setVisible(true));
        VBox dateBox = new VBox(5, dateButton, datePicker);
        dateBox.setAlignment(Pos.CENTER);

        Button timeButton = new Button("Select Time");
        timeButton.setStyle(" -fx-text-fill: BLACK;-fx-background-color : #B2D3C2;-fx-font-weight:bold;-fx-font-size:32;");
        ComboBox<String> timeComboBox = new ComboBox<>();
        timeComboBox.getItems().addAll("3hr", "6hr", "12hr");
        timeComboBox.setVisible(false);

        timeButton.setOnAction(event -> timeComboBox.setVisible(true));
        VBox timeBox = new VBox(5, timeButton, timeComboBox);
        timeBox.setAlignment(Pos.CENTER);

        Button roomsAndAdultsButton = new Button("Select Rooms and Adults");
        roomsAndAdultsButton.setStyle("-fx-text-fill: BLACK;-fx-background-color : #B2D3C2;-fx-font-weight:bold;-fx-font-size:30");
        Spinner<Integer> roomsSpinner = new Spinner<>(1, 10, 1);
        Spinner<Integer> adultsSpinner = new Spinner<>(1, 10, 1);
        roomsSpinner.setVisible(false);
        adultsSpinner.setVisible(false);

        roomsAndAdultsButton.setOnAction(event -> {
            roomsSpinner.setVisible(true);
            adultsSpinner.setVisible(true);
        });
        VBox roomsAndAdultsBox = new VBox(5, roomsAndAdultsButton, new Label("Rooms:"), roomsSpinner, new Label("Adults:"), adultsSpinner);
        roomsAndAdultsBox.setStyle("-fx-text-fill: BLUE;-fx-font-weight:bold;-fx-font-size:30");
        roomsAndAdultsBox.setAlignment(Pos.CENTER);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setAlignment(Pos.CENTER);

        grid.add(cityBox, 0, 0);
        grid.add(dateBox, 0, 1);
        grid.add(timeBox, 0, 2);
        grid.add(roomsAndAdultsBox, 0, 3);

        HBox hb = new HBox(20, searchbtn, backbtn);
        hb.setAlignment(Pos.TOP_LEFT);

        VBox vb = new VBox(10, hb,hrhb, grid,searchbtn);
        vb.setAlignment(Pos.TOP_CENTER);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(vb);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.setStyle("-fx-background-image: url('images/blur.jpg'); -fx-background-size: cover;");

        searchbtn.setOnAction(event -> {
            if (validateInputs(cityComboBox, datePicker, timeComboBox, roomsSpinner, adultsSpinner)) {
                HourlyHotels hr2 = new HourlyHotels(primaryStage);
                hr2.start();
            } else {
                showAlert("Please fill all the fields before proceeding.");
            }
        });

        Scene scene = new Scene(stackPane, 1100, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private boolean validateInputs(ComboBox<String> cityComboBox, DatePicker datePicker, ComboBox<String> timeComboBox, Spinner<Integer> roomsSpinner, Spinner<Integer> adultsSpinner) {
        return cityComboBox.getValue() != null && datePicker.getValue() != null && timeComboBox.getValue() != null && roomsSpinner.getValue() != null && adultsSpinner.getValue() != null;
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validation Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
