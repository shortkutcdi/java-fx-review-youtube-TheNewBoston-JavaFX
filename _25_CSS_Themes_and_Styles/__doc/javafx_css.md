# JavaFX css

Documentation :

 * [user-interface-tutorial](https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/apply-css.htm#CHDGHCDG)
 * [JavaFX css reference](https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html)
 * [jenkov - css styling](http://tutorials.jenkov.com/javafx/css-styling.html)

## ajouter un fichier css à la scene

Les règles css commencent par ``-fx-``

on a placé un dossier resources/styles dans lequel on a placé un fichier css styles.css

	packages
		Main class
			/resources
					/styles
						+ style.css
avec Idea

````java
scene.getStylesheets().add("style1/button-styles.css");						
````

Avec eclipse - getClass().getResource().toExternalForm()
						
````java					
scene.getStylesheets().add(getClass().getResource("resources/styles/style.css").toExternalForm());
````

## exemple fichier style.css

Rappel : Les règles css commencent par ``-fx-``

pour styliser un composant il suffit d'appeler la classe correspondante .<nom-composant-en-minuscules>

par exemple styliser les Label .label - les Button .button ...

````css
/*  pas supporté : @charset "UTF-8"; */

.root {
/*	-fx-background-color: red;*/
 	-fx-background-color: #383838; 
	-fx-font-size: 11pt;
	/* -fx-text-fill:  et pas -fx-color:*/
}

.label {
	-fx-text-fill: #fff; 
}

.button {
	-fx-background-color: #ab4642;
	-fx-text-fill: #fff; 
	-fx-background-radius: 3;
}

.button-blue {
	-fx-background-color: #7cafc2;
	-fx-text-fill: #fff; 
	-fx-background-radius: 3;
}

#bold-label {
	-fx-font-wieght: bold;
	-fx-text-fill: red; 
}			
````

##	Ajouter/supprimer une classe à un composant

Ajouter une classe à un bouton ``.getStyleClass().add("nom-classe")``

````java
signUpButton.getStyleClass().add("button-blue");
````

Supprimer une classe à un composant ``.getStyleClass().remove("nom-classe")``

````java
signUpButton.getStyleClass().remove("button-blue");
````

## ajouter un id à un composant

ajout avec .setId("identifiant")

````java
passwordLabel.setId("bold-label");	
````

## définir un style à un composant

````java
nameLabel.setStyle("-fx-text-fill: #b0cff7; -fx-font-size: 8pt");
````

	
