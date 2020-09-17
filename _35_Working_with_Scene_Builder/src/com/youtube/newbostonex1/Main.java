package com.youtube.newbostonex1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Stage window;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("thenewboston");
		
		
		mainWindow();
	}

	private void mainWindow() throws IOException {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("sample.fxml"));
			BorderPane pane = loader.load();
			
			// récupérer le controller le lier avec Main (et window)
//			SampleController sampleController = loader.getController();
//			sampleController.setMain(this);
//			sampleController.setMain(this, window);
			
			Scene scene = new Scene(pane, 800, 500);
			
			window.setScene(scene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
	
	
	
}
