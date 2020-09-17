package com.youtube.newbostonex3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	private static	Button closeButton;
	private static Label labelMessage;
	private static Scene scene;
	
	public static void display(String tiltle, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.WINDOW_MODAL);
		window.setTitle(tiltle);
		window.setMinWidth(280);
		
		closeButton = new Button("Close the window");
		labelMessage = new Label(message);
		closeButton.setOnAction(e -> window.close() );

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10));
		layout.getChildren().addAll(labelMessage, closeButton); 
		layout.setAlignment(Pos.CENTER);
		
		scene = new Scene(layout);
		window.setScene(scene);
		
		window.showAndWait();
	}

}
