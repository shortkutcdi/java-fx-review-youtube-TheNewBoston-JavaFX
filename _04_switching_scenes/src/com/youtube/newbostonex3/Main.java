package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage window;
	Scene scene1, scene2;
	Label label1, label2;
	Button button1, button2; 
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("premiere fenêtre");
		
		label1 = new Label("Welcome to the first scene");
		button1 = new Button("Go to the Scene 2");
		button1.setOnAction(e -> window.setScene(scene2) );
		
		//layout 1 - children are laid out in vertical column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 400, 200);
		
		// Button 2
		label2 = new Label("Welcome to the second scene");
		button2 = new Button("Go to the Scene 1");
		button2.setOnAction(e -> window.setScene(scene1) );
		
		
		//layout 2
		HBox layout2 = new HBox(10);
		layout2.setPadding(new Insets(10));
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 320, 100 );
		
		window.setScene(scene1);
		window.setTitle("Change Scene");
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
