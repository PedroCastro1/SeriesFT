package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trig {
	
	ArrayList <Double> lst = new ArrayList<>();

	public Iterator<Double> getTermos(){
		
		Iterator<Double> iter = lst.listIterator();
		
		return iter;
	}

	public double cos(double x) {
		int i = 0;
		do {
			double cos = (Math.pow(-1, i)/Util.fatorial(2*i)) * Math.pow(x, 2 * i);
			lst.add(cos);
		}while(lst.get(i) < 10e-6);
		return Util.somatorio(0, i, lst);
	}

	public double sin(double x) {
		int i = 0;
		do {
			double sin = (Math.pow(-1, i)/Util.fatorial((2*i)+1)) * Math.pow(x, (2 * i)+1);
			
		}while(lst.get(i) < 10e-6);
		return Util.somatorio(0, i, lst);
	}
}
