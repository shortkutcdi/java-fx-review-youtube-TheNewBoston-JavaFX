package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
 * https://docs.oracle.com/javafx/2/ui_controls/table-view.htm#CJAGAAEE
 */

public class Main extends Application {
	private Stage window;
	private	Button button;
	private TextField nameInput, priceInput, quantityInput;
	private Scene scene;
	
	private TableView<Product> table; 

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
        //Name column
        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
        //Price column
        TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        //Quantity column
        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        
        // instantiate TableView, add products data, define columns
        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        // layout for inputs and buttons
        HBox hbox = new HBox();
//        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(20,20,20,0));
        hbox.setSpacing(10);
        
        // name input
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(100);
        
        // price input
        priceInput = new TextField();
        priceInput.setPromptText("Price");
        priceInput.setMinWidth(100);
        
        // quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("Quatity");
        quantityInput.setMinWidth(100);
        
        // buttons
        Button addButton = new Button("Add");
        Button deleteButton = new Button("Delete");

        // add inputs and buttons
        hbox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);
        
		
		// Main Layout - add table and hbox (input + buttons)
//		VBox layout = new VBox(10); // 10 px espacement
		VBox layout = new VBox(); 
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(table, hbox);
		
		scene = new Scene(layout);
		window.setScene(scene); 
		window.show();
	}
	
	// get all ofthe products
	public ObservableList<Product> getProduct() {
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("Laptop", 859.0, 20));
		products.add(new Product("Bouncy Ball", 2.49, 198));
		products.add(new Product("Toilet", 99.00, 74));
		products.add(new Product("The Notebook DVD", 19.99, 12));
		products.add(new Product("Corn", 1.49, 856));
		
		return products;
	}

	public static void main(String[] args) {
		launch(args);
	}
}