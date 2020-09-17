package com.youtube.newbostonex3;

/*
 * https://docs.oracle.com/javafx/2/ui_controls/combo-box.htm#BABJCCIB
 */

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
	private ComboBox<String> comboBox;
	private Scene scene;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("ComboBox");
		
		button = new Button("Submit");
		
		// Combobox
		comboBox = new ComboBox<String>();
		
		
		// getItems return the ObservableList object which you can add items to
		comboBox.getItems().add("Good Will Hunting");
		comboBox.getItems().addAll(
				"St. Vincent", "Blackhat");
		
		// set a promt text
		comboBox.setPromptText("What is your favorite movie?");
		// user can add a personal movie like - "Avatar"
		comboBox.setEditable(true); 
		
		button.setOnAction(e -> printMovie(comboBox));
		// si l'tilisateur ne choisi rien --> pas exécuté
		comboBox.setOnAction(e -> System.out.println("User selected " + comboBox.getValue() ) );
		
		// listen for selection changes
//		comboBox.getSelectionModel().selectedItemProperty()
//			.addListener((observable, oldValue, newValue) -> 
//		{
//			System.out.println(newValue);
//			
//		});

		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(comboBox, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}
	
	
	// print out a movie
	private void printMovie(ComboBox<String> comboBox2) {
		String selectedComb = comboBox2.getValue();
		if (selectedComb==null) {
			System.out.println("No selected item");
		} else {
			System.out.println(selectedComb);
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}