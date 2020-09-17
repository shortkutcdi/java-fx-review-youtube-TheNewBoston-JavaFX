package com.youtube.newbostonex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("premiere fenêtre");
		primaryStage.setHeight(300);
		primaryStage.setWidth(400);
		
		Button button = new Button("Click me");
		button.setText("Clique-moi");
		
		StackPane root = new StackPane();
		root.getChildren().add(button);
		
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
