package org.lessons.java.inheritance.shop;

//SUBCLASS
public class Cuffia extends Prodotto{

	
	//VARIABILI
	protected String color;
	protected boolean wireless, wired;
	
	//COSTURTTORE
	public Cuffia(String name, String type, double price, double iva, String color, boolean wireless, boolean wired) {
		super(name, type, price, iva);
		this.color = color;
		this.wireless = wireless;
		this.wired = wired;
	}

	
	//METODI GETTER/SETTER
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean isWired() {
		return wired;
	}

	public void setWired(boolean wired) {
		this.wired = wired;
	}
	
	
	
	
}
