# initialisation d'un controller - implements Initializable

L'implémentation de Initialisable permet d'ajouter la méthode initialize 
pour initialiser les éléments de la vues...

Exécute la méthode ``initialize()`` après avoir chargé la vue afin de : 

- initialiser des composants
- récupérer des données via BDD
- enregistrer des fichiers
- charger des éléments

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
}	
````