package com.youtube.newbostonex3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox {
	
	private static	Button yesButton, noButton;;
	private static Label labelMessage;
	private static Scene scene;
	
	static boolean answer;
	
	public static boolean display(String tiltle, String message) {
		Stage window = new Stage();
		
		window.initModality(Modality.WINDOW_MODAL);
		window.setTitle(tiltle);
		window.setMinWidth(280);
		
		labelMessage = new Label(message);
		
		// create buttons
		yesButton = new Button("Yes");
		noButton = new Button("No");

		yesButton.setOnAction(e -> {
			answer = true;
			window.close();
		});
		noButton.setOnAction(e -> {
			answer = false;
			window.close();
		});

		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10));
		HBox hboxButtons = new HBox();
		hboxButtons.getChildren().addAll(yesButton, noButton);
		layout.getChildren().addAll(labelMessage, hboxButtons); 
		layout.setAlignment(Pos.CENTER);
		
		scene = new Scene(layout);
		window.setScene(scene);
		
		window.showAndWait();
		
		return answer;
	}

}