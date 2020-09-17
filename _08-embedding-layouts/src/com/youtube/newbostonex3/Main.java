package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage window;
	private	Button buttonFile, buttonEdit, buttonView; 
	private	Button buttonD, buttonE, buttonF; 
	private Scene scene;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
		AnchorPane anchorPane = new AnchorPane();
		
		HBox topMenu = new HBox();
		buttonFile = new Button("File");
		buttonEdit= new Button("Edit");
		buttonView = new Button("VIew");
		topMenu.getChildren().addAll(buttonFile, buttonEdit, buttonView);
		
		VBox leftMenu = new VBox();
		buttonD = new Button("D");
		buttonE= new Button("E");
		buttonF = new Button("F");
		leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);
		
		anchorPane.getChildren().add(borderPane);
		
		scene = new Scene(anchorPane, 400, 200);
		window.setScene(scene);
		window.show();
	}
	


	public static void main(String[] args) {
		launch(args);
	}
}
