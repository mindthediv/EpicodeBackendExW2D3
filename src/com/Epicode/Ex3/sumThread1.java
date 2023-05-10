package com.Epicode.Ex3;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class sumThread1 extends Thread {
	
	static Logger log = LoggerFactory.getLogger(sumThread1.class);
	int sum;
	List<Integer> list;
	
	public sumThread1(List<Integer> list) {
		this.list = list;
	}
	@Override
	public void run(){
		List<Integer> sumThis = list.subList(0,1000);
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

