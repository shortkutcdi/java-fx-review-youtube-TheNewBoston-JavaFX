package com.youtube.newbostonex2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent>{
	private Button button1;
	private Button button2;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("premiere fenêtre");
		primaryStage.setHeight(300);
		primaryStage.setWidth(400);
		
		button1 = new Button("Click me");
		button1.setText("Clique-moi");
		button1.setOnAction(this);
		
		button2 = new Button("Click me too");
		button2.setText("Clique-moi aussi");
		button2.setOnAction(this);
		
		VBox root = new VBox();
//		root.getChildren().add(button1);
//		root.getChildren().add(button2);
		root.getChildren().addAll(button1, button2);
		
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		if (event.getSource()==button1) {
			System.out.println("Bouton 1 click");
		}
		if(event.getSource().equals(button2)){
			System.out.println("bouton 2");
		}
	}

}
