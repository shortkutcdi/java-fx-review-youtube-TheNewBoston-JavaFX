# Utiliser FXML

## Class Main - Récupérer la vue et le pane parent

	FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\sample.fxml"));
	VBox pane = loader.load();

````java
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\sample.fxml"));
			VBox pane = loader.load();
			
			// récupérer le controller
//			SampleController sampleController = loader.getController();
//			sampleController.setMain(this);
			
			Scene scene = new Scene(pane);
			
			window.setScene(scene);
			window.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
````

## Lier la vue (fxml) à un controller

Dans le fichier fxml il faut déclarer dans le conteneur parent le controller
	
	fx:controller="classpath_du_controller"

````xml
	<VBox prefHeight="400.0" prefWidth="600.0" 	
			xmlns="http://javafx.com/javafx/11.0.1" 
			xmlns:fx="http://javafx.com/fxml/1" 	
			fx:controller="com.youtube.newbostonex1.SampleController">
````
			
Définir un id dans les balises des composants ``fx:id="label"`` pour les utiliser ds le controller

et ajouter une méthode listener à un bouton ``onAction="#handleButton"``

    <Label fx:id="label" text="I love bacon" />
    <Button fx:id="button" onAction="#handleButton" text="Submit" />
    
## VUE - récupérer une propriété d'un composant dans un autre ${firstLabel.text}

le label id:label recopie le texte du label id:firstLabel avec ``text="${firstLabel.text}"``

    <Label fx:id="firstLabel" text="I love bacon" />
    <Label fx:id="label" text="${firstLabel.text}" />   
    
## VUE - lier une propriété avec plusieurs composants

on lie la propriété ``fx:id="fruits"`` à tous les RadioButton ``toggleGroup="$fruits"`` 
avec ``$<nomPropiete>``

exemple avec des RadioButton

````xml
   <RadioButton fx:id="easyRB" text="Easy">
      <toggleGroup>
         <ToggleGroup fx:id="toggleGroup" />
      </toggleGroup>
   </RadioButton>
   <RadioButton fx:id="mediumRB"  text="Medium" toggleGroup="$toggleGroup" />
   <RadioButton fx:id="hardRB" text="Hard" toggleGroup="$toggleGroup" />
````

ou 

````xml
    <fx:define>
    	<ToggleGroup fx:id="toggleGroup" />
    </fx:define>
    
   <RadioButton fx:id="easyRB" text="Easy" toggleGroup="$toggleGroup" />
   <RadioButton fx:id="mediumRB"  text="Medium" toggleGroup="$toggleGroup" />
   <RadioButton fx:id="hardRB" text="Hard" toggleGroup="$toggleGroup" />
````
			
## Controller - liaison avec la VUE

Déclarer les composants `déclarés avec un id dans la vue

````java
	@FXML
	private Label label;
	@FXML
	private Button button;
````
	
Ainsi que les méthodes listener, ici handleButton

````java
	@FXML
	public void handleButton(ActionEvent event) {
		System.out.println("Clicked");
		button.setText("Stop touching me!");
	}	
````

## Lier la classe Main à un controller

### 1. Dans le controller

On ajoute la propriétée main, ainsi que stage (si on veut fermer l'appli à partir du controller par ex)

--> ajout de setter  

````java
	private Main main;
	private Stage stage;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.stage = primaryStage;
	}
````

### 2. Dans Main - récupérer le controller et setter le main

````java
	// charger la vue - récupérer le pane parent
	FXMLLoader loader = new FXMLLoader(Main.class.getResource("\\sample.fxml"));
	VBox pane = loader.load();
	
	// récupérer le controller - le lier à Main avec setMain(this)
	// ou setMain(this, primaryStage) - pour le lier aussi au stage
	SampleController sampleController = loader.getController();
	sampleController.setMain(this);
````

## initialisation d'un controller - implements Initializable

L'implémentation de Initialisable permet d'ajouter la méthode initialize 
pour initialiser les éléments de la vues...

````java
public class SampleController implements Initializable {
	
	@FXML
	private Label label;


	private Main main;
	private Stage stage;
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	public void setMain(Main main, Stage primaryStage) {
		this.main = main;
		this.stage = primaryStage;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) { 	//<<<<<<<<<<<<<<<<<<<<<<
		System.out.println("Loading user data...");
	}
````

