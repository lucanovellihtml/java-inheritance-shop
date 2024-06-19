package org.lessons.java.inheritance.shop;


public class Main {

	public static void main(String[] args) {
		
		/*
		   - OGGETTO SMARTPHONE;
		   - METODO CHE RESTITUISCE IL PREZZO BASE;
		   - METODO CHE CALCOLA IL PREZZO CON PARTITA IVA;
		   - METODO CHE RESTITUISCE IL NOME ESTESO;
		   - METODO CHE RESTITUISCE IL CODICE IMEI;
		   - METODO CHE RESTITUISCE LA QUANTITA' DI MEMORIA;
		   - METODO CHE AGGIUNGE N° ZERI SE IL CODICE HA UNA LUNGHEZZA INFERIORE A 8 CIFRE, PER ARRIVARE A UNA LUNGHEZZA PARI A OTTO CIFRE;
		 */
		System.out.println("-*-*-*-*-*- SMARTPHONE -*-*-*-*-*-");
		Smartphone phone = new Smartphone("Samsung", "Cellulare", 200.99, 10, "IMEI 356356-00-111444-1");
		System.out.printf("- PREZZO BASE ---> %.3f€ \n", phone.getPrice());
		Utility.getPriceIva(phone.getIva(), phone.getPrice());
		Utility.getNameCode(phone.getCode(), phone.getName());
		System.out.println("- CODICE IMEI ---> " + phone.getCodeImei());
		System.out.println("- MEMORIA ---> " + phone.getDisk());
		Utility.getPadLeftCode(phone.getCode());
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- \n");
		
		
		/*
		   - OGGETTO TELEVISORE;
		   - METODO CHE RESTITUISCE IL PREZZO BASE;
		   - METODO CHE CALCOLA IL PREZZO CON PARTITA IVA;
		   - METODO CHE RESTITUISCE IL NOME ESTESO;
		   - METODO CHE RESTITUISCE I POLLICI;
		   - METODO CHE RESTITUISCE SE LA TV E' SMART OPPURE NO;
		   - METODO CHE AGGIUNGE N° ZERI SE IL CODICE HA UNA LUNGHEZZA INFERIORE A 8 CIFRE, PER ARRIVARE A UNA LUNGHEZZA PARI A OTTO CIFRE;
		 */
		System.out.println("-*-*-*-*-*- TELEVISORE -*-*-*-*-*-");
		Televisore tv = new Televisore("Sony", "Televisione", 500.99, 10, true);
		System.out.printf("- PREZZO BASE ---> %.3f€ \n", tv.getPrice());
		Utility.getPriceIva(tv.getIva(), tv.getPrice());
		Utility.getNameCode(tv.getCode(), tv.getName());
		tv.getCheckTvSmart(tv.isSmart());
		System.out.println("- POLLICI ---> " + tv.getDimension());
		Utility.getPadLeftCode(tv.getCode());
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- \n");

		
		/*
		   - OGGETTO CUFFIA;
		   - METODO CHE RESTITUISCE IL PREZZO BASE;
		   - METODO CHE CALCOLA IL PREZZO CON PARTITA IVA;
		   - METODO CHE RESTITUISCE IL NOME ESTESO;
		   - METODO CHE RESTITUISCE IL COLORE;
		   - METODO CHE RESTITUISCE SE LA CUFFIA E' WIRELESS OPPURE CON IL CAVO;
		   - METODO CHE AGGIUNGE N° ZERI SE IL CODICE HA UNA LUNGHEZZA INFERIORE A 8 CIFRE, PER ARRIVARE A UNA LUNGHEZZA PARI A OTTO CIFRE;
		 */
		System.out.println("-*-*-*-*-*- CUFFIA -*-*-*-*-*-");
		Cuffia cuffia = new Cuffia("LG", "Cuffia", 20.99, 10, "NERA", true);
		System.out.printf("- PREZZO BASE ---> %.3f€ \n", cuffia.getPrice());
		Utility.getPriceIva(cuffia.getIva(), cuffia.getPrice());
		Utility.getNameCode(cuffia.getCode(), cuffia.getName());
		cuffia.getCheckWiredWireless(cuffia.isWireless());
		System.out.println("- COLORE ---> " + cuffia.getColor());
		Utility.getPadLeftCode(cuffia.getCode());
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}

}
