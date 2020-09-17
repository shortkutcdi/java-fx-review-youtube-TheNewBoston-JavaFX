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
import javafx.scene.control.TextField;


/*
 * https://www.geeksforgeeks.org/javafx-radiobutton-with-examples/ 
 */

public class SampleController implements Initializable {
	
	@FXML private Button loginBtn;
	@FXML private TextField usernameTxt;
	@FXML private TextField passwordTxt;

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
		System.out.println("Initialize method");
		
	}
	
	@FXML 
	public void loginButtonClicked() {
		System.out.println("User logged in...");
		
		if (usernameTxt != null) {
			System.out.println("Username: " + (usernameTxt.getText().isEmpty()? "empty field" : usernameTxt.getText()));
		}
//		usernameTxt.clear();
//		passwordTxt.clear();
	}

}