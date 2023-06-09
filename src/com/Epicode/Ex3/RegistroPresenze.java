package com.Epicode.Ex3;
import java.util.*;
import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.*;

public class RegistroPresenze {
	static Logger log = LoggerFactory.getLogger(RegistroPresenze.class);
	HashMap<String, Integer> elenco;
	
	public HashMap<String, Integer> getElenco(){
		return this.elenco;
	};
	public void setElenco( HashMap<String, Integer> elenco){
		this.elenco = elenco;
	};
	public RegistroPresenze(HashMap<String,Integer> elenco) {
		this.elenco = elenco;
	}
	public void salvaRegistro() throws IOException {
		File registro = new File("elenco/elenco.txt");
		FileUtils.write(registro,scriviElenco(),"UTF-8");
		System.out.println("Registro salvato:");
		System.out.println(this.elenco.toString());
	}
	static HashMap<String, Integer> mappaElenco = new HashMap<String, Integer>();
	public HashMap<String, Integer> caricaRegistro() throws IOException {
		File registro = new File("elenco/elenco.txt");
		String elenco = FileUtils.readFileToString(registro,"UTF-8");
		String[] userPresenceList = elenco.split("#");
		
		for(int i = 0; i < userPresenceList.length ; i++) {
			String[] coppia = userPresenceList[i].split("@");
			mappaElenco.put(coppia[0], Integer.parseInt(coppia[1]));
		}
		setElenco(mappaElenco);
		System.out.println("Registro caricato:");
		System.out.println(this.elenco);
		return mappaElenco;
	}
	
	static String elencoScritto = "";
	private String scriviElenco() {
		this.elenco.forEach((str,i) -> { 
			elencoScritto += (str + "@" + i + "#");
			});
		return elencoScritto;
	}
}
