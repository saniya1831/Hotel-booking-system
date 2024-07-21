package com.firestore.controller;

import com.firestore.firebaseConfig.DataService;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class SignUpController {
    private LoginController loginController;
    
    public SignUpController(LoginController loginController) {
        this.loginController = loginController;
    }
    
    public Scene createSignupScene(Stage primaryStage) {

        Label lb = new Label("Create Your Account to BookItNow");
        lb.setFont(new Font(40));
        lb.setStyle("-fx-font-weight:bold");

        Image ig = new Image("images/signup image.jpeg");
        ImageView iv = new ImageView(ig);
        
        Label userLabel = new Label("Username:");
        TextField userTextField = new TextField();
        userTextField.setPromptText("enter username");
        
        Label passLabel = new Label("Password:");
        PasswordField passField = new PasswordField();
        passField.setPromptText("enter password");

        Label emaiLabel = new Label("Email:");
        TextField emaTextField = new TextField();
        emaTextField.setPromptText("enter your email id");

        Label mobileLabel = new Label("Mobile No:");
        TextField mobileTextField = new TextField();
        mobileTextField.setPromptText("enter your mobile number");

        
        Button signupButton = new Button("Signup");
        signupButton.setStyle("-fx-background-color:blue; -fx-text-fill:white; -fx-font-weight:bold");

        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color:blue; -fx-text-fill:white; -fx-font-weight:bold");
        
        VBox fieldBox1 = new VBox(10, userLabel,userTextField);
        fieldBox1.setMaxSize(300, 30);
        VBox fieldBox2 = new VBox(10, passLabel,passField);
        fieldBox2.setMaxSize(300, 30);
        VBox fieldBox3 = new VBox(10,emaiLabel,emaTextField);
        fieldBox3.setMaxSize(300, 30);
        VBox fieldBox4 = new VBox(10,mobileLabel,mobileTextField);
        fieldBox4.setMaxSize(300, 30);
        
        HBox buttonBox = new HBox(50,signupButton,backButton);
        buttonBox.setMaxSize(350, 30);
        buttonBox.setAlignment(Pos.CENTER);


        VBox vbox = new VBox(20,iv,lb, fieldBox1,fieldBox3,fieldBox4,fieldBox2, buttonBox);
        vbox.setPrefWidth(500);
        vbox.setAlignment(Pos.CENTER);
        vbox.setStyle("-fx-background-color:white");
        VBox.setVgrow(vbox,Priority.ALWAYS);

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(1.5), vbox);
        translateTransition.setFromY(-400); // Start from left outside the scene
        translateTransition.setToY(0); // Move to center
        translateTransition.play();


        VBox vb = new VBox();
        vb.setPrefWidth(500);
        vb.setStyle("-fx-background-image:url('https://repository-images.githubusercontent.com/564415983/ce50ad53-6c19-411c-92d7-43fa534e6d69')");
        vb.setAlignment(Pos.CENTER);
        VBox.setVgrow(vb,Priority.ALWAYS);

        HBox hb = new HBox(vb,vbox);
        hb.setAlignment(Pos.CENTER);
        HBox.setHgrow(vb, Priority.ALWAYS);
        HBox.setHgrow(vbox,Priority.ALWAYS);
        
        signupButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                handleSignup(primaryStage,userTextField.getText(),emaTextField.getText(),mobileTextField.getText(),passField.getText());
            }
        });

        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loginController.showLoginScene();
            }
        });

        return new Scene(hb, 2000, 1000);

        
    }

    private void handleSignup(Stage primaryStage,String username,String email,String mobile,String password) {
        if(!isValidEmail(email)){
            showAlert("Invalid Email","Please enter a valid email address.");
            return;
        }

        if(!isValidMobile(mobile)){
            showAlert("Invalid Mobile Number","Please enter a valid mobile number with at least 10 digits.");
            return;
        }
        DataService dataService;
        try {
            dataService = new DataService();
            Map<String, Object> data = new HashMap<>();
            data.put("password", password);
            data.put("username", username);
            data.put("Email-Id", email);
            data.put("mobile number",mobile);
            
            dataService.addData("users", username,data);
           
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Signup Successful");
            alert.setHeaderText(null);
            alert.setContentText("User Created successfully");
            alert.showAndWait();
            
            loginController.showLoginScene();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean isValidEmail(String email){
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private boolean isValidMobile(String mobile){
        return mobile.matches("\\d{10,}");
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
