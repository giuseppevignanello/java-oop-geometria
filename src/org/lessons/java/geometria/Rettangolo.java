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
	
	
	public void draw() {
	    for (int i = 0; i < height; i++) {
	        for (int j = 0; j < base; j++) {
	            if (i == 0 || i == height - 1 || j == 0 || j == base - 1) {
	                System.out.print("0"); 
	            } else {
	                System.out.print(" "); 
	            }
	        }
	        System.out.println(); 
	    }
	}



}
