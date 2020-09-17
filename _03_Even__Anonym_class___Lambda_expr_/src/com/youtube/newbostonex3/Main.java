package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	private Button button1;
	private Button button2;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("premiere fenêtre");
//		primaryStage.setHeight(300);
//		primaryStage.setWidth(400);
		
		button1 = new Button("Click me");
		button1.setText("Clique-moi");
		
		// event Handler avec classe anonyme
		button1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println( ( (Button) event.getSource() ).getText().toString());
			}
		});
		
		button2 = new Button("Click me too");
		button2.setText("Clique-moi aussi");
		
		// event Handler avec lambda expression
		button2.setOnAction(event -> System.out.println("Button 2 clicked") );
		
		
		VBox root = new VBox();
//		root.getChildren().add(button1);
//		root.getChildren().add(button2);
		root.getChildren().addAll(button1, button2);
		
		Scene scene = new Scene(root, 100, 80);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
