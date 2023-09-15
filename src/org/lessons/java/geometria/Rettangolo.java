package org.lessons.java.geometria;



public class Rettangolo {
	public int base;
	public int height;
	
	public Rettangolo (int base, int height) {
		
		this.base = base; 
		this.height = height; 	
	}
	
	public int calcolaArea() {
		return base * height;
	}
	
	public int calcolaPerimetro() {
		return (base*2) + (height *2);
	}


}
