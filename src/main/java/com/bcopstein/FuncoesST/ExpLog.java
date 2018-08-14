package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpLog {
	
	ArrayList <Double> lst = new ArrayList<>();

	public Iterator<Double> getTermos(){
		Iterator<Double> iter = lst.listIterator();
		return iter;
	}
	
	public double exp(double x) {
		int i = 0;
		do{
			double term = Math.pow(x, i)/Util.fatorial(i); 
			lst.add(term);
			i++;
		}while(lst.get(i) < 10e-6);
		
		return Util.somatorio(0, i, lst);
	}

	public double log(double x) {
		int i = 0;
		do{
			double term = (Math.pow(-1, i)/(i+1)) * Math.pow(x, i+1);
			lst.add(term);
			i++;
		}while(Math.abs(x) < 1);
		return Util.somatorio(0, i, lst);
	}
}
