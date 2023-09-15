package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rettangolo[] rectangles = new Rettangolo[3]; 
		
		System.out.println("Insert base and height for three rettangles");
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Base rettangle " + (i + 1) + ": ");
			int base = sc.nextInt();
			System.out.println("Height rettangle " + (i + 1) + ": ");
			int heigth = sc.nextInt();
			
			rectangles[i] = new Rettangolo(base, heigth);
			
		}
		
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println("Rectangle " + (i+1) + " base: " + rectangles[i].base);
			System.out.println("Rectangle " + (i+1) + " height: " + rectangles[i].height);
			System.out.println("Rectangle " + (i+1) + " perimeter: " + rectangles[i].calcolaPerimetro());
			System.out.println("Rectangle " + (i+1) + " area: " + rectangles[i].calcolaArea());
			System.out.println();
			rectangles[i].draw();
			System.out.println();
		} 
	}
}
