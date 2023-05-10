package com.Epicode.Ex3;

import java.io.IOException;
import java.util.HashMap;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> elenco = new HashMap<String,Integer>();
		elenco.put("Mario Rossi", 7);
		elenco.put("Micheal Jackson", 2);
		elenco.put("Shaq O'Neil", 10);
		elenco.put("Spongebob Squarepants", 7);
		elenco.put("Elon Musk", 3000);
		RegistroPresenze registro = new RegistroPresenze(elenco);
		registro.salvaRegistro();
		registro.caricaRegistro();		
		
		
	}
}
