/*
 * HelloWorldJavaFX Version#1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: OnActions for each button
 * Output: Different messages for each button
 * 21 April 2022
 */

package helloworldjavafx;

// Import libraries 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.geometry.Pos;

/*
 * Java FX GUI Project
 * 
 */

public class NewFXMain extends Application {
    
    public static void main(String[] args) {
        launch(args);   // Runs the application
    }   // End of PSV Main
    
    public void start(Stage stage) {
        // Create a label that is displayed in the middle of the window
        Label message = new Label("First FX Application!");
        message.setFont(new Font(40));
        
        // Create buttons that can be clicked which change the message Label
        Button helloButton = new Button("Say Hello");
        helloButton.setOnAction(e -> message.setText("Hello Frank!"));
        
        Button goodbyeButton = new Button("Say Goodbye");
        goodbyeButton.setOnAction(e -> message.setText("Goodbye!"));
        
        // Additional button requirement
        Button successButton = new Button("Success Button");
        successButton.setOnAction(e -> message.setText("Success!"));
                
        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e -> Platform.exit());
        
        // Create and HBox to hold the buttons 
        HBox buttonBar = new HBox(20, helloButton, successButton, goodbyeButton, quitButton);
        buttonBar.setAlignment(Pos.CENTER);
        
        // Create a borderPane named root
        // to hold the message label in center and the buttons on the bottom
        BorderPane root = new BorderPane();
        root.setCenter(message);
        root.setBottom(buttonBar);
        
        // Create displayable scene to hold root, set the title and show it
        Scene scene = new Scene(root, 450, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Hello World");
        stage.show();
        
    }   // End of Start
    
}   // End of NewFXMain
