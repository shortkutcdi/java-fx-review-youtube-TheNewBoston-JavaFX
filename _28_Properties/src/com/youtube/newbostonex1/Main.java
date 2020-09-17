package com.youtube.newbostonex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	private Stage window;
	private Button button;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		primaryStage.setTitle("thenewboston");

		Person bucky = new Person();
		
		bucky.firstNameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Name changed to " + newValue);
			System.out.println("fistNameProperty(): " + bucky.firstNameProperty());
			System.out.println("getFirstName(): " + bucky.getFirstName());
		});
		
		button = new Button("Submit");
		button.setOnAction(e -> bucky.setFirstName("Porky") );
		
		
		StackPane root = new StackPane();
		root.getChildren().add(button);
		
		
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
