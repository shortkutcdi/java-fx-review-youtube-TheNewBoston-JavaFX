package com.youtube.newbostonex1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.control.RadioButton;


/*
 * https://www.geeksforgeeks.org/javafx-radiobutton-with-examples/ 
 */

public class SampleController implements Initializable {
	
	@FXML private Label firstLabel;
	@FXML private Label label;
	@FXML private Button button;
	@FXML private ToggleGroup toggleGroup;
	@FXML private RadioButton easyRB;
	@FXML private RadioButton mediumRB;
	@FXML private RadioButton hardRB;

	// propriétés permettant la liaison avec Main et Stage
	private Main main;
	private Stage stage;
	
	/**
	 * lier le controller à Main
	 * @param main
	 */
	public void setMain(Main main) {
		this.main = main;
	}
	
	/**
	 * lier le controller à Main et le Stage
	 * @param main
	 */
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.stage = primaryStage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("Loading user data...");
	}
	
	@FXML
	public void initialize() {
		System.out.println("initialize method");
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
		// button.setText("Stop touching me!");
		stage.close();
	}

}