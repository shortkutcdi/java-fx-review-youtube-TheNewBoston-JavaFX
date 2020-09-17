package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
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
		window.setTitle("Listening for selecion change");
		
		// ChoiceBox
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		
		
		// getItems return the ObservableList object which you can add items to
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Bananas");
		choiceBox.getItems().addAll("Bacon", "Ham", "MeatBalls");
		
		// set a default value
		choiceBox.setValue("Apples");
		
		// listen for selection changes
		choiceBox.getSelectionModel().selectedItemProperty()
			.addListener((observable, oldValue, newValue) -> 
		{
			System.out.println(newValue);
			
		});
		

		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(choiceBox);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}

