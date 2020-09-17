package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
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
 * https://docs.oracle.com/javafx/2/ui_controls/choice-box.htm#BCEDJAEH
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
		
		// ChoiceBox
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		
		
		// getItems return the ObservableList object which you can add items to
		choiceBox.getItems().add("Apples");
		choiceBox.getItems().add("Bananas");
		choiceBox.getItems().addAll("Bacon", "Ham", "MeatBalls");
		
		// set a default value
		choiceBox.setValue("Apples");
		
		button = new Button("Order now");
		button.setOnAction(e ->getChoice(choiceBox));
		
		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(choiceBox, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}
	
	// to get the value of the selected item
	private void getChoice(ChoiceBox<String> choiceBox) {
		String selectedItemFood = choiceBox.getSelectionModel().getSelectedItem();
		System.out.println(selectedItemFood);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
