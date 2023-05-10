package com.Epicode.Ex3;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ex2 {
	static Logger log = LoggerFactory.getLogger(Ex1.class);
	public static void main(String[] args) {
		List<Integer> list = getRandom();
		System.out.println("Somma stimata: " + sumProof(list) );
		
		sumThread1 tr1 = new sumThread1(list);
		sumThread2 tr2 = new sumThread2(list);
		sumThread3 tr3 = new sumThread3(list);
		tr1.start();
		tr2.start();
		tr3.start();
		try {
			
			tr1.join();
			tr2.join();
			tr3.join();
			int sum;
			sum = tr1.getSum() + tr2.getSum() + tr3.getSum();
			System.out.println("Somma ottenuta: " + sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		
		
	}
	
	public static List get3000() {
		List list = new ArrayList();
		for(int i = 0 ; i < 3000 ; i++) {
			list.add(1);
		}
		return list;
	}
	public static List getRandom() {
		List list = new ArrayList();
		for(int i = 0 ; i < 3000 ; i++) {
			list.add((int) Math.floor(Math.random()*10 + 1));
		}
		return list;
	}
	
	static int sumProof = 0;
	public static int sumProof(List<Integer> list) {
		list.forEach(el -> {
			sumProof += el;
		});
		return sumProof;
	}
}
