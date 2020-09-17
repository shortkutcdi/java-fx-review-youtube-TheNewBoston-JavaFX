package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
 * https://docs.oracle.com/javafx/2/ui_controls/menu_controls.htm#BABGHADI
 * http://tutorials.jenkov.com/javafx/menubar.html
 */

public class Main extends Application {
	private Stage window;
	private	Button button;
	private Scene scene;
	
	private MenuBar menuBar;
	private Menu fileMenu, editMenu, viewMenu;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
		menuBar = new MenuBar();
		
		// file menu
		fileMenu = new Menu("File");
		
		// menu file items
		//MenuItem 
		fileMenu.getItems().add(new MenuItem("New Project..."));
		fileMenu.getItems().add(new MenuItem("New Module..."));
		fileMenu.getItems().add(new MenuItem("Import Project..."));
		
		editMenu = new Menu("Edit");
		viewMenu = new Menu("View");
        
		menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu);
		
		// Main Layout - add table and hbox (input + buttons)
//		VBox layout = new VBox(10); // 10 px espacement
		BorderPane layout = new BorderPane();
		layout.setTop(menuBar);
		//layout.getChildren().addAll();
		
		scene = new Scene(layout, 400, 400);
		window.setScene(scene); 
		window.show();
	}
	


	public static void main(String[] args) {
		launch(args);
	}
}