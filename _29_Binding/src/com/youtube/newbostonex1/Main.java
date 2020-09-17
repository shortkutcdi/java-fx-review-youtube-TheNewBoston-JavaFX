package com.youtube.newbostonex1;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

		IntegerProperty x = new SimpleIntegerProperty(3); // 3 - valeur par défaut
		IntegerProperty y = new SimpleIntegerProperty();
		
		// la valeur de y est liée à x - par x*10 
		// --> qd x change y aussi
		y.bind(x.multiply(10));
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue() +"\n");

		x.setValue(5); // changer la valeur de x
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue() +"\n");
		
		button = new Button("Submit");
		
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
