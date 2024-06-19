package org.lessons.java.inheritance.shop;

//SUBCLASS
public class Televisore extends Prodotto{

	
	//VARIABILI
	protected boolean smart;
	protected int dimension;
		
	//COSTRUTTORE
	public Televisore(String name, String type, double price, double iva, boolean smart) {
		super(name, type, price, iva);
		this.smart = smart;
		this.dimension = (int)(Math.random() * 100);
	}

	
	//METODI GETTER/SETTER
	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	
	
	
}
