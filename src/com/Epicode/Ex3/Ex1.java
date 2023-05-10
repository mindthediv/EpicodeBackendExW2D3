package com.Epicode.Ex3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Ex1 {
	static Logger log = LoggerFactory.getLogger(Ex1.class);
	
	static Thread tr1 = new Thread();
	
	public static void main(String[] args) {
		trEx1_1 tr1, tr2;
		tr1 = new trEx1_1("*");
		tr2 = new trEx1_1("#");
		tr1.start();
		tr2.start();

	}

}
