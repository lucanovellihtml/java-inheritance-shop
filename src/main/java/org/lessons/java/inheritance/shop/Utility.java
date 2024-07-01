package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Utility {

	//METODO CHE RESTITUISCE IL PREZZO COMPRENSIVO D'IVA
	public static void getPriceIva(Double iva, double price) {
		iva = (price/100) * iva;
		System.out.printf("- IVA CALCOLATA ---> %.3f€ \n", iva);
		System.out.printf("- PREZZO CON IVA ---> %.3f€ \n", (price + iva)); 
	}
	
	
	//METODO CHE RESTITUISCE IL NOME-CODICE
	public static void getNameCode(int code, String name) {
		System.out.println("- NOME ESTESO ---> " + code + "-" + name);
	}
	
	
	//METODO PAD LEFT
	public static void getPadLeftCode(int code) {
		
		//CAST DA INT A STRING
		int codeLength = String.valueOf(code).length();
		String codeZero = "";
		String codeProduct = String.valueOf(code);
		
		//CONTROLLO SE LA LUNGHEZZA E' MINORE DI OTTO PER AGGIUNGERE GLI ZERI
		if(codeLength < 8) {
			for(int i = codeLength; i < 8 ; i++) {
				codeZero += "0";
			}
		}
		
		//CAST DA STRING A INT
		codeZero += codeProduct;
		
		System.out.printf("- LUNGHEZZA CODE ---> " + codeZero + "\n");
	}
	
	
	/*
	 * VIENE CONTROLLATO QUALE PRODOTTO HA SCELTO L'UTENTE DA INSERIRE NEL CARRELLO;
	 * COME PARAMETRO VIENE PASSATO ANCHE UN OGGETTO GENERICO CHE VERRA' TIPIZZATO IN BASE AL CASE PRESO IN CONSIDERAZIONE;
	 */
	public static void checkInputProduct(int choose, Object oggetto) {
		
		Scanner characteristics = new Scanner(System.in);
		System.out.println("- INSERISCI LA NOME DEL PRODOTTO ---> ");
		String name = characteristics.nextLine();
		System.out.println("- INSERISCI LA MARCA DEL PRODOTTO ---> ");
		String type = characteristics.nextLine();
		
		
		switch(choose) {
		case 1:
			System.out.println("-*-*-*- HAI SCELTO SMARTPHONE -*-*-*- ");
			System.out.println("- INSERISCI IL CODE-IMEI DEL PRODOTTO ---> ");
			String codeImei = characteristics.nextLine();
			oggetto = new Smartphone(name, type, 100.99, 25, codeImei);
			System.out.println("- PRODOTTO ---> \n" + oggetto.toString());
			break;
		case 2: 
			System.out.println("-*-*-*- HAI SCELTO TELEVISORE -*-*-*- ");
			System.out.println("- INSERISCI SE IL PRODOTTO E' SMART [1]SI', [2]NO ---> ");
			int chooseSmart = characteristics.nextInt();
			boolean flagSmart = false;
			if(chooseSmart == 1)
				flagSmart = true;
			oggetto = new Televisore(name, type, 200.99, 25, flagSmart);
			System.out.println("- PRODOTTO ---> \n" + oggetto.toString());
			break;
		default:
			System.out.println("-*-*-*- HAI SCELTO CUFFIA -*-*-*- ");
			System.out.println("- INSERISCI IL COLORE DEL PRODOTTO ---> ");
			String color = characteristics.nextLine();
			System.out.println("- INSERISCI SE IL PRODOTTO E' WIRELESS [1]SI', [2]NO ---> ");
			int chooseWireless = characteristics.nextInt();
			boolean flagWireless = false;
			if(chooseWireless == 1)
				flagSmart = true;
			oggetto = new Cuffia(name, type, 200.99, 25, color, flagWireless);
			System.out.println("- PRODOTTO ---> \n" + oggetto.toString());
			break;
		}
		
	}
	
	
}
