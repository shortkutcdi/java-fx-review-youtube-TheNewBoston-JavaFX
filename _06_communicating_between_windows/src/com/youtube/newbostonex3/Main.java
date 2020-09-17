package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage window;
	private	Button button1; 
	private Scene scene;
	
	boolean result;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("thenewboston");

		button1 = new Button("Show alert box");
		button1.setOnAction(e -> {
			result = ConfirmBox.display("Title of window", "Are you sure you want to send naked pics?");
			System.out.println(result);
		});
		
		//layout 1 - children are laid out in vertical column
		StackPane layout1 = new StackPane();
		layout1.getChildren().addAll(button1);
		
		scene = new Scene(layout1, 400, 200);
		window.setScene(scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
