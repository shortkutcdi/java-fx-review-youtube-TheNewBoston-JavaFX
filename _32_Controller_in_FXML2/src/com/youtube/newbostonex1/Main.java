package com.youtube.newbostonex1;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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
		
		//Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		
		mainWindow();
	}

	private void mainWindow() throws IOException {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\sample.fxml"));
			VBox pane = loader.load();
			
			// récupérer le controller
//			SampleController sampleController = loader.getController();
//			sampleController.setMain(this);
			
			Scene scene = new Scene(pane);
			
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
