package com.youtube.newbostonex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Stage window;
	private Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("thenewboston");
		
		Parent root = (VBox) FXMLLoader.load(getClass().getResource("sample.fxml"));
		
		primaryStage.setScene(new Scene(root, 300, 275));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	
	
}
