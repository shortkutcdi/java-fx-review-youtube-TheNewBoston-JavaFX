package com.youtube.newbostonex1;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/*
 * https://www.geeksforgeeks.org/javafx-radiobutton-with-examples/ 
 */

public class SampleController {
	
	@FXML
	private Label label;
	@FXML
	private Button button;
	@FXML
	private ToggleGroup fruits;
	@FXML
	private RadioButton apple;
	@FXML
	private RadioButton orange;
	@FXML
	private RadioButton apple_pie;

	private Main main;
	private Stage stage;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.stage = primaryStage;
	}
	
	@FXML
	public void initialize() {
		System.out.println("initialize method");
		System.out.println(apple.isSelected());
		// orange.setSelected(true);
		fruits.selectedToggleProperty().addListener((ChangeListener<Toggle>) (observable, oldValue, newValue) -> {
			RadioButton rb = (RadioButton) fruits.getSelectedToggle();
			System.out.println("Selected value: " + rb.getText());
			//System.out.println("New value: " + newValue.toString());
			
		});
	}

	public SampleController() {
		//System.out.println(apple.isSelected());
		
//		fruits.selectedToggleProperty().addListener((ChangeListener<Toggle>) (observable, oldValue, newValue) -> {
//			// TODO Auto-generated method stub
//			
//		});
	}
	
	@FXML
	public void handleButton(ActionEvent event) {
		System.out.println("Clicked");
		button.setText("Stop touching me!");
	}
}
