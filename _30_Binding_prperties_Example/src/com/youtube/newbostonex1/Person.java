package com.youtube.newbostonex1;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/*
 * you can treat properties as an object
 * and add them to a listener
 * 
 * you can also bind 2 properties together
 */

public class Person {
	
	private StringProperty firstName = new SimpleStringProperty(this, "firstname", "");
	
	// return the StringProperty object
	public final StringProperty firstNameProperty() {
		return this.firstName;
	}
	
	// return the firstname value (ie. "Bucky")
	public final String getFirstName() {
		return this.firstNameProperty().get();
	}
	
	// set the firstName value
	public final void setFirstName(final String firstName) {
		this.firstNameProperty().set(firstName);
	}
	
	
}
