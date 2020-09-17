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

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\sample.fxml"));
		VBox pane = loader.load();
		
		SampleController sampleController = loader.getController();
		sampleController.setMain(this); // set the Main class to the controller

		window.setTitle("thenewboston");
		
		Scene scene = new Scene(pane);
			
		window.setScene(scene);
		window.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	
	
}
