package org.lessons.java.inheritance.shop;

import java.util.Scanner;

//SUPERCLASSE
public class Prodotto {

	//VARIABILI
	protected int code;
	protected String name, type;
	protected double price, iva;
	
	
	//COSTRUTTORE
	public Prodotto(String name, String type, double price, double iva) {
		this.code = (int) (Math.random() * 1000);
		this.name = name;
		this.type = type;
		this.price = price;
		this.iva = iva;
	}

	
	//METODI GETTER/SETTER
	public int getCode() {
		return code;
	}

	//NON ACCESSIBILE
	private void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//METODO PER OTTENERE PREZZO BASE
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	
	//METODO PER STAMPARE LE CARATTERISTICHE DEL PRODOTTO
	@Override
	public String toString() {	
		return "- CODICE:" + this.code + "\n - NOME: " + this.name + "\n - MARCA: " + this.type;
	}
		
}
