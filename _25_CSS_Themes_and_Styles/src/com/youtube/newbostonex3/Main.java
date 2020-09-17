package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * https://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm#JFXLY118
 * 
 * https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/apply-css.htm#CHDGHCDG
 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
 * http://tutorials.jenkov.com/javafx/css-styling.html
 */

public class Main extends Application {
	private Stage window;
	private	Button loginButton; 
	private TextField nameInput;
	private TextField password;
	private Scene scene;
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10, 10, 10, 10));
		grid.setVgap(8);  // espace entre les éléments vert
		grid.setHgap(10); // espace entre les éléments horiz

		// GridPane.setConstraints(child, columnIndex, rowIndex);
		
		// Name label
		Label nameLabel = new Label("Username");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		// Name input
		nameInput = new TextField();
		nameInput.setPromptText("Your name here");
		GridPane.setConstraints(nameInput, 1, 0);
		nameLabel.setOnMouseClicked(e -> nameInput.requestFocus() );
		
		// Password label
		Label passwordLabel = new Label("Password");
		passwordLabel.setOnMouseClicked(e -> password.requestFocus());
		GridPane.setConstraints(passwordLabel, 0, 1);
		
		// Password Input
//		PasswordField password = new PasswordField();
		password = new TextField();
		password.setPromptText("Password here");
		GridPane.setConstraints(password, 1, 1);
		
		// Login button
		loginButton = new  Button("Login");
		GridPane.setConstraints(loginButton, 1, 2);
		
		
		grid.getChildren().addAll(nameLabel, nameInput, passwordLabel, password, loginButton);
		
		scene = new Scene(grid, 400, 200);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		window.setScene(scene); 
		window.show();
	}
	


	public static void main(String[] args) {
		launch(args);
	}
}