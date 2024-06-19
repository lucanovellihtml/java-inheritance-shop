package org.lessons.java.inheritance.shop;

//SUBCLASS
public class Smartphone extends Prodotto{

	//VARIABILI
	protected String codeImei;
	protected int disk;
	
	//COSTRUTTORE
	public Smartphone(String name, String type, double price, double iva, String codeImei) {
		super(name, type, price, iva);
		this.codeImei = codeImei;
		this.disk = (int)(Math.random() * 1000);
	}

	//METODI GETTER/SETTER
	public String getCodeImei() {
		return codeImei;
	}

	public void setCodeImei(String codeImei) {
		this.codeImei = codeImei;
	}

	public int getDisk() {
		return disk;
	}

	public void setDisk(int disk) {
		this.disk = disk;
	}
	
	
	
	
	
}
