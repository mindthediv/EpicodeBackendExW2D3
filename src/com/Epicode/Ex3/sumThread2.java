package com.Epicode.Ex3;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class sumThread2 extends Thread {
	
	static Logger log = LoggerFactory.getLogger(sumThread2.class);
	int sum;
	List<Integer> list;
	
	public sumThread2(List<Integer> list) {
		this.list = list;
	}
	@Override
	public void run(){
		List<Integer> sumThis = list.subList(1000, 2000);
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

