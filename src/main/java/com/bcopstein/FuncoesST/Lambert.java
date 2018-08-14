package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambert {
	ArrayList <Double> lst = new ArrayList<>();

	public Iterator<Double> getTermos(){
		Iterator<Double> iter = lst.listIterator();
		return iter;
	}
	
	public double W0(double x) {
		if(Math.abs(x) < 1/Math.E) throw new IllegalArgumentException();
		int i = 0;
		do {
			double lampert = (Math.pow(-i, i-1)/Util.fatorial(i)) * Math.pow(x, i);
			lst.add(lampert);
		}while(lst.get(i) < 10e-6);
		
		return Util.somatorio(0, i, lst);
	}
}
