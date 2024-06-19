package org.lessons.java.inheritance.shop;

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
		
	
}
