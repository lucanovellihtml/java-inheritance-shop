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
	
	
	//METODO CHECK TELEVISORE SMART
	public void getCheckTvSmart(boolean smart) {
		
		if(smart)
			System.out.println("- TIPOLOGIA ---> SMART");
		else
			System.out.println("- TIPOLOGIA ---> NON SMART");	
	}

	
	//METODO PER STAMPARE LE CARATTERISTICHE DEL PRODOTTO
	@Override
	public String toString() {	
		return "- CODICE:" + this.code + "\n - NOME: " + this.name + "\n - MARCA: " + this.type + "\n - PREZZO SENZA IVA: " + this.price + "\n - SMART: " + this.smart + "\n - POLLICI: " + this.dimension;
	}
}
