
package com.Epicode.Ex3;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class sumThread3 extends Thread {
	
	static Logger log = LoggerFactory.getLogger(sumThread3.class);
	int sum;
	List<Integer> list;
	
	public sumThread3(List<Integer> list) {
		this.list = list;
	}
	@Override
	public void run(){
		List<Integer> sumThis = list.subList(2000,3000);
		this.sum = sum(sumThis);
	}
	
	public int getSum() {
		return this.sum;
	}

	private int sum(List<Integer> list) {
		int sum = (int) list.stream().reduce(0,(a,b) -> a+b);
		return sum;
	}


}

