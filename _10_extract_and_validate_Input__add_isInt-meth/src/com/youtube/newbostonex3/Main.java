package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage window;
	private	Button button; 
	private TextField nameInput;
	private Scene scene;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
		// Form
		Label ageLabel = new Label("Your age");
		nameInput = new TextField();
		button = new Button("Click me");
		
		button.setOnAction(e -> isInt(nameInput));
		
		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(ageLabel, nameInput, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}
	


	private boolean isInt(TextField input) {
		try {
			int age = Integer.parseInt(input.getText());
			System.out.println("User is " + age + " old.");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Error " + input.getText() + " is not a number");
			return false;
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}
