package com.firestore.controller;

import java.util.concurrent.ExecutionException;

import com.firestore.Home.homepage;
import com.firestore.firebaseConfig.DataService;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.effect.BoxBlur;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController{
    private Stage primaryStage;
    private Scene loginScene;
    private DataService dataService;
    public static String key;

    public LoginController(Stage primaryStage){
        this.primaryStage = primaryStage;
        dataService = new DataService();
        initScenes();
    }

    private void initScenes(){
        initLoginScene();
    }

    private void initLoginScene(){
       Label userLabel = new Label("Username");
       TextField userTextField = new TextField();
       userTextField.setPromptText("enter username");
       
       Label passLabel = new Label("Password");
       PasswordField passField = new PasswordField();
       passField.setPromptText("enter password"); 
       
       Button loginButton = new Button("Login");
       loginButton.setStyle("-fx-background-color:gold");
       loginButton.setPrefWidth(100);
       
       Button signupButton = new Button("Signup");
       signupButton.setStyle("-fx-background-color:gold");
       signupButton.setPrefWidth(100);
       
       
       loginButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                handleLogin(userTextField.getText(),passField.getText());
            } catch (Exception e) {
                e.printStackTrace();
            } 
            userTextField.clear();
            passField.clear();
        
        }
    });
    
    signupButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            showSignupScene();
            userTextField.clear();
            passField.clear();
        }
    });
    
    userLabel.setStyle("-fx-font-weight:bold");
    passLabel.setStyle("-fx-font-weight:bold");
    
    VBox fieldBox1 = new VBox(5, userLabel,userTextField);
    fieldBox1.setMaxSize(300, 30);
    
    VBox fieldBox2 = new VBox(5, passLabel,passField);
    fieldBox2.setMaxSize(300, 30);
    
    HBox buttonBox = new HBox(50, loginButton,signupButton);
    
    buttonBox.setMaxSize(350, 30);
    buttonBox.setAlignment(Pos.CENTER);
    
    userTextField.setStyle("-fx-set-pref-width:350");
    passField.setStyle("-fx-set-pref-width:350");

    Image ig = new Image("images/images 2.jpeg");
    ImageView iv = new ImageView(ig);
    iv.setFitWidth(100);
    iv.setFitHeight(100);

    Label lb2 = new Label("BookItNow");
    lb2.setFont(new Font(40));
    lb2.setStyle("-fx-font-weight:bold");
    lb2.setAlignment(Pos.CENTER);

    Label lb = new Label("Login to account");
    lb.setFont(new Font(30));
    lb.setStyle("-fx-font-weight:bold");

    Label lb1 = new Label("Enter your credentials to access your account");
    lb1.setFont(new Font(15));

    VBox labelbox = new VBox(5, lb2,lb,lb1);
    labelbox.setMaxSize(300, 30);
    
    VBox vbox = new VBox(20,labelbox,fieldBox1,fieldBox2, buttonBox);
    vbox.setMaxWidth(400);
    vbox.setAlignment(Pos.CENTER);
    vbox.setMaxHeight(400);
    //vbox.setStyle("-fx-background-color:clay; -fx-background-radius: 15;");
    
    Rectangle rect = new Rectangle(500,500);
    rect.setFill(Color.rgb(255, 255, 255, 0.5));
    rect.setEffect(new BoxBlur(5,5,3));

    StackPane stackPane = new StackPane();
    stackPane.getChildren().addAll( rect,vbox);
    stackPane.setAlignment(Pos.CENTER);
    //stackPane.setStyle("-fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4Ti7SVip7uvbiP--Yy77lwDinEsee2RrmqQ&s'); -fx-background-size: cover;");
    stackPane.setStyle("-fx-background-image: url('https://img.freepik.com/premium-photo/luxury-hotel-lobby-with-furniture-large-window-generative-ai_634358-381.jpg'); -fx-background-size: cover;");

    //stackPane.setStyle("-fx-background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpSOW_oWLbCLDniSveOvCUJeMequJ7-TxKgw&s'); -fx-background-size: cover;");

    
    

    loginScene = new Scene(stackPane,2000,1000);

    TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), vbox);
    translateTransition.setFromX(-400); // Start from left outside the scene
    translateTransition.setToX(0); // Move to center
    translateTransition.play();


    }

    /*private void initUserScene() {
        UserPage userPage = new UserPage(dataService);
        userScene = new Scene(userPage.createUserScene(this::handleLogout),600, 600);
    }*/
    
    public Scene getLoginScene() {
        return loginScene;
    }
    
    public void showLoginScene() {
        primaryStage.setScene(loginScene);
        primaryStage.setTitle("Login Page");
        primaryStage.show();
    }

    private void handleLogin(String username,String password) throws Exception {
        try {
            if(dataService.authenticateUser(username, password)){
                key = username;
                homepage homePage = new homepage(primaryStage);
                homePage.start();              
            } else {
                System.out.println("Invalid credentials");
                key = null;
            }
        } catch (ExecutionException | InterruptedException  ex) {
            ex.printStackTrace();
        }
    }
    
    private void showSignupScene() {
        SignUpController signupController = new SignUpController(this);
        
        Scene signupScene =signupController.createSignupScene(primaryStage);
        primaryStage.setScene(signupScene);
        primaryStage.setTitle("Sign Up Page");
        primaryStage.show();
    }


    
}
