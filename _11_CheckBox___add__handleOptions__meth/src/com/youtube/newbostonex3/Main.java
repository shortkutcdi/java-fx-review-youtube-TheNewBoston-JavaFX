package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
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

/*
 * https://docs.oracle.com/javafx/2/ui_controls/checkbox.htm#CHDFEJCD
 */

public class Main extends Application {
	private Stage window;
	private	Button button; 
	private TextField nameInput;
	private Scene scene;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Bucky's Meat Subs!");
		
		// CheckBoxes
		CheckBox box1 = new CheckBox("Bacon");
		CheckBox box2 = new CheckBox("Tuna");
		box2.setSelected(true);
		
		// Form
		button = new Button("Order now");
		
		button.setOnAction(e -> handleOptions(box1, box2));
		
		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(box1, box2, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}
	
	// handle checkbox options
	private void handleOptions(CheckBox box1, CheckBox box2) {
		String message = "User order:\n";
		
		if (box1.isSelected()) {
			message += "Bacon\n";
		}
		if (box2.isSelected()) {
			message += "Tuna\n";
		}
		
		System.out.println(message);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
