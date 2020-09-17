package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/*
 * https://docs.oracle.com/javafx/2/ui_controls/list-view.htm#CEGGEDBF
 */

public class Main extends Application {
	private Stage window;
	private	Button button; 
	private Scene scene;
	private ListView<String> listView;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("thenewboston");
		
		button = new Button("Submit");
		
		listView = new ListView<String>();
		listView.getItems().addAll("Iron Man", "Titanic", "Contact", "Surrogates");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		button.setOnAction(e -> buttonClicked());

		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().addAll(listView, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}


	private void buttonClicked() {
		String message = "";
		ObservableList<String> movies;
		movies = listView.getSelectionModel().getSelectedItems();
		for (String mv : movies) {
			message += mv + "\n";
		}
		System.out.println(message);
	}


	public static void main(String[] args) {
		launch(args);
	}
}