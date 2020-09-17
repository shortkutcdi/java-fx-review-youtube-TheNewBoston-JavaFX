package com.youtube.newbostonex1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Stage window;
	private Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("thenewboston");

		// inputs and labels
		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		Label firstLabel = new Label("Welcome to the site ");
		Label secondLabel = new Label(); // laissé vide
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);

		
		VBox vBox = new VBox(10, userInput, bottomText);
		vBox.setAlignment(Pos.CENTER);
		
		// binding property secondLabel with userInput
		secondLabel.textProperty().bind(userInput.textProperty());
		
		Scene scene = new Scene(vBox, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
