package com.youtube.newbostonex3;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/*
 * https://docs.oracle.com/javafx/2/ui_controls/tree-view.htm#BABDEADA
 */

public class Main extends Application {
	private Stage window;
	private	Button button; 
	private Scene scene;
	
	/*
	  tree (TreeView) - listener .getSelectionModel().selectedItemProperty()
	 	root(TreeItem) - hide with tree.setShowRoot(false)
	 		bucky (TreeItem)
	 			thenewboston (TreeItem)
	 			...
 			megan (TreeItem)
 				glitter (TreeItem)
 				...
	 */	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX - thenewboston");
		
		TreeView<String> tree;
		
		TreeItem<String> root, bucky, megan;
		
		// root
		root = new TreeItem<String>();
		root.setExpanded(true);
		
		// bucky
		bucky = makeBranch("Bucky", root);
		makeBranch("thenewboston", bucky);
		makeBranch("youtube", bucky);
		makeBranch("Chicken", bucky);
		//bucky.setExpanded(true);
		
		// megan
		megan = makeBranch("Megan", root);
		makeBranch("Glitter", megan);
		makeBranch("Makeup", megan);
		
		// Create tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		// listener on tree
		tree.getSelectionModel().selectedItemProperty()
			.addListener( (ChangeListener<TreeItem<String>>) (observable, oldValue, newValue) -> {
				if (newValue != null) {
					System.out.println(newValue.getValue());
				}
			});
		
		// Layout
		VBox layout = new VBox(10); // 10 px espacement
		layout.setPadding(new Insets(20));
		layout.getChildren().add(tree);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene); 
		window.show();
	}


	private TreeItem<String> makeBranch(String name, TreeItem<String> parent) {
		TreeItem<String> treeItem = new TreeItem<String> (name);
		treeItem.setExpanded(true);
		parent.getChildren().add(treeItem);
		return treeItem;
	}


	public static void main(String[] args) {
		launch(args);
	}
}