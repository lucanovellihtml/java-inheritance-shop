package org.lessons.java.inheritance.shop;

//SUBCLASS
public class Cuffia extends Prodotto{

	
	//VARIABILI
	protected String color;
	protected boolean wireless;
	
	//COSTURTTORE
	public Cuffia(String name, String type, double price, double iva, String color, boolean wireless) {
		super(name, type, price, iva);
		this.color = color;
		this.wireless = wireless;
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


	//METODO CHECK CUFFIA WIRELESS O WIRED
	public void getCheckWiredWireless(boolean wireless) {
		
		if(wireless)
			System.out.println("- TIPOLOGIA ---> WIRELESS");
		else
			System.out.println("- TIPOLOGIA ---> CON CAVO");	
	}
	
	
	
}
