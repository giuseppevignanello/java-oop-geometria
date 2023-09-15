package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rettangolo[] rettangles = new Rettangolo[3]; 
		
		System.out.println("Insert base and height for three rettangles");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Base rettangle " + (i + 1) + ": ");
			int base = sc.nextInt();
			System.out.println("Height rettangle " + (i + 1) + ": ");
			int heigth = sc.nextInt();
			
			rettangles[i] = new Rettangolo(base, heigth);
			
		}
		
		for (int i = 0; i < rettangles.length; i++) {
			System.out.println("Rettangle " + (i+1) + " base: " + rettangles[i].base);
			System.out.println("Rettangle " + (i+1) + " height: " + rettangles[i].height);
			System.out.println("Rettangle " + (i+1) + " perimeter: " + rettangles[i].calcolaPerimetro());
			System.out.println("Rettangle " + (i+1) + " area: " + rettangles[i].calcolaArea());
			System.out.println();
			rettangles[i].draw();
			System.out.println();
		} 
	}
}
