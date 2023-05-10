package com.Epicode.Ex3;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class trEx1_1 extends Thread {
	private static Logger log = LoggerFactory.getLogger(trEx1_1.class);
	String symbol;
	public trEx1_1(String sym) {
		symbol = sym;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			log.info(symbol);
			try {
				trEx1_1.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
