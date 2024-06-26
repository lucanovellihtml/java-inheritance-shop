package org.lessons.java.inheritance.shop;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		
		/*
		 * VIENE PRESO L'INPUT DA TASTIERA PER CONTROLLARE IL TIPO DI PRODOTTO;
		 * IL METODO "checkInputProduct" CONTROLLA IL TIPO DI PRODOTTO E QUALI CARATTERISTICHE RICHIEDERE ALL'UTENTE;
		 * VENGONO STAMPATE LE CARATTERISTICHE DEL PRODOTTO;
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci [1]Smartphone, [2]Televisore, [3]Cuffia =");
		Object oggetto = new Object();
		Utility.checkInputProduct(input.nextInt(),oggetto);
	}

}
